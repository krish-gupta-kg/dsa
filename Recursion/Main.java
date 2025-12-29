package Recursion;
//Find the base condition
//Break the problem into smaller problems
//Create the recursive tree

/* 
Basic Recursion

public class Main
    {
        public static void main(String[]args)
        {
            recursion(n);
        }

        static void recursion(int n)
        {
            if(n < 1) //Base Case
            {
                return;
            }

            System.out.println(n);

            recursion(n+1); //Tail

        }
    
    }
*/

//_____________________________________________________________________________

//Fibonnaci using recursion

/*  public class Main
{
    public static void main(String[] args) 
    {
        System.out.println(fibo(6));
    }

    static int fibo(int n)
    {
         if(n < 2) // Base condition
        {
            return n;
        }
        
        return fibo(n-1) + fibo(n-2); // Formula
    }
}
*/

//_____________________________________________________________________________

//Factorial using recursion

/* 
public class Main{
    public static void main(String[] args) {
        System.out.println(func(5));
    }
    static int func(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n * func(n - 1);
    }
}
*/

//_____________________________________________________________________________


// Printing number from  1 - n
/* 
 public class Main{ 

    public static void func(int n)
    {
        if(n == 0)
        {
            return;
        }
        func(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        func(5);
    }
}  
*/

//______________________________________________________________________________

// Printing number from  n - 1
/* 
 public class Main{ 

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
        func(5);
    }
} 
*/

//________________________________________________________________________________

//Sum of num
/* 

public class Main{
    public static void main(String[] args) {
        System.out.println(func(5));
    }

    public static int func(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return n + func(n-1);
    }
}

*/

//________________________________________________________________________________

//Count the sum of digits of a number

/* 
public class Main{
    public static void main(String[] args) {
        System.out.println(func(12345));
    }

    public static int func(int n)
    {  
        if(n == 0)
        {
            return 0;
        }

        return (n%10 + func(n/10));
    }
} 

*/

//________________________________________________________________________________

//Calculate product of first N natural Numbers

/* 
public class Main
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
} 
*/

//________________________________________________________________________________

//Print number in reverse

/*  
public class Main
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
}  */

//________________________________________________________________________________

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
}
*/

//________________________________________________________________________________

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
}
*/

//________________________________________________________________________________



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
}
*/ 


//______________________________________________________________________________
//recursionInArrays
       
//Find if array is sorted

/*  public class Main{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(func(arr, 0));
    }
    public static boolean func(int[] arr, int index)
    {
        if(index == arr.length -1)
        {
            return true;
        }

        return arr[index] < arr[index+1] && func(arr,index+1);
    }
}  */

//______________________________________________________________________________


//Linear Search 
/* 
 public class Main{
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,4};
        System.out.println(findIndex(arr,0,4));
    }

     public static boolean func(int [] arr, int index, int target)
    {
        if(index == arr.length)
        {
            return false;
        }
        return arr[index] == target || func(arr,index+1,target);
    } 

    public static int findIndex(int [] arr, int index, int target)
    {
        if(index == arr.length)
        {
            return -1;
        }
        if(index == target)
        {
            return index;
        }
        else
        {
            return findIndex(arr, index+1, target);
        }
    }

}  */


