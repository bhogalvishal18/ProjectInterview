/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern;

/**
 *
 * @author Vishal
 */
public class NumberPattern {
    public static void printNums(int n)
    {
        int i, j,num;
 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
            // initialising starting number
            num=2;
 
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++)
            {
                // printing num with a space 
                System.out.print(i+ " ");
 
                //incrementing value of num
                num++;
            }
 
            // ending line after each row
            System.out.println();
        }
    }
    public static void printNumber(int n)
    {
         int i, j, num=5;
         
        // outer loop to handle number of rows
        // n in this case
        for(i=0; i<n; i++)
        {
 
            // without re assigning num
            // num = 1;
            //num = num + 1;
            for(j=0; j<=i; j++)
            {
                // printing num with a space
                System.out.print(j+ " ");
                 
                // incrementing num at each column
            }         

            for (j=n; j>i; j--) {
			System.out.print(num+" ");
                       
		}
  
                num = num + 1;   
            // ending line after each row
            System.out.println();
        }
    }
 public static void main(String...k)
 {
     int n=5;
     System.out.println("-------------------");
     printNums(n);
     System.out.println("-------------------");
     printNumber(n);
 }
}
