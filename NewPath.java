import java.util.Arrays;
public class NewPath {
    public static void main(String[] args) {
        Solution solu = new Solution();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        solu.removeElement(nums,val);
        String s = "abcabcbb";
        Solution1 solu1 = new Solution1();
        System.out.println(solu1.lengthOfLongestSubstring(s));
    }
}

class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        int j = 0, k = 1;
        char first = s.charAt(j);
        char last = s.charAt(k);

        String longest = "";
        int maxLength = 1;

        for(int i = 0; i < s.length(); i++){
            if(j == s.length() || k == s.length()){
                break;
            }
            if(first != last){
                longest =  s.substring(j,k);
                last = s.charAt(++k);
            } else {
                first = s.charAt(++j);
                last = s.charAt(++k);
            }

            if(longest.length() > maxLength){
                maxLength = longest.length();
            }
        }
        return maxLength;
    }
}



class Solution {
    public int removeElement(int[] nums, int val) {
        int [] nums2 = new int[nums.length];
        int counter = 0, j = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                counter++;
                continue;
            } else {
                nums2[j] = nums[i];
                j++;
            }  
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums2[i];
        }
        System.out.println(Arrays.toString(nums2));
        return (nums.length-counter);
    }
}
