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
// Java program to illustrate creation of Object
// using new Instance
public class NewInstanceExample
{
	 String name = "Vishal is a developer";
	public static void main(String[] args)
	{
		try
		{
			Class cls = Class.forName("com.java.object.NewInstanceExample");
			NewInstanceExample obj =(NewInstanceExample)cls.newInstance();
			System.out.println(obj.name);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
