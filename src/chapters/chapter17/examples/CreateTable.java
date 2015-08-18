package chapters.chapter17.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Rekish on 8/18/2015.
 */
public class CreateTable {

    public static void main(String args[]) {
        final String DRIVER =
                "org.apache.derby.jdbc.EmbeddedDriver";
        final String CONNECTION =
                "jdbc:derby:AccountDatabase;create=true";

        try {
            Class.forName(DRIVER).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection =
                     DriverManager.getConnection(CONNECTION);
             Statement statement =
                     connection.createStatement()) {
            statement.executeUpdate(
                    "create table ACCOUNTS"
                    + " (NAME VARCHAR(32) NOT NULL PRIMARY KEY, "
                    + " ADDRESS VARCHAR(32), "
                    + " BALANCE FLOAT)");

            statement.executeUpdate(
                    "insert into ACCOUNTS values "
                    + " ('Barry Burd', '222 Cyber Lane', 24.02)");

            statement.executeUpdate(
                    "insert into ACCOUNTS values "
                    + " ('Joe Dow', '111 Luddite Street', 55.63)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
