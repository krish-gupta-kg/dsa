package DailyPrac;
import java.util.Scanner;

// SUM OF FACTORIAL 

public class DayThree {
    public static void main(String[] args) {
        Logic obj = new Logic();
        System.out.println(obj.logic());
    }
}

class Logic
{
    public int logic()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int fac = 1;
        int sum  = 0;

        if(m > n)
        {
            return 0;
        }

        for(int i = m; i <= n; i++)
        {
            for(int j = i; j <= i; j++)
            {
                fac *= i;
            }
            sum += fac;
        }
        return sum;
        
    }
}
