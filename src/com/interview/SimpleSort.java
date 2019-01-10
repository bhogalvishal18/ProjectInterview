/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Vishal
 */
public class SimpleSort {
    public static void main(String...k)
    {
        int a[] = {3,6,2,7,8,19,13,5};
        List isList = Arrays.asList(a);
	int n = a.length;
        int tem=0,sum=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    tem=a[i];
                    a[i]=a[j];
                    a[j]=tem;
                }    
            }
        }
        
        System.out.println("Sorted Array"+Arrays.toString(a));
        sum=a[a.length-4]+a[a.length-3];
        
        System.out.println("Third highest sum = "+sum);
    }
}
