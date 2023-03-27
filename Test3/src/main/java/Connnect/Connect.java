//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Connnect;

import Config.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private static Connect connect = null;
    private static String url;
    private static String username;
    private static String password;

    private Connect() {
    }

    public static Connection getConnection() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch (SQLException var2) {
            throw new RuntimeException(var2);
        } catch (ClassNotFoundException var3) {
            throw new RuntimeException(var3);
        }
    }

    public static Connect getInstance() {
        return connect == null ? new Connect() : connect;
    }

    static {
        url = Config.DB_URL;
        username = Config.USER_NAME;
        password = Config.PASSWORD;
    }
}
