
package com.mycompany.saifalden;

import java.util.Scanner;


public class Ex3 {

    
    public static void main(String[] args) {
        
      Scanner in = new Scanner (System.in);
        System.out.print("enter the 1st number :");
        int i = in.nextInt();
        System.out.print("enter the 2nd number :");
        int t = in.nextInt();
        
        if (i>t){
            System.out.println("the number " + i + " is larger then " + t);
        }
        else if (t>i ){
             System.out.println("the number " + t +" is larger than " + i);
   
        }
        else {
            System.out.println("they are equal");
                }
    }
    
}
