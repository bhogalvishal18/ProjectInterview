/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructure;

import java.util.HashMap;

/**
 *
 * @author Vishal
 */
class Key
{
    String key;

    public Key(String key){
        this.key=key;
    }
    @Override
    public int hashCode()
    {
        int hash=(int)key.charAt(0);
        System.out.println("Hash Code for key  :"+key+" is"+hash);
        return  hash;
    }
    @Override
    public boolean equals(Object obj)
    {
        return  key.equals(((Key)obj).key);
    }
}
public class HashMapInternal {
    public static void main(String[] args) {
         HashMap map = new HashMap();
        map.put(new Key("vishal"), 20);
        map.put(new Key("sachin"), 30);
        map.put(new Key("vaibhav"), 40);
         System.out.println();
        System.out.println("Value for key sachin: " +
                            map.get(new Key("sachin")));
        System.out.println("Value for key vaibhav: " +
                            map.get(new Key("vaibhav")));
        
        System.out.println("-------------------------------");
   map.forEach((k,v) -> {System.out.println(v);});
    }
}
/*
Hash Code for key  :vishal is118
Hash Code for key  :sachin is115
Hash Code for key  :vaibhav is118

Hash Code for key  :sachin is115
Value for key sachin: 30
Hash Code for key  :vaibhav is118
Value for key vaibhav: 40
-------------------------------
30
20
40
*/