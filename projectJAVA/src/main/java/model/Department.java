package model;

public class Department {
    private long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private long managerID;

    public Department() {
    }

    public Department(long id, String name, String email, String phone, String address, long managerID) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.managerID = managerID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getManagerID() {
        return managerID;
    }

    public void setManagerID(long managerID) {
        this.managerID = managerID;
    }

    @Override
    public String toString() {
        return "Department[" +
                "id=" + id +
                ", name=" + name +
                ", email=" + email +
                ", phone=" + phone +
                ", address=" + address +
                ", managerID=" + managerID +
                ']';
    }

    public void setManagerID(Long aLong) {
    }
}
