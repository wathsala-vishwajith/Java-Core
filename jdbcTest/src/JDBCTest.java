import javax.print.DocFlavor;
import java.sql.*;

public class JDBCTest {
    private static final String url = "jdbc:mysql://localhost:3306/employees";
    private static final String uname = "root";
    private static final String password = "root";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try{
            Connection con = DriverManager.getConnection(url,uname,password);
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees limit 5");
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();

            while(resultSet.next()){

                for(int j = 1; j< columnCount; j++){ //column count starts with 1
                    System.out.print(resultSet.getString(j)+ "\t");
                }
                System.out.println();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}
