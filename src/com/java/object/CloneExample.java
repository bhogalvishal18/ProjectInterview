/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.object;

/**
 *
 * @author Vishal
 */
public class CloneExample implements Cloneable {
    @Override
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
        
    }
    String name="Vishal is a developer";
    public static void main(String[] args) {
        CloneExample obj1=new CloneExample();
        try
        {
           CloneExample obj2=(CloneExample)obj1.clone();
           System.out.println(obj2.name);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
