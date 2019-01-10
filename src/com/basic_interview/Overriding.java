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
 class Parent implements Cloneable
{  @Override
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
        
    }
    public void show()
    {
        System.out.println("Parent class show");
    }
}
class Child extends Parent
{
    public void show()
    {
        System.out.println("Child class show");
    }
}
public class Overriding {
    public static void main(String...k) throws CloneNotSupportedException
    {
       //Child ob=new Parent();
       // ob.show();
        //Parent cannot be converted to Child
        Parent ob1=new Parent();
        Parent ob2=(Parent)ob1.clone();
        //Child ob3=(Child)ob2.clone();
        Parent obj=new Child();
        obj.show();
        Parent ob=new Parent();
        ob.show();
    }
}
/*
Child class show
Parent class show
*/