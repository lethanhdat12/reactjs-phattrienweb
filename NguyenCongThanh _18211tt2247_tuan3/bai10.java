/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawshape;

/**
 *
 * @author NWA15
 */
import java.util.Scanner;

public class bai10{
 
    public static void main (String[] args)
    {
      double xA, yA;  // tọa độ điểm A
    double xB, yB;  // tọa độ điểm B
    double dodaiAB; // độ dài đoạn thắng AB
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhập tọa độ điểm A: ");
    System.out.println("Nhập hoành độ điểm A:");
    xA = scanner.nextDouble();
    System.out.println("Nhập tung độ điểm A: ");
    yA = scanner.nextDouble();
         
    System.out.println("\nNhập tọa độ điểm B: ");
    System.out.println("Nhập hoành độ điểm B: ");
    xB = scanner.nextDouble();
    System.out.println("Nhập tung độ điểm B: ");
    yB = scanner.nextDouble();
         
    // tính độ dài AB
    dodaiAB = Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
    System.out.print("Độ dài đoạn thắng AB = " + dodaiAB);
   
    }
}
