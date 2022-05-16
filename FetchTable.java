import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class fetch {
    public static void main(String args[]) throws SQLException {
        //Registering the Driver
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //Getting the connection
        String mysqlUrl = "jdbc:mysql://localhost/MOVIE";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
        System.out.println("Connection established......");
        //Creating the Statement
        Statement stmt = con.createStatement();
        //Query to retrieve records
        String query = "Select * from Movies";
        //Executing the query
        ResultSet rs = stmt.executeQuery(query);
        System.out.println("MOVIE table:");
        while(rs.next()) {
            //Attributes
            System.out.print("ID: "+rs.getInt("ID")+", ");
            System.out.print("Movie Name: "+rs.getString("MOVIENAME")+", ");
            System.out.print("Actor Name: "+rs.getString("ACTORNAME")+", ");
            System.out.print("Actress Name: "+rs.getString("ACTRESSNAME")+", ");
            System.out.print("Director Name: "+rs.getString("DIRECTORNAME")+", ");
            System.out.print("Year of release: "+rs.getDate("YearOfRelease"));
            System.out.println();
        }
        System.out.println(" ");
        String sql = "Select * from Movies where MOVIENAME = 'Spiderman No Way Home' ";
        rs = stmt.executeQuery(sql);
        while(rs.next()) {
            System.out.print("ID: "+rs.getInt("ID")+", ");
            System.out.print("Movie Name: "+rs.getString("MOVIENAME")+", ");
            System.out.print("Actor Name: "+rs.getString("ACTORNAME")+", ");
            System.out.print("Actress Name: "+rs.getString("ACTRESSNAME")+", ");
            System.out.print("Director Name: "+rs.getString("DIRECTORNAME")+", ");
            System.out.print("Year of Release: "+rs.getDate("YearOfRelease"));
            System.out.println();
        }
    }
}
