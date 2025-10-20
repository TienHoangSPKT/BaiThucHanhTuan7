import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach ql = new QuanLySach();
        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach sach");
            System.out.println("4. Tim sach theo ma");
            System.out.println("5. Cap nhat sach theo ma");
            System.out.println("6. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine(); 

            switch (chon) {
                case 1:
                    System.out.println("Nhap thong tin sach giao trinh:");
                    System.out.print("Ma sach: ");
                    String ma1 = sc.nextLine();
                    System.out.print("Tieu de: ");
                    String td1 = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tg1 = sc.nextLine();
                    System.out.print("Nam xuat ban: ");
                    int nam1 = sc.nextInt();
                    System.out.print("So luong: ");
                    int sl1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Mon hoc: ");
                    String mh = sc.nextLine();
                    System.out.print("Cap do: ");
                    String cd = sc.nextLine();
                    System.out.print("Gia co ban: ");
                    double gcb1 = sc.nextDouble();
                    ql.themSach(new SachGiaoTrinh(ma1, td1, tg1, nam1, sl1, mh, cd, gcb1));
                    break;

                case 2:
                    System.out.println("Nhap thong tin sach tieu thuyet:");
                    System.out.print("Ma sach: ");
                    String ma2 = sc.nextLine();
                    System.out.print("Tieu de: ");
                    String td2 = sc.nextLine();
                    System.out.print("Tac gia: ");
                    String tg2 = sc.nextLine();
                    System.out.print("Nam xuat ban: ");
                    int nam2 = sc.nextInt();
                    System.out.print("So luong: ");
                    int sl2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("The loai: ");
                    String tl = sc.nextLine();
                    System.out.print("La sach series (true/false): ");
                    boolean ls = sc.nextBoolean();
                    System.out.print("Gia co ban: ");
                    double gcb2 = sc.nextDouble();
                    ql.themSach(new SachTieuThuyet(ma2, td2, tg2, nam2, sl2, tl, ls, gcb2));
                    break;

                case 3:
                    ql.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Sach kq = ql.timKiemTheoMa(maTim);
                    if (kq != null) {
                        System.out.println("Tim thay: " + kq);
                    } else {
                        System.out.println("Khong tim thay sach co ma " + maTim);
                    }
                    break;

                case 5:
                    System.out.print("Nhap ma sach can cap nhat: ");
                    String maSua = sc.nextLine();
                    Sach sachCu = ql.timKiemTheoMa(maSua);
                    if (sachCu == null) {
                        System.out.println("Khong tim thay sach de cap nhat!");
                        break;
                    }

                    System.out.println("Nhap thong tin moi:");
                    System.out.print("Tieu de moi: ");
                    String tdMoi = sc.nextLine();
                    System.out.print("Tac gia moi: ");
                    String tgMoi = sc.nextLine();
                    System.out.print("Nam xuat ban moi: ");
                    int namMoi = sc.nextInt();
                    System.out.print("So luong moi: ");
                    int slMoi = sc.nextInt();
                    System.out.print("Gia co ban moi: ");
                    double gcbMoi = sc.nextDouble();
                    sc.nextLine();

                    if (sachCu instanceof SachGiaoTrinh) {
                        System.out.print("Mon hoc moi: ");
                        String mhMoi = sc.nextLine();
                        System.out.print("Cap do moi: ");
                        String cdMoi = sc.nextLine();
                        ql.capNhatSach(maSua, new SachGiaoTrinh(maSua, tdMoi, tgMoi, namMoi, slMoi, mhMoi, cdMoi, gcbMoi));
                    } else if (sachCu instanceof SachTieuThuyet) {
                        System.out.print("The loai moi: ");
                        String tlMoi = sc.nextLine();
                        System.out.print("La sach series moi (true/false): ");
                        boolean lsMoi = sc.nextBoolean();
                        ql.capNhatSach(maSua, new SachTieuThuyet(maSua, tdMoi, tgMoi, namMoi, slMoi, tlMoi, lsMoi, gcbMoi));
                    }
                    System.out.println("Cap nhat thanh cong!");
                    break;

                case 6:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    if (ql.xoaSach(maXoa)) {
                        System.out.println("Da xoa sach co ma " + maXoa);
                    } else {
                        System.out.println("Khong tim thay sach de xoa.");
                    }
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);

        sc.close();
    }
}