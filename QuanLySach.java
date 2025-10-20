package Tuan6;

// QuanLySach.java
import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
    private List<Sach> danhSachSach;

    public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
    }

    public void themMoi(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("-> Đã thêm thành công: " + sach.getTenSach());
    }

    // Cập nhật phương thức hiển thị
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.println("\nDANH SÁCH TẤT CẢ SÁCH:");
        System.out.println("==================================================");
        for (Sach sach : danhSachSach) {
            System.out.println(sach.toString()); // In thông tin cơ bản
            // Gọi phương thức tinhGiaBan() để hiển thị giá bán ước tính
            System.out.println("    => GIÁ BÁN ƯỚC TÍNH: " + String.format("%,.0f", sach.tinhGiaBan()) + " VNĐ");
            System.out.println("--------------------------------------------------");
        }
    }
}