package com.example;

import com.example.Problems.Easy.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void printIntOutput(int result)
    {
        System.out.println("result: " + result);
    }

    public static void main( String[] args )
    {
        int[] a = {4,2,6,3,1,5,9,7,8,0};
        Arrays arrays = new Arrays();
        printIntOutput(arrays.findSecondMaxValue(a));

    }
}
