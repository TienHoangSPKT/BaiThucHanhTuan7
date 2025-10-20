public class Test1 {
    public static void main(String[] args) {

        System.out.println("--- Bat dau chuong trinh ---");
        QuanLySach qls1 = new QuanLySach();
        System.out.println("\n--- Tao 2 doi tuong sach ---");
        SachGiaoTrinh sgt = new SachGiaoTrinh("SGT01", "Lap trinh Java", "NXB KHKT", 2024, 150, 50000, "Lap trinh", "Dai hoc", "Ke A1");
        SachTieuThuyet stt = new SachTieuThuyet("STT01", "Nha Gia Kim", "Paulo Coelho", 1988, 75, 80000, "Phieu luu", false, "Ke B2");
        System.out.println("\n--- Them sach vao danh sach ---");
        qls1.themSach(sgt);
        qls1.themSach(stt);

        System.out.println("\n--- Hien thi danh sach (Kiem tra tinhGiaBan) ---");
        qls1.hienThiDanhSach(); 
        System.out.println("\n--- Kiem tra giao dien (Interface) ---");
        IkiemKe kiemKe = new SachGiaoTrinh("SGT02", "Toan Cao Cap", "NXB Giao Duc", 2020, 50, 45000, "Toan", "Dai hoc", "Ke C3");

        System.out.println("Dang kiem tra doi tuong: " + ((Sach1) kiemKe).getTieuDe());
        boolean ketQua = kiemKe.kiemTraTonKho(100);
        System.out.println("Goi kiemTraTonKho(100): " + ketQua); 
        System.out.println("Goi capNhatViTri('Kho A1-Kệ 5')...");
        kiemKe.capNhatViTri("Kho A1-Kệ 5");
        System.out.println("\n--- Hoan tat ---");
    }
}