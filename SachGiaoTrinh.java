package Tuan6;

// SachGiaoTrinh.java
public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String capDo;
    private int soLuong; // Thuộc tính để triển khai IKiemKe
    private String viTri;  // Thuộc tính để triển khai IKiemKe

    public SachGiaoTrinh(String maSach, String tenSach, String nhaXuatBan, int namXuatBan, double giaCoBan, String monHoc, String capDo, int soLuong, String viTri) {
        super(maSach, tenSach, nhaXuatBan, namXuatBan, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
        this.soLuong = soLuong;
        this.viTri = viTri;
    }

    // @Override: Triển khai phương thức trừu tượng từ lớp cha Sach
    @Override
    public double tinhGiaBan() {
        int soNamXuatBan = 2025 - this.namXuatBan;
        return this.giaCoBan + (soNamXuatBan * 5000);
    }

    @Override
    public String toString() {
        return "[SÁCH GIÁO TRÌNH] " + super.toString() +
               ", Môn học: '" + monHoc + '\'' +
               ", Cấp độ: '" + capDo + '\'';
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