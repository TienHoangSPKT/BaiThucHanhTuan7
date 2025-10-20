import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public boolean xoaSach(String maSach) {
        return danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    public boolean capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.set(i, sachMoi);
                return true;
            }
        }
        return false;
    }

    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return  s;
            }
        }
        return null;
    }

    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong.");
        } 
        else 
        {
            for (Sach s : danhSach) {
                System.out.println(s);
            }
        }
    }
}
