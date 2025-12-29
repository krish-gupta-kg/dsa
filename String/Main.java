package String;
//import java.util.Scanner;

// the 

public class Main{
    public static void main(String[] args) {
        String A = "A";
        String B = "A";
        String C = A;
        System.out.println(C == A);
        System.out.println(A.equals(B));
        System.out.println(A.charAt(0 ));
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
