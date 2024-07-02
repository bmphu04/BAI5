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
public class Book extends ThuVien {
    protected int soTrang;

      public Book( String maTL, String tenTL, String NXB,int soTrang) {
            super(maTL, tenTL, NXB);
            this.soTrang = soTrang;
      }

      public int getSoTrang() {
            return soTrang;
      }

      public void setSoTrang(int soTrang) {
            this.soTrang = soTrang;
      }

      @Override
      public String toString() {
            return "Book{" + " Ma Tai Lieu: "+ maTL + "--Ten Tai Lieu: "+tenTL+"--Nha Xuat Ban: "+NXB +"--So Trang: " + soTrang + '}';
      }
      
}
