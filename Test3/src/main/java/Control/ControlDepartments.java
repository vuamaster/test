package Control;

import Service.DepartmentsService;
import java.util.Scanner;
public class ControlDepartments {
    public static Scanner sc;

    public ControlDepartments(){

    }
    public void ControlDepartments(){
        DepartmentsService stdd = new DepartmentsService();
        boolean cond = true;

        do {
            System.out.println("-----QUẢN LÝ PHÒNG BAN-----");
            System.out.println("1. Them phong ban.");
            System.out.println("2. Cap nhat thong tin phong ban.");
            System.out.println("3. Xoa phong ban theo ma id.");
            System.out.println("4. In danh sach phong ban.");
            System.out.println("5. Tim kiem phong ban theo ma .");
            System.out.println("6. Tim kiem phong ban theo ten .");
//            System.out.println("7. Sap xep sinh vien theo diem GPA tang dan");
//            System.out.println("8. Tim cac sinh vien theo diem GPA lon hon 8");
//            System.out.println("9. Tim cac sinh vien o lop D01 va  diem GPA lon hon 8");
//            System.out.println("10. Xap xep theo ten sinh vien");
            System.out.println(" Nhap lua chon cua bạn: ");
            Integer nhap = Integer.parseInt(sc.nextLine());
            if (nhap >= 1 && nhap <= 6) {
                switch (nhap) {
                    case 1:
                        stdd.insert();
                        break;
                    case 2:
                        System.out.println("Lua chon ma phong ban ban muon cap nhat: ");
                        Integer idcapNhat = Integer.parseInt(sc.nextLine());
                        stdd.update(idcapNhat);
                        break;
                    case 3:
                        stdd.delete();
                        break;
                    case 4:
                        stdd.inDanhSachStd();
                        break;
                    case 5:
                        stdd.timPBTheoMa();
                        break;
                    case 6:
                        stdd.timPBTheoTen();
                        break;
//                    case 7:
//                        stds.sapXepGPATangDan();
//                        break;
//                    case 8:
//                        stds.GPAMoreThan8();
//                        break;
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
