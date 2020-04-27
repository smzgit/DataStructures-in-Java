/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class ExamSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Hp\\Desktop\\QBank.txt")) ;
       Scanner sc = new Scanner(System.in) ;
       int Score = 0;
        for (String Line=null; (Line = br.readLine()) != null; ) {
            String[] arr = Line.split(";");
            System.out.println("Ques.  "+arr[0]);
            String[] opts = arr[1].split(",") ;
            
            for (String x:opts) {
                System.out.println("\t"+x);
            }
            System.out.print("\tAns : ");
            String ans = sc.next();
            
            if (ans.equalsIgnoreCase(arr[2])) {
                Score = Score + Integer.parseInt(arr[3]);
                System.out.println("Correct!! your get "+arr[3]+" points");
                System.out.println("Your Score is :"+Score);
            }
            else{
                System.out.println("InCorrect!!");
                System.out.println("Your Score is :"+Score);}
            
        }
    }
    
}
