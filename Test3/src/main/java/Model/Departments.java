package Model;

public class Departments {

        private int department_id;
        private String department_name;
        private int phone_number;
        private int manager_id;

    public Departments(String department_name, int phone_number, int manager_id) {
        this.department_name = department_name;
        this.phone_number = phone_number;
        this.manager_id = manager_id;
    }
    public Departments(int department_id, String department_name, int phone_number, int manager_id) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.phone_number = phone_number;
        this.manager_id = manager_id;
    }

    public int getDepartment_id() {
        return this.department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return this.department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getPhone_number() {
        return this.phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public int getManager_id() {
        return this.manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    @Override
    public String toString() {
        return "departments{" +
                "department_id=" + this.department_id +
                ", department_name='" + this.department_name + '\'' +
                ", phone_number=" + this.phone_number +
                ", manager_id=" + this.manager_id +
                '}';
    }

}
