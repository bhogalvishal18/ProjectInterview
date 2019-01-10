/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;
 
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    static final int INT_BITS = 32;
    static int maxSubarrayXOR(int set[], int n)
{
    // Initialize index of
    // chosen elements
    int index = 0;
 
    // Traverse through all
    // bits of integer
    // starting from the most
    // significant bit (MSB)
    for (int i = INT_BITS - 1; i >= 0; i--) 
    {
    // Initialize index of
    // maximum element and
    // the maximum element
    int maxInd = index;
    int maxEle = Integer.MIN_VALUE;
    for (int j = index; j < n; j++) {
         
        // If i'th bit of set[j]
        // is set and set[j] is
        // greater than max so far.
        if ((set[j] & (1 << i)) != 0 && set[j] > maxEle)
        {
        maxEle = set[j];
        maxInd = j;
        }
    }
 
    // If there was no
    // element with i'th
    // bit set, move to
    // smaller i
    if (maxEle == -2147483648)
        continue;
 
    // Put maximum element
    // with i'th bit set
    // at index 'index'
    int temp = set[index];
    set[index] = set[maxInd];
    set[maxInd] = temp;
 
    // Update maxInd and
    // increment index
    maxInd = index;
 
    // Do XOR of set[maxIndex]
    // with all numbers having
    // i'th bit as set.
    for (int j = 0; j < n; j++) {
         
        // XOR set[maxInd] those
        // numbers which have the
        // i'th bit set
        if (j != maxInd && (set[j] & (1 << i)) == 0)
        set[j] = set[j] ^ set[maxInd];
    }
 
    // Increment index of
    // chosen elements
    index++;
    }
 
    // Final result is
    // XOR of all elements
    int res = 0;
    for (int i = 0; i < n; i++)
    res ^= set[i];
    return res;
}
    public static void main(String args[] ) throws Exception {
     
        
        //Scanner
        Scanner s = new Scanner(System.in);
        int inp=s.nextInt();
        int []arr=new int[inp];
        for(int i=0;i<inp;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println(maxSubarrayXOR(arr,inp));
        
        
        
    }
}
