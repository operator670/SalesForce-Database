import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class insert {
    public static void main(String args[]) throws SQLException {
        //Registering the Driver
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //Getting the connection
        String mysqlUrl = "jdbc:mysql://localhost/MOVIE";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
        System.out.println("Connection established......");
        //Creating the Statement
        Statement stmt = con.createStatement();
        //Query to insert records
        String query = "INSERT INTO MOVIES(" + "ID, MOVIENAME, ACTORNAME, ACTRESSNAME, DIRECTORNAME,YearOfRelease) VALUES "
                + "(1000, 'Avataar','Jason Manley','Scarlette Johnson','Christopher Nolan','2009/09/11  '), "
                + "(2000, 'The Batman','Ash Pheonix', 'April Juile', 'Jesus Son','2018/01/12'), "
                + "(3000, 'Spiderman No Way Home','Tom Holland', 'Zendaya', 'John Watts','2021/12/16'), "
                + "(4000, 'Joker','Joaquin Phoenix', 'Zazie Beetz', 'Todd Phillips','2019/08/02') ";

        int i = stmt.executeUpdate(query);
        System.out.println("Data Inserted: "+i);
    }
}