package Sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] a = {2,1,9,12,3,6};

        for(int i = 0; i < a.length - 1; i++)
        {
            for(int j = i + 1; j > 0; j--)
            {
                if(a[j] < a[j-1])
                {
                    int temp = a[j];
                    a[j] =  a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
