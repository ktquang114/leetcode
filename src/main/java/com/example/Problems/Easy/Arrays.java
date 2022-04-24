package com.example.Problems.Easy;

import java.util.ArrayList;

public class Arrays {
    
    public Arrays()
    {}

    public int findFirstMaxValue(int[] a)
    {
        int max = a[0];
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }

    public int findSecondMaxValue(int[] a)
    {
        int max = a[0];
        int max2 = a[0];
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
            else
            {
                if(max2 < a[i])
                {
                    max2 = a[i];
                }
            }
        }
        return max2;
    }

    public ArrayList[] twoSum(int[] nums, int target) {

        ArrayList arrayList = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length - 1; j++)
            {
                if(target == nums[i] + nums[j])
                {
                    arrayList.add(i,j);
                }
            }
        }
        return (ArrayList[]) arrayList.toArray();
        
    }
}
