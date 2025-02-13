/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelim;

/**
 *
 * @author yielc
 */
public class lab_act1_arithmetic {
    public static void main(String[] args){
        int l = 10;
        int m = 4;
        int n = 6;
        int o = 3;
        
        int ll = l * m + n;
        int mm = (l - m) % n;
        int nn = (l + m + n) / o;
        int oo = l * n - (m - m);
        
        System.out.println("10 * 4 + 6 = " + ll);
        System.out.println("10 - 4 % 6 = " + mm);
        System.out.println("10 + 4 + 6 / 3 = " + nn);
        System.out.println("10 * 6 - 4 * 4 = " + oo);
    }
}
