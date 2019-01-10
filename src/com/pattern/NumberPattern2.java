/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern;

import java.util.Scanner;

/**
 *
 * @author Vishal
 */
public class NumberPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            //Printing first half of the row
             
            for (int j = 1; j <= i; j++) 
            { 
                if(j%2 == 0)
                {
                    System.out.print(j-i+1);
                }
                else
                {
                    System.out.print(j+i-1);
                }
                //System.out.print(j+1+" "); 
            }
             
            //Printing second half of the row 
           /* 
            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(i+1+" ");
            }
             */
            System.out.println();
        }
         
        //Closing the resources
         
        sc.close();
    }
 
}
