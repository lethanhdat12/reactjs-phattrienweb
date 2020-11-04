/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhgia;

/**
 *
 * @author NWA15
 */
import java.util.Random;
import java.util.Scanner;
public class bai8 {
  public static void main (String[] args)
    {
        Random rd = new Random();
        Scanner input = new Scanner(System.in);
        int ran= 0;
        int sothunhat = 0;
        int sothuhai= 0;
       int pheptinh;
             sothunhat = 1 + rd.nextInt(10);
            
            
            sothuhai = 1+rd.nextInt(10);
            
            ran = sothunhat + sothuhai;
           System.out.println(sothunhat+"+"+sothuhai+ " = " );
        pheptinh = input.nextInt();
        if(ran == pheptinh)
        {
            System.out.println("Very good!");
             System.out.println("Excellent!");
              System.out.println("Nice work!");
               
                System.out.println("Keep up the good work!");
   
        }
        else
        {
           System.out.println(" No. Please try again.");
           System.out.println("Wrong. Try once more.");
           System.out.println(ran);
           
           
     
        }
        
    }
 
}
