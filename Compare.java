import java.util.*;
public class Compare {
    public static void main(String[] args) {
        EqualRowColumnPairs obj = new EqualRowColumnPairs();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] grid = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        } 
        // Output
        System.out.println(obj.equalPairs(grid)); // Output
        sc.close();
    }
}
class EqualRowColumnPairs {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        // Compare each row with each column
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (isEqual(grid, row, col, n)) {
                    count++;
                }
            }
        }
        return count;
    }

    // Helper method to check if row r and column c are equal
    private boolean isEqual(int[][] grid, int r, int c, int n) {
        for (int i = 0; i < n; i++) {
            if (grid[r][i] != grid[i][c]) {
                return false;
            }
        }
        return true;
    }
}
