
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import Control.*;
import Connnect.Connect;
public class Main {
    public static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        Connection conne = null;
        PreparedStatement prst = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Nhap password: ");
        String enteredPassword = scanner.nextLine();


        // Connect to the database
        conne = Connect.getConnection();
//        String username = "admin";
//        String password = "admin";

        try {
            boolean cont = true;
            // Query the database for the user's credentials
            String query = "SELECT * FROM acounts WHERE username = ?";
            PreparedStatement statement = conne.prepareStatement(query);
            statement.setString(1, enteredUsername);
            ResultSet resultSet = statement.executeQuery();

            // Check if the entered credentials match the ones in the database
            if (resultSet.next()) {
                String storedPassword = resultSet.getString("password");
                if (enteredPassword.equals(storedPassword)) {
                    System.out.println("Login successful!");
                    boolean cond = true;
                    do {
                        System.out.println("-----SAMSUNG-----");
                        System.out.println("1. Quan Ly Phong Ban.");
                        System.out.println("2. Quan Ly Nhan Vien.");
                        System.out.println(" Nhap lua chon cua bạn: ");
                        Integer nhap = Integer.parseInt(sc.nextLine());
                        if (nhap >= 1 && nhap <= 2) {
                            switch (nhap) {
                                case 1:
                                    ControlDepartments stdd = new ControlDepartments();
                                    stdd.ControlDepartments();
                                    break;
                                case 2:
                                    ControlEmployees stds = new ControlEmployees();
                                    stds.ControlEmployees();
                                    break;
                            }
                        } else {
                            System.out.println("Lua chon không hop le, vui long chon lai: ");
                        }
                    } while(cond);

                } else {
                    System.out.println("Invalid password.");
                    cont = true;
                }
            } else {
                System.out.println("Invalid username.");
                cont = true;
            }

            // Close the result set, statement, and connection
            resultSet.close();
            statement.close();
            conne.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        scanner.close();

    }

    static {
        sc = new Scanner(System.in);
    }

}