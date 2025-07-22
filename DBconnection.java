
import java.sql.*;

public class DBconnection {
	 public static Connection getConnection() {
	        Connection conn = null;
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
			    conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/student-db","root","root");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return conn;
	    }

}