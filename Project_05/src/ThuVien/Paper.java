/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThuVien;

/**
 *
 * @author PC MSI
 */
public class Paper extends ThuVien {
    protected int taiBan;

      public Paper( String maTL, String tenTL, String NXB,int taiBan) {
            super(maTL, tenTL, NXB);
            this.taiBan = taiBan;
      }

      public int getTaiBan() {
            return taiBan;
      }

      public void setTaiBan(int taiBan) {
            this.taiBan = taiBan;
      }

      @Override
      public String toString() {
            return "Book{" + " Ma Tai Lieu: " + maTL + "--Ten Tai Lieu: " + tenTL + "--Nha Xuat Ban: " + NXB + "--Tai Ban: " + taiBan + '}';
      }

}
