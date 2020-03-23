// This is an example of Java code with some bad practices, dont try this at home or in prod ;-)
//
// lots of wildcard imports
//
import java.*;
import java.util.*;
import java.sql.*;
import java.io.*
  
// a public class badcode  
public class badcode {

  public static void main(String[] args) {
      
        String connectionUrl = "d";
        String password = "asd123";

  		// Declare the JDBC objects.
  		Connection con = null;
  		Statement stmt = null;
  		ResultSet rs = null;
      String notusedvar;

          	try {
          		// Establish the connection.
          		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              		con = DriverManager.getConnection(connectionUrl);

              		// Create and execute an SQL statement that returns some data.
              		String SQL = "SELECT TOP 10 * FROM Person.Contact";
              		stmt = con.createStatement();
              		rs = stmt.executeQuery(SQL);

              		// Iterate through the data in the result set and display it.
              		while (rs.next()) {
              			System.out.println(rs.getString(4) + " " + rs.getString(6));
              		}
          	}

  		// Handle any errors that may have occurred.
      // generic exception handler
  		catch (Exception e) {
  			e.printStackTrace();
  		}

    //**
    // commenting this out deliberately ..
    // 
  		finally {
  			if (rs != null) try { rs.close(); } catch(Exception e) {}
  	    		if (stmt != null) try { stmt.close(); } catch(Exception e) {}
  	    		if (con != null) try { con.close(); } catch(Exception e) {}
  		}
  	}
    **/

}