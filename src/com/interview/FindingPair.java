/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

import java.util.Arrays;

/**
 *
 * @author Vishal
 */
public class FindingPair
{
    public static void pairfind(int[] array, int sum) 
    {
        
 for(int i=0;i<array.length-1;i++)
 {int first = array[i];
     for(int j=i+1;j<array.length;j++)
     {int second = array[j];
        if ((first + second) == sum) {
                    System.out.printf("Pair having sum=%d is(%d, %d) %n", sum,first, second);
                }
      
     }
 }
    }
  public static void pairfind_pointer(int[] array,int s)
  {
      if(array.length<2)
      {
          return;
      }
      else
      {
          Arrays.sort(array);
          int left=0;
          int right=array.length-1;
          while(left<right)
          {
              int sum=array[left]+array[right];
              if(sum==s)
              {
                  System.out.printf("Pair having sum %d is(%d, %d) %n", s, array[left], array[right]);
                  left=left+1;
                  right=right-1;
              }else if(sum<s)
              {
                  left=left+1;
              }
              else if(sum>s)
              {
                 right=right-1; 
              }
      }
  }
  }
    public static void main(String...k)
    {
      int []num={2, 4, 3, 5, 7, 8, 9}; 
       int []dublicatenum={2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
      pairfind(num,7);
      System.out.println("------------0(n^2)-------------");
      pairfind(dublicatenum,7);
System.out.println("------------0(n^2)-------------");
System.out.println("------------0(nlog(n))-------------");
pairfind_pointer( new int[]{ 12, 14, 17, 15, 19, 20, -11}, 9);
System.out.println("------------0(nlog(n))-------------");
pairfind_pointer( new int[]{ 2, 4, 7, 5, 9, 10, -1}, 9); 


}
    }
