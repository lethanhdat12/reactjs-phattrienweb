/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

/**
 *
 * @author NWA15
 */
import java.util.Scanner;
public class bai9{
    
        private
              int tu;
               int mau;
        public bai9(int tu, int mau)
        {
        this.tu = tu;
        this.mau = mau;
        
        }
        public int gettu()
        {
        return tu;
        }
        public int getmau()
        {
        return mau;
        }
        public void settu(int tu)
        {
        
            this.tu = tu;
        }
        public void setmau(int mau)
        {
        this.mau = mau;
        }
        public void congphanso(bai9 ps)
        {
        int ts = this.gettu()*ps.mau + ps.gettu()*this.getmau();
        int ms = this.getmau() * ps.getmau();
      bai9 phanSoThuong = new bai9(ts, ms);
     System.out.println("tong hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
        
        }
         public void truphanso(bai9 ps)
        {
        int ts = this.gettu()*ps.mau - ps.gettu()*this.getmau();
        int ms = this.getmau() * ps.getmau();
      bai9 phanSoThuong = new bai9(ts, ms);
     System.out.println("hieu hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
        }
     public void nhanphanso(bai9 ps)
        {
        int ts = this.gettu()* ps.gettu();
        int ms = this.getmau() * ps.getmau();
      bai9 phanSoThuong = new bai9(ts, ms);
     System.out.println("tich hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
        }
       public void chiaphanso(bai9 ps)
        {
        int ts = this.gettu()* ps.getmau();
        int ms = this.getmau() * ps.getmau();
      bai9 phanSoThuong = new bai9(ts, ms);
     System.out.println("Thương hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }
   
public static void main (String[] args)
  {
     
  bai9 phanso1 = new bai9(6,3);
  bai9 phanso2 = new bai9(4,2);
  Scanner input = new Scanner(System.in);
  
      phanso1.congphanso(phanso2);
       phanso1.truphanso(phanso2);
        phanso1.nhanphanso(phanso2);
         phanso1.chiaphanso(phanso2);
  
 
  }
 
}


