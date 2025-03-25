
package MIDTERM;
 
 import java.util.Scanner;
public class basic_calculator {
    public static int additionNumber(int x , int y){
        return x+y; 
    }
    public static int subtractionNumber(int x , int y){
        return x-y;
    }
  public static int multiplicationNumber(int x, int y){ 
      return x*y;
  }
  public static int divisionNumber(int x, int y){
      return x/y;
  }
  public static float percentNumber(float x , float y){
      return (float)(x*y/100);
  }
  
    public static void main(String[] args){
         Scanner s = new Scanner (System.in);
         
         System.out.println();
         int x = 27, y = 18;
         System.out.println("The addition: "+ additionNumber(x,y));
         System.out.println("The subtraction: "+ subtractionNumber(x,y));
         System.out.println("The multiplication: "+ multiplicationNumber(x,y));
         System.out.println("The division: "+ divisionNumber(x,y));
         System.out.println("The percentage: "+ percentNumber(x,y));
    }
                
}                
         
                 
     
    
   

