package DailyPrac;
import java.util.Scanner;

// SUM OF NATURAL NUMBER

public class DayFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number : ");
        int m = sc.nextInt();
        int sum = 0;
        
        for(int i = m; i>0; i--)
        {
            sum+= i;
        }
        System.out.println(sum);
        sc.close();
        
          
    }
}
