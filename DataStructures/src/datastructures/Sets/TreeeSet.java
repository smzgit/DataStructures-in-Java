/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.Sets;

import java.util.TreeSet;

/**
 *
 * @author Hp
 */
public class TreeeSet {

    /**
     sorts at run time
     */
    public static void main(String[] args) {
        // TODO code application logic here
         TreeSet<Integer> ts1 = new TreeSet<Integer>(); 
         ts1.add(12) ;
         ts1.add(1) ;
         ts1.add(132) ;
         ts1.add(412) ;
         ts1.add(112) ;
         ts1.add(67) ;
         System.out.println(ts1);
    }
    
}
