public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai,
            boolean laSachSeries,double giaCoBan) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
   
    }
    public String getTheLoai() 
    { 
        return theLoai; 
    }
    public boolean isLaSachSeries() 
    { 
        return laSachSeries; 
    }
    
    public void setTheLoai(String theLoai) 
    { 
        this.theLoai = theLoai; 
    }
    public void setLaSachSeries(boolean laSachSeries) 
    { 
        this.laSachSeries = laSachSeries; 
    }
    @Override
    public double tinhGiaBan(){
        if (laSachSeries==true)
            return this.getgiaCoBan()+15000;
        else
            return this.getgiaCoBan();
    }
    @Override
    public String toString() {
        return super.toString() +"SachTieuThuyet [theLoai=" + theLoai + ", laSachSeries=" + laSachSeries + "Gia Ban:" + tinhGiaBan() + "]" ;
    }
}
 