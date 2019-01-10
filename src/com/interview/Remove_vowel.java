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
public class Remove_vowel {
    static  void remove(String inp)
    {
      String tem=inp.replaceAll("[aeiouAEIOU]", "");
      System.out.println("Output");
        System.out.println(tem);
    }
   public static  void main(String...k)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input String");
        String s=sc.nextLine();
        remove(s);
    }
}
