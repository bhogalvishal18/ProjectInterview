/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vishal
 */
public class OddFrequencyArray {
    public static int[] allOdd(int[] array) {
    if (array.length < 2) {
        return array;
    }

    int[] sorted = array.clone();
    Arrays.sort(sorted);

    boolean odd = true;
    int len = 0;
    for (int i = 1; i < sorted.length; ++i) {
        if (sorted[i] == sorted[i - 1]) {
            odd = !odd;
        } else {
            if (odd) {
                sorted[len++] = sorted[i - 1];
            }
            odd = true;
        }
    }

    if (odd) {
        sorted[len++] = sorted[sorted.length - 1];
    }

    return Arrays.copyOf(sorted, len);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        int[] l={1 ,2 ,2 ,2, 1};
       int []res=allOdd(l);
       
       for(int i=0;i<res.length;i++)
       {
           System.out.println(res[i]);
       }
    }
}
