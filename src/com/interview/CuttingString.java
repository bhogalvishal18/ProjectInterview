/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

import java.util.Scanner;

/**
 *
 * @author Vishal
 */
public class CuttingString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter paragragh to Cut");
        String s=sc.nextLine();
        //String c=s.substring(0, 30);
        String[] words = s.split("\\W+");
        String result="";
        for(String l:words)
        {
            result=result+l+" ";
        }
        System.gc();
        try{
        System.out.println(result.substring(0, 10));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
