// java -cp "mysql-connector-java-8.0.16.jar;." jdbc8

import java.sql.*;
import java.time.*;

class jdbc8 {
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
  static final String DB_URL = "jdbc:mysql://localhost/test";
    
  static final String USER = "root";
  static final String PASS = "root";
     
  public static void main(String[] args) throws SQLException {  
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    try{
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
          ResultSet.CONCUR_READ_ONLY);

      String sql;
      sql = "SELECT eno from emp";
      rs = stmt.executeQuery(sql);  
      rs.next();
      System.out.println(rs.getInt("eno")); 
    }   
    catch(SQLException e){
      System.out.println(e.getMessage());
      System.out.println(e.getSQLState());
      System.out.println(e.getErrorCode());
    }
    finally
    {
      conn.close();
    }
  }
}     
