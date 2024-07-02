/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoiTuong;

/**
 *
 * @author PC MSI
 */
public class Student extends DoiTuong {
    protected String lopDoiTuong, banHocSinh;

    public Student(String lopDoiTuong, String banHocSinh, String maDoiTuong, String tenDoiTuong, String jobDoiTuong, boolean gioiTinh) {
        super(maDoiTuong, tenDoiTuong, jobDoiTuong, gioiTinh);
        this.lopDoiTuong = lopDoiTuong;
        this.banHocSinh = banHocSinh;
    }

    public String getLopDoiTuong() {
        return lopDoiTuong;
    }

    public void setLopDoiTuong(String lopDoiTuong) {
        this.lopDoiTuong = lopDoiTuong;
    }

    public String getBanHocSinh() {
        return banHocSinh;
    }

    public void setBanHocSinh(String banHocSinh) {
        this.banHocSinh = banHocSinh;
    }

    @Override
      public String toString() {
            return "Student{" + "Ma hoc sinh: "+maDoiTuong +"--Ten hoc sinh: "+ tenDoiTuong+"--Gioi tinh: "+gioiTinh+"--Cong viec: "+jobDoiTuong+"--Lop hoc sinh: " + lopDoiTuong + "--Ban Hoc Sinh: " + banHocSinh + '}';
      }

   
   
    
}
