
package com.mycompany.saifalden;

import java.util.Scanner;


public class EX5 {

    
    public static void main(String[] args) {
       
        Scanner in = new Scanner (System.in);
        System.out.print("enter a number to check :");
        int i = in.nextInt();
        
        if (i%2==0){
            System.out.println("this number is even , " + i*2 );
        }
            else if (i%2 !=0){
                    System.out.println("this number is odd ," + i*i);
                    }
        
        
        
        
        
        
        
        
        
        
    }
    
}
