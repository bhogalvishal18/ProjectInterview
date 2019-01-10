/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic_interview;

/**
 *
 * @author Vishal
 */
public class Overloading_position_changing {
    public void print(int a,String b)
    {
        System.out.println("My name"+b+" and my age "+a);
    }
    public void print(String a,int b)
    {
        System.out.println("My name"+a+" and my age "+b);
    }
    public static void main(String...k)
    {
        Overloading_position_changing ob=new Overloading_position_changing();
        ob.print("Vishal", 24);
        ob.print(55, "Pankaj");
    }
            
}
/*
My nameVishal and my age 24
My namePankaj and my age 55
*/