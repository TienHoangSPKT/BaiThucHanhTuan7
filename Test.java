package Tuan6;

// Test.java

public class Test {
    public static void main(String[] args) {
        QuanLySach qls = new QuanLySach();

        System.out.println("--- KHỞI TẠO VÀ THÊM SÁCH ---");
        
        // SỬA LẠI 2 DÒNG NÀY:
        // Bỏ các tên tham số như "maSach:", "tenSach:",...
        // và truyền đủ các giá trị theo đúng thứ tự của constructor.
        Sach gt1 = new SachGiaoTrinh("GT01", "Giải tích 1", "NXB Giáo dục", 2022, 110000, "Toán cao cấp", "Đại học", 150, "Kho A1");
        Sach tt1 = new SachTieuThuyet("TT01", "Nhà Giả Kim", "NXB Văn học", 2018, 80000, "Phiêu lưu", true, 200, "Kho B2");

        qls.themMoi(gt1);
        qls.themMoi(tt1);

        // Hiển thị danh sách để kiểm tra kết quả tính giá
        qls.hienThiDanhSach();

        System.out.println("\n--- THỰC HIỆN KIỂM TRA GIAO DIỆN (INTERFACE) ---");
        // Tạo một tham chiếu kiểu IKiemKe trỏ đến đối tượng SachGiaoTrinh
        // Điều này cho phép chúng ta chỉ truy cập các phương thức được định nghĩa trong IKiemKe
        IKiemKe kiemKe = (IKiemKe) gt1;

        // Gọi phương thức từ giao diện
        boolean conHang = kiemKe.kiemTraTonKho(100);
        System.out.println("Kiểm tra sách 'Giải tích 1' có đủ 100 cuốn không? -> " + (conHang ? "Có" : "Không"));

        boolean hetHang = kiemKe.kiemTraTonKho(200);
        System.out.println("Kiểm tra sách 'Giải tích 1' có đủ 200 cuốn không? -> " + (hetHang ? "Có" : "Không"));

        // Gọi phương thức cập nhật vị trí
        kiemKe.capNhatViTri("Kho A1-Kệ 5");
    }
}