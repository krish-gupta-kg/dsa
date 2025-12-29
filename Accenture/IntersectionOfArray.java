package Accenture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfArray 
{
    public static void main(String[] args) 
    {
        int [] nums1 = {1,2,3,4,6,0};
        int [] nums2 = {2,4,6,7,8,9};
        IntersectionOfArray obj = new IntersectionOfArray();
        obj.func(nums1, nums2);
        System.out.println(Arrays.toString(obj.func(nums1, nums2)));
    }

    public  int[] func(int[] nums1, int [] nums2)
    {
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int num : nums1)
        {
            hm.put(num, hm.getOrDefault(num,0) + 1);
        }

        List<Integer> al = new ArrayList<>();
        for(int num : nums2)
        {
            if(hm.containsKey(num))
            {
                al.add(num);
                hm.remove(num);
            }
        }

        int[] result = new int[al.size()];
        for( int i = 0; i < al.size(); i++)
        {
            result[i] = al.get(i);
        }
        return result;
    }
}   




    
        
       

    
