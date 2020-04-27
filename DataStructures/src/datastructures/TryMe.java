/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class TryMe {
    static ArrayList printPattern(int n,ArrayList all) 
    { 
        int j, k = 0; 
          // loop to decide the row number 
        for (int i = 1; i <= n; i++) { 
              // if row number is odd 
            if (i % 2 != 0) { 
                // print numbers with the '*'  
                // sign in increasing order 
                for (j = k + 1; j < k + i; j++) 
                    all.add(j + "*"); 
                all.add(j++ + "\n"); 
         // update value of 'k' 
                k = j; 
            } 
        // if row number is even 
            else { 
                 
                // update value of 'k' 
                k = k + i - 1; 
  
                // print numbers with the '*' in 
                // decreasing order 
                for (j = k; j > k - i + 1; j--) 
                    all.add(j + "*"); 
                all.add(j+ "\n"); 
            } 
        } 
        return all ;
    } 
   public static void main(String[] args) {
       
         ;
        ArrayList all = new ArrayList<String>();
        all  = printPattern(4,all) ; 
        for (int i = 0; i < all.size(); i++) {
            System.out.print(all.get(i));
       }
        for (int i = all.size()-1; i >0; i--) {
            System.out.print(all.get(i));
       }
       
         
    }

}
