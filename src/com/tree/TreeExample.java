/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tree;

/**
 *
 * @author Vishal
 */
public class TreeExample {

	public static void main(String[] args) {
		Node<String> root = createTree();
		printTree(root, " ");
	}

	private static Node<String> createTree() {
		Node<String> root = new Node<>("root");
				
		Node<String> node1 = root.addChild(new Node<String>("node 1"));
		Node<String> node2 = root.addChild(new Node<String>("node 2"));
                Node<String> node3 = root.addChild(new Node<String>("node 3"));
                Node<String> node4 = root.addChild(new Node<String>("node 4"));
		Node<String> node11 = node1.addChild(new Node<String>("node 11"));
                Node<String> node12 = node1.addChild(new Node<String>("node 12"));
                Node<String> node13 = node1.addChild(new Node<String>("node 13"));
                Node<String> node14 = node1.addChild(new Node<String>("node 14"));
                Node<String> node21 = node2.addChild(new Node<String>("node 21"));
                Node<String> node22 = node2.addChild(new Node<String>("node 22"));
                Node<String> node23 = node2.addChild(new Node<String>("node 23"));
                Node<String> node24 = node2.addChild(new Node<String>("node 24"));
                Node<String> node31 = node3.addChild(new Node<String>("node 31"));
                Node<String> node32 = node3.addChild(new Node<String>("node 32"));
                Node<String> node33 = node3.addChild(new Node<String>("node 33"));
                Node<String> node34 = node3.addChild(new Node<String>("node 34"));
                Node<String> node41 = node4.addChild(new Node<String>("node 41"));
                Node<String> node42 = node4.addChild(new Node<String>("node 42"));
                Node<String> node43 = node4.addChild(new Node<String>("node 43"));
                Node<String> node44 = node4.addChild(new Node<String>("node 44"));
                
                
                
                
		
		return root;
	}
	
	 private static <T> void printTree(Node<T> node, String appender) {
		  System.out.println(appender + node.getData());
		  node.getChildren().forEach(each ->  printTree(each, appender + appender));
	 }
}
