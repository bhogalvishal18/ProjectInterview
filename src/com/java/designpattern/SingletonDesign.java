/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.designpattern;

/**
 *a singleton class is a class that can have only one object (an instance of the class) at a time.
 * @author Vishal
 */
class Singleton
{
    private static Singleton obj=null;
    public String s;
    private Singleton()
    {
        s="Hello I am here";
    }
    public  static  Singleton getInstance()
    {
        if(obj==null)
        {
            obj=new Singleton();
        }
     
        return  obj;
    }
}
public class SingletonDesign {
    public static void main(String[] args) {
        Singleton x=Singleton.getInstance();
        Singleton y=Singleton.getInstance();
        Singleton z=Singleton.getInstance();
        x.s=(x.s).toUpperCase();
         System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
 
        // changing variable of instance z
        z.s = (z.s).toLowerCase();
 
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        
        
    }
}
