

public class Arrays {
    public static void main(String[] args) {
        int [] arr = {1,25,6,0,12,2,0,4,7};
        Func obj = new Func();
        obj.func(arr);
        for(int a : arr)
        {
            System.out.print(a);
        } 
    }
}

class Func
{
    void func(int [] arr)
    {
        int n = arr.length;
        int index = 0;
        for(int i = 0 ; i < n; i++)
        {
            if(arr[i] !=0)
            {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
    }
}

// Reversing an array
/* int [] a = {1,2,3,4,5};
for(int i = a.length-1; i >= 0; i--)
{
    System.out.print(a[i]);
}
 */

