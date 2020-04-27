/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.Sets;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Hp
 */
public class LinkedhashSet {

    /**
     LinkedHashSet: This implementation orders its elements based on insertion 
      order. So consider using a LinkedHashSet when you want to store
      unique elements in order.
     */
    public static void main(String[] args) {
        Set<String> hashset = new LinkedHashSet<String>() ;
        
         hashset.add("Hi ! ");
        hashset.add(" My");
        hashset.add(" name");
        hashset.add(" is");
        hashset.add(" Sourabh ");
        hashset.add(" M");
        hashset.add(" Zambre");
        hashset.add(" Sourabh ");
        hashset.add(" M");
        hashset.add(".");
        for (String x : hashset) {
            System.out.print(x);
        }
        
    }
    
}
