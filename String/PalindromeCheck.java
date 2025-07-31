package String;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text");
        String pal = sc.nextLine();
        int left = 0;
        int right = pal.length()-1;

        while(left < right)
        {
            char l = pal.charAt(left);
            char r = pal.charAt(right);
            if(!Character.isLetterOrDigit(l))
            {
                left++;
            }
            else if(!Character.isLetterOrDigit(r))
            {
                right--;
            }
            else if(Character.toLowerCase(l) != Character.toLowerCase(r))
            {
                System.out.println("Not a palindrome");
            }
            else
            {
                left++;
                right--;
            }

        }
    }
}
