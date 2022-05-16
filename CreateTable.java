import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class table {
    public static void main(String args[]) throws SQLException {
        //Registering the Driver
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //Getting the connection
        String mysqlUrl = "jdbc:mysql://localhost/MOVIE";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
        System.out.println("Connection established......");
        //Creating the Statement
        Statement stmt = con.createStatement();
        //Query to create a table
        String query = "CREATE TABLE Movies("
                + "ID INT NOT NULL, "
                + "MOVIENAME VARCHAR (50) NOT NULL, "
                + "ACTORNAME VARCHAR(50) NOT NULL, "
                + "ACTRESSNAME VARCHAR(50) NOT NULL, "
                + "DIRECTORNAME VARCHAR(50) NOT NULL, "
                + "YearOfRelease NOT NULL, "
                + "PRIMARY KEY (ID))";
        stmt.execute(query);
        System.out.println("Table Created......");
    }
}
