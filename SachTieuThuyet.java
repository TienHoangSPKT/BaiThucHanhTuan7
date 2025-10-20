package Tuan6;

// SachTieuThuyet.java
public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private boolean laSachSeries;
    private int soLuong; // Thuộc tính để triển khai IKiemKe
    private String viTri;  // Thuộc tính để triển khai IKiemKe

    public SachTieuThuyet(String maSach, String tenSach, String nhaXuatBan, int namXuatBan, double giaCoBan, String theLoai, boolean laSachSeries, int soLuong, String viTri) {
        super(maSach, tenSach, nhaXuatBan, namXuatBan, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
        this.soLuong = soLuong;
        this.viTri = viTri;
    }
    
    // @Override: Triển khai phương thức trừu tượng từ lớp cha Sach
    @Override
    public double tinhGiaBan() {
        return this.giaCoBan + (laSachSeries ? 15000 : 0);
    }
    
    @Override
    public String toString() {
        String seriesStatus = laSachSeries ? "Có" : "Không";
        return "[TIỂU THUYẾT] " + super.toString() +
               ", Thể loại: '" + theLoai + '\'' +
               ", Thuộc series: " + seriesStatus;
    }

    // @Override: Triển khai các phương thức từ giao diện IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("-> Đã chuyển sách '" + this.getTenSach() + "' đến khu vực: " + viTriMoi);
    }
}