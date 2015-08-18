package chapters.chapter17.examples;

import static java.lang.System.out;
import java.sql.*;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Rekish on 8/18/2015.
 */
public class GetData {
    public static void main(String args[]) {
        NumberFormat currency =
                NumberFormat.getCurrencyInstance(Locale.GERMANY);

        final String DRIVER =
                "org.apache.derby.jdbc.EmbeddedDriver";
        final String CONNECTION =
                "jdbc:derby:AccountDatabase";

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
                     connection.createStatement();

            ResultSet resultSet =
                    statement.executeQuery(
                            "select * from ACCOUNTS")) {
                while (resultSet.next()) {
                    out.print(resultSet.getString("NAME"));
                    out.print(" ");
                    out.print(resultSet.getString("ADDRESS"));
                    out.print(" ");
                    out.println(currency.format(
                            resultSet.getFloat("BALANCE")));
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
