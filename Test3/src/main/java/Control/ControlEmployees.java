package Control;

import Service.EmployeesService;
import java.util.Scanner;
public class ControlEmployees {
    public static Scanner sc ;

    public ControlEmployees(){

    }
    public void ControlEmployees(){
        EmployeesService stds = new EmployeesService();
        boolean cond = true;

        do {
            System.out.println("-----QUẢN LÝ NHÂN VIÊN-----");
            System.out.println("1. Them nhan vien.");
            System.out.println("2. Cap nhat thong tin sinh vien.");
            System.out.println("3. Xoa sinh vien theo ma id.");
            System.out.println("4. In danh sach sinh vien.");
            System.out.println("5. Tim kiem sinh vien theo ma sinh vien.");
            System.out.println("6. Tim kiem sinh vien theo ten sinh vien.");
            System.out.println("7. Tim kiem sinh vien theo SDT sinh vien");
            System.out.println("8. Tim kiem sinh vien theo Email sinh vien");
//            System.out.println("9. Tim cac sinh vien o lop D01 va  diem GPA lon hon 8");
//            System.out.println("10. Xap xep theo ten sinh vien");
            System.out.println(" Nhap lua chon cua bạn: ");
            Integer nhap = Integer.parseInt(sc.nextLine());
            if (nhap >= 1 && nhap <= 11) {
                switch (nhap) {
                    case 1:
                        stds.insert();
                        break;
                    case 2:
                        System.out.println("Lua chon ma nhân vien ban muon cap nhat: ");
                        Integer idcapNhat = Integer.parseInt(sc.nextLine());
                        stds.update(idcapNhat);
                        break;
                    case 3:
                        stds.delete();
                        break;
                    case 4:
                        stds.inDanhSachStd();
                        break;
                    case 5:
                        stds.timNVTheoMa();
                        break;
                    case 6:
                        stds.timNVTheoTen();
                        break;
                   case 7:
                        stds.timNVTheoSDT();
                        break;
                    case 8:
                        stds.timNVTheoEmail();
                        break;
//                    case 9:
//                        stds.GPAMoreThan8AndD01();
//                    case 10:
                }
            } else {
                System.out.println("Lua chon không hop le, vui long chon lai: ");
            }
        } while(cond);
    }
    static {
        sc = new Scanner(System.in);
    }
}
