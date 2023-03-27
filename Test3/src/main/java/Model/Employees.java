package Model;


public class Employees {
    private int employee_id;
    private String first_name;
    private String last_name;
    private String Email;
    private int phone_number;
    private String hire_date ;
    private String job_id  ;
    private double salary;
    private int manager_id;
    private int department_id;
    public Employees( String first_name, String last_name, String email, int phone_number, String hire_date, String job_id, double salary, int manager_id, int department_id) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.Email = email;
        this.phone_number = phone_number;
        this.hire_date = hire_date;
        this.job_id = job_id;
        this.salary = salary;
        this.manager_id = manager_id;
        this.department_id = department_id;
    }

    public Employees(int employee_id, String first_name, String last_name, String email, int phone_number, String hire_date, String job_id, double salary, int manager_id, int department_id) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.Email = email;
        this.phone_number = phone_number;
        this.hire_date = hire_date;
        this.job_id = job_id;
        this.salary = salary;
        this.manager_id = manager_id;
        this.department_id = department_id;
    }

    public int getEmployee_id() {
        return this.employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }


    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public int getPhone_number() {
        return this.phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getHire_date() {
        return this.hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }

    public String getJob_id() {
        return this.job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getManager_id() {
        return this.manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getDepartment_id() {
        return this.department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }





    @Override
    public String toString() {
        return "Employees{" +
                "employee_id=" + this.employee_id +
                ", first_name='" + this.first_name + '\'' +
                ", last_name='" + this.last_name + '\'' +
                ", Email='" + this.Email + '\'' +
                ", phone_number=" + this.phone_number +
                ", hire_date='" + this.hire_date + '\'' +
                ", job_id='" + this.job_id + '\'' +
                ", salary=" + this.salary +
                ", manager_id=" + this.manager_id +
                ", department_id=" + this.department_id +
                '}';
    }
}
