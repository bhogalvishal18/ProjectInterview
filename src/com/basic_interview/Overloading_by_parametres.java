/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic_interview;

import sun.font.StrikeCache;

/**
 *
 * @author Vishal
 */
public class Overloading_by_parametres {
    public int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public int add(int a,int b,int c)
    {
        int sum=a+b+c;
        return  sum;
    }
    public static void main(String...k)
    {
        Overloading_by_parametres ob=new Overloading_by_parametres();
        System.out.println("Sum of two number "+ob.add(20, 30));
        System.out.println("Sum of three number "+ob.add(7, 8, 9));
    }
}
/*
Sum of two number 50
Sum of three number 24
*/