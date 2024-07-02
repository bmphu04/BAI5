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
public class ThuVien {
     protected String maTL, tenTL, NXB;

      public ThuVien(String maTL, String tenTL, String NXB) {
            this.maTL = maTL;
            this.tenTL = tenTL;
            this.NXB = NXB;
      }

      public String getMaTL() {
            return maTL;
      }

      public void setMaTL(String maTL) {
            this.maTL = maTL;
      }

      public String getTenTL() {
            return tenTL;
      }

      public void setTenTL(String tenTL) {
            this.tenTL = tenTL;
      }

      public String getNXB() {
            return NXB;
      }

      public void setNXB(String NXB) {
            this.NXB = NXB;
      }
}
