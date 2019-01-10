/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

/**
 *
 * @author Vishal
 */
public class FindDublicate {
    public static void main(String...k)
    {
        int [] arr=new int[]{1, 2, 5, 5, 6, 6, 7, 2};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
               if((arr[i]==arr[j])&&(i!=j)) 
                       {
                       System.out.println("Dublicate Numbers:"+arr[j]);
                       }
            }
        }
    }
}
