/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ff;

/**
 *
 * @author User
 */
public class FF {
    public static int factorial(int n){
        if(n==0|| n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        
        int i=1;
        System.out.print(" "+factorial(i)+",");
        
    }
}
