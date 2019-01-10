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
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import javax.imageio.*;
public class JavaUrlConnection {
    
    public static BufferedImage fileRead(String url)
    {
        BufferedImage image = null;
        try {
            URL urls = new URL(url);
            image = ImageIO.read(urls);
        } catch (Exception e) {
        }
        return image;
    }
    public static  String  fileWriter(String url,BufferedImage image)
    {
        String fname=url.substring(url.lastIndexOf('/')+1, url.length());
        
        System.out.println(fname);
        
    	//BufferedImage image = null;
        try{    
           URL urls = new URL(url);
            image = ImageIO.read(urls);
            
            ImageIO.write(image, "jpg",new File("D:\\"+fname));
          }
        catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");  
      
        
        return "true";
    }
    public static void main(String[] args) {
        String url="http://localhost/img/1.jpg";
        System.out.println("----- Reading   File------");
   
    BufferedImage img=fileRead(url);
System.out.println("-----Writing File------");
        String s=fileWriter(url,img);
    }
}
