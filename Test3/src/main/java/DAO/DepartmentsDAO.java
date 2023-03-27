package DAO;

import Connnect.Connect;
import Model.Departments;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class DepartmentsDAO {

    public DepartmentsDAO(){
    }
    public void insert(Departments stdd){
        Connection conne = null;
        PreparedStatement prst = null;

        try {
            Connect.getInstance();
            conne = Connect.getConnection();
            String sql = "INSERT INTO departments(department_name,phone_number,manager_id ) VALUES (?,?,?)";
            prst = conne.prepareStatement(sql);
            prst.setString(1, stdd.getDepartment_name());
            prst.setInt(2, stdd.getPhone_number());
            prst.setInt(3, stdd.getManager_id());
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
            String sql = "UPDATE departments SET " + col + "='" + val + "' WHERE department_id = " + id;
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
            String sql = "DELETE FROM departments WHERE department_id= " + maStd;
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
    public List<Departments> inDanhSachStd() {
        List<Departments> ls = new ArrayList();
        Connection conne = null;

        try {
            Connect.getInstance();
            conne = Connect.getConnection();
            Statement stmt = conne.createStatement();
            String sql = "SELECT * FROM departments";
            ResultSet res = stmt.executeQuery(sql);

            while(res.next()) {
                Departments nv = new Departments(res.getInt("department_id"), res.getString("department_name") ,res.getInt("phone_number"),res.getInt("manager_id"));
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
    public Departments timPBTheoMa(int id) {
        Connection conne = null;
        Statement stmt = null;

        try {
            Connect.getInstance();
            conne = Connect.getConnection();
            stmt = conne.createStatement();
            String sql = "SELECT * FROM Departments WHERE department_id = " + id;
            ResultSet res = stmt.executeQuery(sql);

            Departments std;
            Integer department_id;
            String department_name;
            Integer phone_number;
            Integer manager_id;
            for(std = null; res.next(); std = new Departments(department_id, department_name, phone_number, manager_id )) {
                department_id = res.getInt("department_id");
                department_name = res.getString("department_name");
                phone_number = res.getInt("phone_number");
                manager_id = res.getInt("manager_id");

            }

            Departments var25 = std;
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
    public Departments timPBTheoTen(String namePB) {
        Connection conne = null;
        Statement stmt = null;

        try {
            Connect.getInstance();
            conne = Connect.getConnection();
            stmt = conne.createStatement();
            String sql = "SELECT * FROM Departments WHERE department_name = '" + namePB + "'";
            ResultSet res = stmt.executeQuery(sql);

            Departments std;
            Integer department_id;
            String department_name;
            Integer phone_number;
            Integer manager_id;
            for(std = null; res.next(); std = new Departments(department_id, department_name, phone_number, manager_id )) {
                department_id = res.getInt("department_id");
                department_name = res.getString("department_name");
                phone_number = res.getInt("phone_number");
                manager_id = res.getInt("manager_id");

            }

            Departments var25 = std;
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
