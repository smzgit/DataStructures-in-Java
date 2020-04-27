/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.Sets;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Hp
 */
public class Hashset {

    /**
    HashSet: is the best-performing implementation and is a widely-used Set 
     implementation. It represents the core characteristics of 
     sets: no duplication and unordered.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<String> hashset = new HashSet<String>() ;
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
        System.out.println(hashset);
        
    }
    
}
