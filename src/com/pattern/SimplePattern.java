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

public class SimplePattern {
public static void printStar(int n)
{
for(int i=0;i<n;i++)
{ 
   
    for(int j=0;j<=i;j++)
    {
       System.out.print("* ");  
    }
    System.out.println("");
}
}
public static void printstarExtraSpace(int n)
{
    int i, j, k=2*n-2;
 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
 
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for(j=0; j<k; j++)
            {
                // printing spaces
                System.out.print(" ");
            }
             
            // decrementing k after each loop
            k = k - 2;
             
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }
             
            // ending line after each row
            System.out.println();
        }
}
public static void printTriangle(int n)
{
    int i, j, k=n;
 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
 
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for(j=0; j<k; j++)
            {
                // printing spaces
                System.out.print(" ");
            }
             
            // decrementing k after each loop
            k = k - 1;
             
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }
             
            // ending line after each row
            System.out.println();
        }
}
public static void printInvetedTriangle(int n)
{
    	int i,j,k,samp=1;
	
	for (i=5; i>=1; i--) {
		for (k=samp; k>=0; k--) {
			System.out.print(" ");
			// only 1 space
		}
		for (j=i; j>=1; j--) {
			System.out.print("*");
		}
		samp = samp + 1;
		System.out.print("\n");
	}
}
public static void main(String...k)
{
    System.out.println("--------------------");
    int m=5;
    printStar(m);
    System.out.println("--------------------");
    printstarExtraSpace(m);
    System.out.println("--------------------");
    printTriangle(m);
    System.out.println("--------------------");
    printInvetedTriangle(m);
}
}
