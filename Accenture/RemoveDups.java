package Accenture;

public class RemoveDups 
{
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,6};
        int a = func(arr);
        for(int i = 0; i < a; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }

    public static int func(int [] arr)
    {
        int n = arr.length;
        if (n <= 1)
            return n;
      	
        int idx = 1; 
      
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
}



