/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;
import java.util.*;
/**
 *
 * @author Vishal
 */
public class SearchArray {
    private static boolean isContain(String[] arr,String find)
    {
        List obj=Arrays.asList(arr);
        if(obj.contains(find))
        {
            return true;
        }
        return false;
    }
    public static void main(String...k)
    {
        String[] names = new String[]{"JP", "KP", "RP", "OP", "SP"};
System.out.printf("Does array %s has %s?  %b %n", Arrays.toString(names), "JP", isContain(names, "JP"));


    }
}
