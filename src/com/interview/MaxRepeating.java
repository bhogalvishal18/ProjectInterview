/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Vishal
 */
public class MaxRepeating {
    	// Returns maximum repeating element in arr[0..n-1].
	// The array elements are in range from 0 to k-1
	static int maxRepeating(int arr[], int n, int k)
	{
		// Iterate though input array, for every element
		// arr[i], increment arr[arr[i]%k] by k
		for (int i = 0; i< n; i++)
			arr[(arr[i]%k)] += k;

		// Find index of the maximum repeating element
		int max = arr[0], result = 0;
		for (int i = 1; i < n; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
				result = i;
			}
		}

		/* Uncomment this code to get the original array back
		for (int i = 0; i< n; i++)
		arr[i] = arr[i]%k; */

		// Return index of the maximum element
		return result;
	}
public static int getNthMostFrequent(int[] a) {
		  HashMap<Integer, Integer> map = new HashMap<>();
		  int maxCount=0, freqValue = -1;
		  for(int i=0; i < a.length; i++) {
		     if(map.get(a[i]) == null) {  //Insert new.
                         
		        map.put(a[i], 1);
		     }else { //Already exists. Just increment the count.
		        int count = map.get(a[i])+1;
                         
		        map.put(a[i], count);
                        System.out.println(count);
		       if(count > maxCount) {
		           maxCount = count;
		           freqValue = a[i];
		        }
		        
		     }
		 
		 }
		  	  //incase all numbers are unique.
		  //if(freqValue == -1 && a.length>;0)
		   //  return a[0];
		  return freqValue;
		}
		
	
	/*Driver function to check for above function*/
	public static void main (String[] args)
	{

		int arr[] = {2, 2, 1, 3, 4, 21,21,21,21,7};
		int n = arr.length;
		int k=8;
		System.out.println("Maximum repeating element is: " +
						maxRepeating(arr,n,k));
               // maxRepeating_List(arr);
               System.out.println(getNthMostFrequent(arr));
	}
}
