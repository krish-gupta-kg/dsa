package Recursion;

public class Main
{
    public static void main(String[] args) {
        
    }
}


//Calculate product of first N natural Numbers

/* public class Main
{
    public static void main(String[] args) 
    {
        int ans = func(5);
        System.out.println(ans);
    }
    public static int func( int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n*func(n-1);
    }
} */

//Print number in reverse

/* public class Main
{
    public static void main(String[] args) 
    {
        func(5876543);
    }

    public static int func(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        System.out.print(n%10); // Print the last number
        return func(n/10); //Delete the last number
    }
} */


//Print Even Numbers from 2 to N 

/* public class Main
{
    public static void main(String[] args) 
    {
        int n = 10;
        func(2,n);
    }
    public static void func(int start,int n)
    {
        if(start > n)
        {
            return;
        }
        if(start % 2 == 0)
        {
            System.out.print(start + " ");
        }
        func(start +1,n);  //Increment start by 1 and call the function again similar to looping concept
    }
} */

//Count the number of digits of a number

/* public class Main{
    public static void main(String[] args) {
        int ans = func(14365132);
        System.out.println("Count of numbers is : " + ans);
    }

    public static int func(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return 1 + func(n/10);

    }
} */

//Count the sum of digits of a number

/* public class Main{
    public static void main(String[] args) {
        int result = func(12345);
        System.out.println(result);
    }
    public static int func(int n)
    {  
        if(n == 0)
        {
            return 0;
        }
        return (n%10) + func(n/10);   
    }
} */


/* Sum of first N natural Numbers

public class Main
{
    public static void main(String[] args) {
        int result = func(5);
        System.out.println(result);

    }

    public static int func(int n)
    { 
        if(n <= 0)
        {
            System.out.println("Not a natural number");
            return 0;
        }
        if(n == 1)
        {
            return 1;

        }
        return n+func(n-1);
        
    }
} */



//Print Hello my dear N times using Recursion 

/* public class Main
{
    public static void main(String[] args) {
        msg(5);


    }

    public static void msg(int n)
    {
        if(n == 0)
        {
            System.out.println("Empty");
        }
        for(int i = 0; i < n; i++)
        {
            System.out.println("Hello");
        }
    }
} */

// Printing number from  1 - n

/* public class Main{ 

    public static void func(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        func(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println();
        func(n);
    }
} 
*/
 

//Factorial 

/* 
    public class Main{
    int sum = 0;

    public static int func(int n)   
    {
        if(n == 0 | n == 1)
        {
            return 1;
        }
        return n * func(n-1);
    }

    public static void main(String[] args) {
        int n = func(5);
        System.out.println(n);
        func(n);
        
    }
} 
*/


//Sum of First N natural numbers

/* 
public class Main{

    public static int func(int n)
    {
        if(n <= 0)
        {
            return 0;
        }
        return n + func(n - 1);
    }
    public static void main(String[] args)
    {
        int n = 8;
        System.out.println(func(n));
    }
} 
*/


/*  
print the even number 2 to n
product of first n natural numbers 
print sum of array using recursion 
check if number is palindrome 

*/

