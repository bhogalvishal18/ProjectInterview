/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructure;

/**
 *
 * @author Vishal
 */
public class Runner {
 public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.insertAtStart(25);
		
		list.insertAt(0, 55);
		
		list.deleteAt(2);
		
		list.show();
}   
}
/*
55
25
45
12
*/