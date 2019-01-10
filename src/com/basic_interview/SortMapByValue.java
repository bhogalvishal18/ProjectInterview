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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByValue
{
    public static boolean ASC = true;
    public static boolean DESC = false;

    public static void main(String[] args)
    {

        // Creating dummy unsorted map
        Map<String, Integer> unsortMap = new HashMap<String, Integer>();
        unsortMap.put("B", 55);
        unsortMap.put("A", 80);
        unsortMap.put("D", 20);
        unsortMap.put("C", 70);

        System.out.println("Before sorting......");
        printMap(unsortMap);

        System.out.println("After sorting ascending order......");
        Map<String, Integer> sortedMapAsc = sortByComparator(unsortMap, ASC);
        printMap(sortedMapAsc);


       // System.out.println("After sorting descending order......");
       // Map<String, Integer> sortedMapDesc = sortByComparator(unsortMap, DESC);
       // printMap(sortedMapDesc);

    }

    private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap, final boolean order)
    {

        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());
        System.out.println("hey baby :"+list.toString());

        // Sorting the list based on values
        Collections.sort(list, new Comparator<Entry<String, Integer>>()
        {
            public int compare(Entry<String, Integer> o1,
                    Entry<String, Integer> o2)
            {
                if (order)
                {
                    System.out.println(o1.getValue().compareTo(o2.getValue()));
                    System.out.println("Hey : "+o1.getValue()+"  Bye : "+o2.getValue());
                    return o1.getValue().compareTo(o2.getValue());
                }
                else
                {
                    System.out.println(o1.getValue().compareTo(o2.getValue()));
                        System.out.println("olaa : "+o1.getValue()+"  bulla : "+o2.getValue());
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
        });

        // Maintaining insertion order with the help of LinkedList
       Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    } 
    public static void printMap(Map<String, Integer> map)
    {
        for (Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
        }
    }
}
/*
Before sorting......
Key : A Value : 80
Key : B Value : 55
Key : C Value : 70
Key : D Value : 20
After sorting ascending order......
Key : D Value : 20
Key : B Value : 55
Key : C Value : 70
Key : A Value : 80
After sorting descending order......
Key : A Value : 80
Key : C Value : 70
Key : B Value : 55
Key : D Value : 20
*/