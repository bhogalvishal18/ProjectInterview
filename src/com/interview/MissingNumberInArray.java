/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

import java.util.Arrays;
import java.util.BitSet;

/**
 *
 * @author Vishal
 */
public class MissingNumberInArray {
     private static void printMissingNumber(int[] numbers, int count)
     {
         
         int missingCount=count-numbers.length;
         System.out.println("hey:"+missingCount+ "ok "+count);
          BitSet obj=new BitSet(count);
          for(int i:numbers)
          {
              obj.set(i-1);
              System.out.println(i-1);
          }
         // System.out.println("----------"+obj+"----------");
          /*System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
        Arrays.toString(numbers), count);  */
        int lastMissingIndex = 0;
         for (int i = 0; i < missingCount; i++) {
        lastMissingIndex = obj.nextClearBit(lastMissingIndex);
        System.out.println(++lastMissingIndex);
         }
 }
      private static int getMissingNumber(int[] numbers, int totalCount) {
     int expectedSum=totalCount*((totalCount+1)/2);
     int actualSum=0;
     for (int i : numbers) {
            actualSum += i;
        }
 
        return expectedSum - actualSum;
     }

    public static void main(String...k)
    {
        
            // one missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);
 
        // two missing number
       // printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);
 
        // three missing number
       // printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
 
        // four missing number
        //printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);
 
        // Only one missing number in array
        int[] iArray = new int[]{1, 2,4, 5};
        int missing = getMissingNumber(iArray, 5);
        //System.out.printf("Missing number in array %s is %d %n", Arrays.toString(iArray), missing);
  }
}
