package Accenture;

public class MissingNumber 
{
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6};
        System.out.println(func(arr));
    }

    public static int func(int [] arr)
    {
        int first = 0;
        int last = (arr.length*(arr.length+1)/2);
        for(int i : arr)
        {
            first += i;
        }
        int missingNumber = first - last;
        return missingNumber;
    }
}
