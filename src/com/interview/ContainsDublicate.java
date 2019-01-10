/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Vishal
 */
public class ContainsDublicate {
    public static boolean checkDuplicateUsingSet(String[] input)
    {
        List inputList=Arrays.asList(input);
        Set inputSet= new HashSet(inputList);
        if(inputSet.size()<inputList.size())
        {
            return true;
        }
        return false;
    }
   public static void main(String...k)
    {
        String[] withDuplicates = new String[] {"one","two","three","one"};
        String[] withoutDuplicates = new String[] {"one","two","three"};
        System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingSet(withDuplicates));
        System.out.println("Checking array without any duplicate using Set and List: " + checkDuplicateUsingSet(withoutDuplicates));

    }
}
