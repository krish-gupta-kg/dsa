package Accenture;

import java.util.Arrays;
import java.util.HashMap;

public class FindOccurence {
    public static void main(String[] args) {
        int [] nums = {1,3,1,7};
        int [] queries = {1,3,2,4};
        int x = 1;

        FindOccurence obj = new FindOccurence();
        obj.func(nums, queries, x);
        System.out.println(Arrays.toString(obj.func(nums, queries, x)));

    }

    public int [] func(int [] nums, int [] queries, int x)
    {
        int [] answer = new int[queries.length];

        int count = 0;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == x)
            {
                count++;
                hm.put(count,i);
            }
        }

        for(int i = 0; i < queries.length; i++)
        {
            if(queries[i] > count)
            {
                answer[i] =-1;
            }
            else
            {
                answer[i] = hm.get(queries[i]);
            }
        }
        return answer;
    }


}
