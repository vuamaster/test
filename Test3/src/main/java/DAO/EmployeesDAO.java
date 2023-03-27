package DAO;

import Connnect.Connect;
import Model.Employees;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class EmployeesDAO {

    public EmployeesDAO(){
    }

    public void insert(Employees std){
        Connection conne = null;
        PreparedStatement prst = null;

        try {
            Connect.getInstance();
            conne = Connect.getConnection();
            String sql = "INSERT INTO Employees(first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id ) VALUES (?,?,?,?,?,?,?,?,?)";
            prst = conne.prepareStatement(sql);
            prst.setString(1, std.getFirst_name());
            prst.setString(2, std.getLast_name());
            prst.setString(3, std.getEmail());
            prst.setInt(4, std.getPhone_number());
            prst.setString(5, std.getHire_date());
            prst.setString(6, std.getJob_id());
            prst.setDouble(7, std.getSalary());
            prst.setInt(8, std.getManager_id());
            prst.setInt(9, std.getDepartment_id());
            prst.executeUpdate();
        } catch (Exception var15) {
            throw new RuntimeException(var15);
        } finally {
            if (prst != null) {
                try {
                    prst.close();
                } catch (SQLException var14) {
                    throw new RuntimeException(var14);
                }
            }

            if (conne != null) {
                try {
                    conne.close();
                } catch (SQLException var13) {
                    throw new RuntimeException(var13);
                }
            }

        }
    }
    public <T> void update(T col, T val, int id) {
        Connection conn = null;

        try {
            Connect.getInstance();
            conn = Connect.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "UPDATE Employees SET " + col + "='" + val + "' WHERE employee_id = " + id;
            stmt.executeUpdate(sql);
        } catch (Exception var14) {
            throw new RuntimeException(var14);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException var13) {
                    throw new RuntimeException(var13);
                }
            }

        }

    }
    public void delete(int maStd) {
        Connection conne = null;

        try {
            Connect.getInstance();
            conne = Connect.getConnection();
            Statement stmt = conne.createStatement();
            String sql = "DELETE FROM Employees WHERE employee_id= " + maStd;
            stmt.executeUpdate(sql);
        } catch (Exception var12) {
            throw new RuntimeException(var12);
        } finally {
            if (conne != null) {
                try {
                    conne.close();
                } catch (Exception var11) {
                    throw new RuntimeException(var11);
                }
            }

        }

    }
    public List<Employees> inDanhSachStd() {
        List<Employees> ls = new ArrayList();
        Connection conne = null;

        try {
            Connect.getInstance();
            conne = Connect.getConnection();
            Statement stmt = conne.createStatement();
            String sql = "SELECT * FROM Employees";
            ResultSet res = stmt.executeQuery(sql);

            while(res.next()) {
                Employees nv = new Employees(res.getInt("employee_id"), res.getString("first_name"),res.getString("last_name"),res.getString("email"), res.getInt("phone_number"), res.getString("hire_date"),res.getString("job_id"), res.getDouble("salary"), res.getInt("manager_id"),res.getInt("department_id"));
                ls.add(nv);
            }
        } catch (Exception var14) {
            throw new RuntimeException(var14);
        } finally {
            if (conne != null) {
                try {
                    conne.close();
                } catch (SQLException var13) {
                    throw new RuntimeException(var13);
                }
            }

        }

        return ls;
    }
    public Employees timNVTheoMa(int id) {
        Connection conne = null;
        Statement stmt = null;

        try {
            Connect.getInstance();
            conne = Connect.getConnection();
            stmt = conne.createStatement();
            String sql = "SELECT * FROM Employees WHERE employee_id = " + id;
            ResultSet res = stmt.executeQuery(sql);

            Employees std;
            Integer employee_id;
            String first_name;
            String last_name;
            String Email;
            Integer phone_number;
            String hire_date ;
            String job_id  ;
            Double salary;
            Integer manager_id;
            Integer department_id;
            for(std = null; res.next(); std = new Employees(employee_id, first_name, last_name, Email, phone_number, hire_date, job_id, salary, manager_id, department_id )) {
                employee_id = res.getInt("employee_id");
                first_name = res.getString("first_name");
                last_name = res.getString("last_name");
                Email = res.getString("Email");
                phone_number = res.getInt("phone_number");
                hire_date = res.getString("hire_date");
                job_id = res.getString("job_id");
                salary = res.getDouble("salary");
                manager_id = res.getInt("manager_id");
                department_id = res.getInt("department_id");

            }

            Employees var25 = std;
            return var25;
        } catch (SQLException var23) {
            throw new RuntimeException(var23);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException var22) {
                    throw new RuntimeException(var22);
                }
            }

            if (conne != null) {
                try {
                    conne.close();
                } catch (SQLException var21) {
                    throw new RuntimeException(var21);
                }
            }

        }

    }
    public Employees timNVTheoTen(String nameNV) {
        Connection conne = null;
        Statement stmt = null;

        try {
            Connect.getInstance();
            conne = Connect.getConnection();
            stmt = conne.createStatement();
            String sql = "SELECT * FROM Employees WHERE first_name = '" + nameNV + "'";
            ResultSet res = stmt.executeQuery(sql);

            Employees std;
            Integer employee_id;
            String first_name;
            String last_name;
            String Email;
            Integer phone_number;
            String hire_date ;
            String job_id  ;
            Double salary;
            Integer manager_id;
            Integer department_id;
            for(std = null; res.next(); std = new Employees(employee_id, first_name, last_name, Email, phone_number, hire_date, job_id, salary, manager_id, department_id)) {
                employee_id = res.getInt("employee_id");
                first_name = res.getString("first_name");
                last_name = res.getString("last_name");
                Email = res.getString("Email");
                phone_number = res.getInt("phone_number");
                hire_date = res.getString("hire_date");
                job_id = res.getString("job_id");
                salary = res.getDouble("salary");
                manager_id = res.getInt("manager_id");
                department_id = res.getInt("department_id");
            }

            Employees var25 = std;
            return var25;
        } catch (SQLException var23) {
            throw new RuntimeException(var23);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException var22) {
                    throw new RuntimeException(var22);
                }
            }

            if (conne != null) {
                try {
                    conne.close();
                } catch (SQLException var21) {
                    throw new RuntimeException(var21);
                }
            }

        }
    }
    public Employees timNVTheoSDT(String SDT) {
        Connection conne = null;
        Statement stmt = null;

        try {
            Connect.getInstance();
            conne = Connect.getConnection();
            stmt = conne.createStatement();
            String sql = "SELECT * FROM Employees WHERE phone_number = '" + SDT + "'";
            ResultSet res = stmt.executeQuery(sql);

            Employees std;
            Integer employee_id;
            String first_name;
            String last_name;
            String Email;
            Integer phone_number;
            String hire_date ;
            String job_id  ;
            Double salary;
            Integer manager_id;
            Integer department_id;
            for(std = null; res.next(); std = new Employees(employee_id, first_name, last_name, Email, phone_number, hire_date, job_id, salary, manager_id, department_id)) {
                employee_id = res.getInt("employee_id");
                first_name = res.getString("first_name");
                last_name = res.getString("last_name");
                Email = res.getString("Email");
                phone_number = res.getInt("phone_number");
                hire_date = res.getString("hire_date");
                job_id = res.getString("job_id");
                salary = res.getDouble("salary");
                manager_id = res.getInt("manager_id");
                department_id = res.getInt("department_id");
            }

            Employees var25 = std;
            return var25;
        } catch (SQLException var23) {
            throw new RuntimeException(var23);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException var22) {
                    throw new RuntimeException(var22);
                }
            }

            if (conne != null) {
                try {
                    conne.close();
                } catch (SQLException var21) {
                    throw new RuntimeException(var21);
                }
            }

        }
    }
    public Employees timNVTheoEmail(String email) {
        Connection conne = null;
        Statement stmt = null;

        try {
            Connect.getInstance();
            conne = Connect.getConnection();
            stmt = conne.createStatement();
            String sql = "SELECT * FROM Employees WHERE Email = '" + email + "'";
            ResultSet res = stmt.executeQuery(sql);

            Employees std;
            Integer employee_id;
            String first_name;
            String last_name;
            String Email;
            Integer phone_number;
            String hire_date ;
            String job_id  ;
            Double salary;
            Integer manager_id;
            Integer department_id;
            for(std = null; res.next(); std = new Employees(employee_id, first_name, last_name, Email, phone_number, hire_date, job_id, salary, manager_id, department_id)) {
                employee_id = res.getInt("employee_id");
                first_name = res.getString("first_name");
                last_name = res.getString("last_name");
                Email = res.getString("Email");
                phone_number = res.getInt("phone_number");
                hire_date = res.getString("hire_date");
                job_id = res.getString("job_id");
                salary = res.getDouble("salary");
                manager_id = res.getInt("manager_id");
                department_id = res.getInt("department_id");
            }

            Employees var25 = std;
            return var25;
        } catch (SQLException var23) {
            throw new RuntimeException(var23);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException var22) {
                    throw new RuntimeException(var22);
                }
            }

            if (conne != null) {
                try {
                    conne.close();
                } catch (SQLException var21) {
                    throw new RuntimeException(var21);
                }
            }

        }
    }
}

