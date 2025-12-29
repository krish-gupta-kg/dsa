package Accenture;

public class LargestValueInArray
{
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,3};
        System.out.println(func(arr));

    }

    public static int func(int [] arr)
    {
        int largestVal = 0;

        for(int i = 1; i < arr.length -1; i++)
        {
            if(largestVal < arr[i])
            {
                largestVal = arr[i];
            }
        }
        return largestVal;
    }
}