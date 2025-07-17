package String;
import java.util.Scanner;

//Find Substring
public class Main{
    public static void main(String[] args) {
        int n = 5;
        for(int i = n; i >=0; i--)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


/* Reversing string using StringBuilder

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder obj = new StringBuilder(str);
        obj.reverse();

        System.out.println(obj.toString());
    }
} */


//Reverse a string
/* public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reversedstring = " ";
        
        for(int i = input.length()- 1; i>=0 ; i--)
        {
            reversedstring = reversedstring + input.charAt(i); 
        }
        System.out.println("Reversed string : "+ reversedstring);
    }
    
} */
