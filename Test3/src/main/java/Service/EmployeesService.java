package Service;

import DAO.EmployeesDAO;
import Model.Employees;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeesService {

    public EmployeesDAO EmployeesDAO = new EmployeesDAO();
    public List<Employees> EmployeesList;
    public static Scanner sc;

    public EmployeesService() {

    }
    public void insert() {
        System.out.println("first_name: ");
        String first_name = sc.nextLine();
        System.out.println("last_name: ");
        String last_name = sc.nextLine();
        System.out.println("Email: ");
        String Email = sc.nextLine();
        System.out.println("phone_number: ");
        Integer phone_number = Integer.parseInt(sc.nextLine());
        System.out.println("hire_date: ");
        String hire_date = sc.nextLine();
        System.out.println("job_id: ");
        String job_id = sc.nextLine();
        System.out.println("salary: ");
        Double salary = Double.parseDouble(sc.nextLine());
        System.out.println("manager_id: ");
        Integer manager_id = Integer.parseInt(sc.nextLine());
        System.out.println("department_id: ");
        Integer department_id = Integer.parseInt(sc.nextLine());
        Employees std = new Employees(first_name, last_name, Email, phone_number, hire_date, job_id, salary, manager_id, department_id);
        this.EmployeesDAO.insert(std);
    }
    public void update(int id) {
        System.out.println("Update");
        boolean cond = true;

        do {
            System.out.println("*** Chon thong tin cap nhat ***:");
            System.out.println("1. Update first_name.");
            System.out.println("2. Update last_name.");
            System.out.println("3. Update Email.");
            System.out.println("4. Update phone_number.");
            System.out.println("5. Update hire_date.");
            System.out.println("6. Update job_id.");
            System.out.println("7. Update salary.");
            System.out.println("8. Update manager_id.");
            System.out.println("9. Update department_id.");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn cua bạn: ");
            int chon = Integer.parseInt(sc.nextLine());
            if (chon >= 0 && chon <= 9) {
                switch (chon) {
                    case 1:
                        System.out.println("Nhap new_first_name:");
                        String newName = sc.nextLine();
                        this.EmployeesDAO.update("first_name", newName, id);
                        break;
                    case 2:
                        System.out.println("Nhap new_last_name:");
                        String newLname = sc.nextLine();
                        this.EmployeesDAO.update("last_name", newLname, id);
                        break;
                    case 3:
                        System.out.println("Nhap new_Email:");
                        String newEmail = sc.nextLine();
                        this.EmployeesDAO.update("Email", newEmail, id);
                        break;
                    case 4:
                        System.out.println("Nhap new_phone_number: ");
                        Integer newPhone = Integer.parseInt(sc.nextLine());
                        this.EmployeesDAO.update("phone_number", newPhone, id);
                        break;
                    case 5:
                        System.out.println("Nhap new_hire_date:");
                        String newHdate = sc.nextLine();
                        this.EmployeesDAO.update("hire_date", newHdate, id);
                        break;
                    case 6:
                        System.out.println("Nhap new_job_id: ");
                        String newJobID = sc.nextLine();
                        this.EmployeesDAO.update("job_id", newJobID, id);
                        break;
                    case 7:
                        System.out.println("Nhap new_salary: ");
                        Double newSalary = Double.parseDouble(sc.nextLine());
                        this.EmployeesDAO.update("salary", newSalary, id);
                        break;
                    case 8:
                        System.out.println("Nhap new_manager_id: ");
                        Integer newManagerID = Integer.parseInt(sc.nextLine());
                        this.EmployeesDAO.update("manager_id", newManagerID, id);
                        break;
                    case 9:
                        System.out.println("Nhap new_department_id: ");
                        Integer newDepartmentID = Integer.parseInt(sc.nextLine());
                        this.EmployeesDAO.update("department_id", newDepartmentID, id);
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
        System.out.println("Nhap id sinh vien can xoa: ");
        int xoaId = sc.nextInt();
        this.EmployeesDAO.delete(xoaId);
    }
    public void inDanhSachStd() {
        List<Employees> ls = this.EmployeesDAO.inDanhSachStd();
        Iterator var2 = ls.iterator();

        while(var2.hasNext()) {
            Employees item = (Employees)var2.next();
            System.out.println(item.toString());
        }

    }
    public void timNVTheoMa() {
        System.out.println("Nhap ID nhan vien: ");
        Integer id = Integer.parseInt(sc.nextLine());
        Employees std = this.EmployeesDAO.timNVTheoMa(id);
        System.out.println(std.toString());
    }
    public void timNVTheoTen() {
        System.out.println("Nhap ten nhan vien: ");
        String nameSV = sc.nextLine();
        Employees std = this.EmployeesDAO.timNVTheoTen(nameSV);
        System.out.println(std.toString());
    }
    public void timNVTheoSDT() {
        System.out.println("Nhap SDT nhan vien: ");
        String SDT = sc.nextLine();
        Employees std = this.EmployeesDAO.timNVTheoSDT(SDT);
        System.out.println(std.toString());
    }
    public void timNVTheoEmail() {
        System.out.println("Nhap Email nhan vien: ");
        String email = sc.nextLine();
        Employees std = this.EmployeesDAO.timNVTheoEmail(email);
        System.out.println(std.toString());
    }
    static {
        sc = new Scanner(System.in);
    }
}
