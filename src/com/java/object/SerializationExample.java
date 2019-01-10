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
import com.java.object.Data;
import java.io.FileOutputStream;
import java.io.*;
public class SerializationExample  extends Data{

    public SerializationExample(String n, int r, String c) {
        super(n, r, c);
     
    }
    public static void main(String[] args) {
        try
        {
            SerializationExample obj=new SerializationExample("Vishal", 104, "110044");
            FileOutputStream fos = new FileOutputStream("D:\\file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
