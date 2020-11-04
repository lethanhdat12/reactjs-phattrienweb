/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hcn;

import java.util.Scanner;

/**
 *
 * @author NWA15
 */
public class bai11 {
   protected double chieuDai,chieuRong,chuVi,dienTich;
   Scanner input = new Scanner(System.in);
   public void nhap()
   {
       System.out.println("Nhập chều dài hình chữ nhật");
       chieuDai = input.nextDouble();
       System.out.println("Nhập chieuf rộng hình chuwx nhật");
       chieuRong = input.nextDouble();
   }
   public void xuat()
   {
       System.out.println("Chiều dài và chiều rộng của hình chữ nhật lần lượt là" + chieuDai + "và" + chieuRong);
   }
   public static void main (String[] args)
   {
       bai11 hinh = new bai11();
       hinh.nhap();
       hinh.xuat();
   }
}
