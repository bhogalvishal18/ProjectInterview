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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class SortbyValueMAP  {
    public static  void print(Map<String,Integer> map)
    {
       for(Map.Entry<String,Integer> entry:map.entrySet()) 
       {
           System.out.println("Key "+entry.getKey()+"        Value "+entry.getValue());
       }
    }
    public static void main(String[] args) {
     Map<String,Integer> map =new HashMap<>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("Java2Novice", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        map.put("Why this kolavari", 93);
        System.out.println("-------Before Sorting------");
        print(map);
        System.out.println("-------After Sorting-------");
     Set<Entry<String,Integer>> set=map.entrySet();
     List<Entry<String,Integer>> list=new ArrayList<Entry<String, Integer>>(set);
     Collections.sort(list,new Comparator<Map.Entry<String,Integer>>()
     {
         @Override
         public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
         return (o2.getValue()).compareTo(o1.getValue());
         }
     });
     
        for(Map.Entry<String,Integer> entry:list) 
       {
           System.out.println("Key "+entry.getKey()+"        Value "+entry.getValue());
       }
    }

}
