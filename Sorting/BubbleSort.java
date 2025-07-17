package Sorting;

import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int [] a = {2,1,3,5,7,4};

        for(int i = 0; i < a.length - 1; i++) 
        {
            int swap = 0;


            for(int j = 1; j < a.length-i; j++)
            {
                if(a[j] < a[j-1])
                {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    swap = 1;
                }

            }
             if( swap == 0)
            {
                break;
            }

            System.out.println(Arrays.toString(a));
             
        }     
       
    }
}