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
import java.util.*;
public class HashMapCompare {
    public static HashMap<Integer,String> map=null;
    public static HashMap<Integer,String> hm=null;
    public static void main(String[] args) {
        map=new HashMap<Integer,String>();
        map.put(1,"Vishal");
      //  map.put(2, "Kumar");
        
        hm=new HashMap<>();
        hm.put(1,"Vishal");
        System.out.println(map.equals(hm));
        
    }
}
