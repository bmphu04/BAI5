
package DoiTuong;


public class DoiTuong {
     protected String maDoiTuong, tenDoiTuong, jobDoiTuong;   
      protected boolean gioiTinh;

      public DoiTuong(String maDoiTuong, String tenDoiTuong, String jobDoiTuong, boolean gioiTinh) {
            this.maDoiTuong = maDoiTuong;
            this.tenDoiTuong = tenDoiTuong;
            this.jobDoiTuong = jobDoiTuong;
            this.gioiTinh = gioiTinh;
      }

      public String getMaDoiTuong() {
            return maDoiTuong;
      }

      public void setMaDoiTuong(String maDoiTuong) {
            this.maDoiTuong = maDoiTuong;
      }

      public String getTenDoiTuong() {
            return tenDoiTuong;
      }

      public void setTenDoiTuong(String tenDoiTuong) {
            this.tenDoiTuong = tenDoiTuong;
      }

      public String getJobDoiTuong() {
            return jobDoiTuong;
      }

      public void setJobDoiTuong(String jobDoiTuong) {
            this.jobDoiTuong = jobDoiTuong;
      }

      public boolean isGioiTinh() {
            return gioiTinh;
      }

      public void setGioiTinh(boolean gioiTinh) {
            this.gioiTinh = gioiTinh;
      }
}
