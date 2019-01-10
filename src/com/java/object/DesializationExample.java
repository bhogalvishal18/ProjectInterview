/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Vishal
 */
public class DesializationExample {
    public static void main(String[] args) {
        Data si=null ;
        try
        {
            FileInputStream fis = new FileInputStream("D:\\file.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            si = (Data)ois.readObject();
        }
        catch (Exception e)
        {
            e.printStackTrace(); }
            System.out.println(si.name);
            System.out. println(si.rid);
            System.out.println(si.contact);
        }
    
}
