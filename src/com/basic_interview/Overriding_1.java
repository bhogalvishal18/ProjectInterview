/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic_interview;


class Parents
{
	// private methods are not overridden
	private void m1() { System.out.println("From parent m1()");}
	
	protected void m2() { System.out.println("From parent m2()"); }
}

class Childs extends Parents
{
	// new m1() method
	// unique to Child class
	private void m1() { System.out.println("From child m1()");}
	
	// overriding method
	// with more accessibility
	@Override
	public void m2() { System.out.println("From child m2()");}
	
}

// Driver class
class Overriding_1
{
	public static void main(String[] args)
	{
		Parents obj1 = new Parents();
		obj1.m2();
		Parents obj2 = new Childs();
		obj2.m2();
	}
}
/*
From parent m2()
From child m2()
*/
