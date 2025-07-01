public class AllString {
    
    public static void main(String[] args) {
       
      
         String name = "Thathir";
        String nickname = new String("Senti");
        name.concat(" Mohammed");
        name = name.concat(" Mohammed");
        System.out.println("name (after concat): " + name);
        System.out.println("name (after assigning concat): " + name); 
        System.out.println("nickname" + nickname);
        String a = "Senti";
        String b = "Senti";
        String c = new String("Senti");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b)); 
        System.out.println( a.equals(c));
        String text = "  Mohammed Thathir ";
        System.out.println("Length: " + text.length());
        System.out.println("Trimmed: '" + text.trim() + "'"); 
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Substring (4 to 8): " + text.substring(6, 10)); 
        System.out.println("Replace 'Thathir' with 'Senti': " + text.replace("Thathir", "Senti"));
    }
}