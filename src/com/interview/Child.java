/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

/**
 *
 * @author Vishal
 */
class Parent
{
    public Parent()
    {
        System.out.println("Parent class no-args constructor called");
    }
    public Parent(String name)
    {
        System.out.println("Parent class Parameterized constructor called by "+name);
    }
}
public class Child extends Parent
{
    public Child()
    {
        this("JIP");
        System.out.println("Child class no-args constructor called");
    }
    public Child(String name)
    {
        super("JIP");
        System.out.println("Child class Parameterized constructor called by "+name);
    }
    public static void main(String args[])
    {
        Child c = new Child();
    }
}