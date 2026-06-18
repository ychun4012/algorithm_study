import java.util.Scanner;

public class Solution {
    static String result = "";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isLowerCase(ch)) {
            		char ch1 = Character.toUpperCase(ch);
            		result += ch1;
            } else if (Character.isUpperCase(ch)) {
            		char ch1 = Character.toLowerCase(ch);
            		result += ch1;
            } else {
                result += ch;
            }
        }
        System.out.println(result);
        
    }
}