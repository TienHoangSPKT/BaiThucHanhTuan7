package Tuan6;

// Sach.java
public abstract class Sach {
    protected String maSach;
    protected String tenSach;
    protected String nhaXuatBan;
    protected int namXuatBan;
    protected double giaCoBan; // Thuộc tính mới

    public Sach(String maSach, String tenSach, String nhaXuatBan, int namXuatBan, double giaCoBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
        this.giaCoBan = giaCoBan;
    }

    public String getMaSach() {
        return maSach;
    }
    
    public String getTenSach() {
        return tenSach;
    }

    // Phương thức trừu tượng: Bắt buộc lớp con phải triển khai
    public abstract double tinhGiaBan();

    @Override
    public String toString() {
        return "Mã sách: " + maSach +
               ", Tên: '" + tenSach + '\'' +
               ", NXB: '" + nhaXuatBan + '\'' +
               ", Năm XB: " + namXuatBan +
               ", Giá cơ bản: " + String.format("%,.0f", giaCoBan) + " VNĐ";
    }
}