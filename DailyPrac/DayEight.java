package DailyPrac;
import java.util.Scanner;

 // Given an array of integers, check whether the array is sorted in ascending order.

public class DayEight {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter values of array");
        for(int i =0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }        
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Define your array ");
        while(sc.hasNextInt())
        {
            int n = sc.nextInt();
            int [] arr = new int [n];
        } */
       Logic obj = new Logic();
       obj.func(arr);


    sc.close();

    }
}

class Logic
{
    public boolean func(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            if (arr[i] > arr[i + 1]) 
            {
                System.out.println("Not Sorted");
                return false;
            }
        }
        System.out.println("Sorted");
        return true;
    }
}
