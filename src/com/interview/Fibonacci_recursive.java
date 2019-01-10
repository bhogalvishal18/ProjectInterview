/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

import java.util.*;


/**
 *
 * @author Vishal
 */
public class Fibonacci_recursive {
    
    static  int fibonacci(int n)
    {
        if(n==0)
            return  0;
        else if(n==1)
            return  1;
      else
            return fibonacci(n-1)+fibonacci(n-2);
                
    }
    public static void main(String[] args) {
        int n, i = 0, c;
        Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
        for ( c = 1 ; c <= n ; c++ )
          {
              System.out.println(fibonacci(i));
              i++;
          }
    }
}
