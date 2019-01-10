/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.object;

import java.lang.reflect.Constructor;

/**
 *
 * @author Vishal
 */
public class ReflectionExample {
    private String name;

   
    public void setName(String name)
    {
        this.name=name;
    }
    public static void main(String[] args) {
        try
        {
            Constructor<ReflectionExample> con=ReflectionExample.class.getConstructor();
            ReflectionExample r=con.newInstance();
            r.setName("Vishal is a developer");
            System.out.println(r.name);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
