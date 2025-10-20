public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan,
                         int soLuong,String capDo, String monHoc, double
                         giaCoBan) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;

    }
    public String getMonHoc() 
    { 
        return monHoc; 
    }
    public String getCapDo() 
    { 
        return capDo; 
    }
    public void setMonHoc(String monHoc) 
    { 
        this.monHoc = monHoc; 
    }
    public void setCapDo(String capDo) 
    { 
        this.capDo = capDo; 
    }
    @Override

    public double tinhGiaBan(){
        return this.getgiaCoBan()+(this.getNamXuatBan()*5000);
  
    }
    @Override
    public String toString() {
        return super.toString() + ", Mon hoc: " + monHoc + ", Cap do: " + capDo +"Gia Ban:"  + tinhGiaBan() + "]";
    }
}
