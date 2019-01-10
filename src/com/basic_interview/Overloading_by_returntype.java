/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic_interview;

/**
 *
 * @author Vishal
 * here we are changing data types of parameter
 */


public class Overloading_by_returntype {
    
    public int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public float add(float a,float b,float c)
    {
        float d=0;
        d=a+b+c;
        return d;
    }
    
    public static void main(String...k)
    {
       
       Overloading_by_returntype ob=new Overloading_by_returntype();
       System.out.println("Sum of two number "+ob.add(20, 30));
        float f=ob.add(7.0f,8.0f,9.7f);
        System.out.println("Sum of three number "+f);
    }
}
/*
Sum of two number 50
Sum of three number 24.7
*/