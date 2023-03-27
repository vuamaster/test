package Service;

import DAO.DepartmentsDAO;
import Model.Departments;
import Model.Employees;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class DepartmentsService {

    public DepartmentsDAO DepartmentsDAO = new DepartmentsDAO();
    public List<Departments> DepartmentsList;
    public static Scanner sc;

    public DepartmentsService() {

    }
    public void insert() {
        System.out.println("department_name: ");
        String department_name = sc.nextLine();
        System.out.println("phone_number: ");
        Integer phone_number = Integer.parseInt(sc.nextLine());
        System.out.println("manager_id: ");
        Integer manager_id = Integer.parseInt(sc.nextLine());
        Departments stdd = new Departments(department_name, phone_number, manager_id);
        this.DepartmentsDAO.insert(stdd);
    }
    public void update(int id) {
        System.out.println("Update");
        boolean cond = true;

        do {
            System.out.println("*** Chon thong tin cap nhat ***:");
            System.out.println("1. Update department_name.");
            System.out.println("2. Update phone_number.");
            System.out.println("3. Update manager_id.");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn cua bạn: ");
            int chon = Integer.parseInt(sc.nextLine());
            if (chon >= 0 && chon <= 3) {
                switch (chon) {
                    case 1:
                        System.out.println("Nhap new_department_name:");
                        String newName = sc.nextLine();
                        this.DepartmentsDAO.update("first_name", newName, id);
                        break;
                    case 2:
                        System.out.println("Nhap new_phone_number: ");
                        Integer newPhone = Integer.parseInt(sc.nextLine());
                        this.DepartmentsDAO.update("phone_number", newPhone, id);
                        break;
                    case 3:
                        System.out.println("Nhap new_manager_id: ");
                        Integer newManagerID = Integer.parseInt(sc.nextLine());
                        this.DepartmentsDAO.update("manager_id", newManagerID, id);
                        break;
                    case 0:
                        System.out.println("Stop update");
                        cond = false;
                        break;
                    default:
                        System.out.println("Nhap lai lua chon.");
                }
            } else {
                System.out.println("Lua chon khong hop le, vui long lua chon lai: ");
            }
        } while(cond);

    }
    public void delete() {
        System.out.println("Nhap id phong ban can xoa: ");
        int xoaId = sc.nextInt();
        this.DepartmentsDAO.delete(xoaId);
    }
    public void inDanhSachStd() {
        List<Departments> ls = this.DepartmentsDAO.inDanhSachStd();
        Iterator var2 = ls.iterator();

        while(var2.hasNext()) {
            Departments item = (Departments)var2.next();
            System.out.println(item.toString());
        }

    }
    public void timPBTheoMa() {
        System.out.println("Nhap ID phong ban: ");
        Integer id = Integer.parseInt(sc.nextLine());
        Departments stdd = this.DepartmentsDAO.timPBTheoMa(id);
        System.out.println(stdd.toString());
    }
    public void timPBTheoTen() {
        System.out.println("Nhap ten phong ban: ");
        String namePB = sc.nextLine();
        Departments std = this.DepartmentsDAO.timPBTheoTen(namePB);
        System.out.println(std.toString());
    }
    static {
        sc = new Scanner(System.in);
    }
}
