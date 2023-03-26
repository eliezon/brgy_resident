/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SCC COMPLAB
 */
public class db_configuration {
    
    private Connection connection;
    
    public db_configuration(){
        try{
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/co_emp", "root", "");
            }catch(SQLException e){
                System.err.println("Cannot connect to database: " + e.getMessage());
            }
        
        
    }
    
    
    public ResultSet getData(String sql) throws SQLException {
        Statement statement = (Statement) connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet;
    }

 public void insertData(String sql){
     try{
         PreparedStatement pstmt = connection.prepareStatement(sql);
         pstmt.executeUpdate();
         System.out.println("Inserted Successfully");
         pstmt.close();
     }catch(SQLException e){
         System.out.println("Connection error" +e);
     
     }
 }
    public int updateData(String sql){
        int num = 0;
        try {
         
            String query = sql;
            PreparedStatement pstmt = connection.prepareStatement(query);
            int rowsUpdated = pstmt.executeUpdate();
            if(rowsUpdated > 0) {
                System.out.println("Data updated successfully!");
                num = 1;
            } else {
                System.out.println("Data update failed!");
                num = 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
        return num;
    }
      public void deleteData(int id) {
    try {
        PreparedStatement stmt = connection.prepareStatement("DELETE FROM tbl_resident WHERE res_id = ?");
        stmt.setInt(1, id);
        int rowsDeleted = stmt.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println(rowsDeleted + " rows were deleted.");
        } else {
            System.out.println("No rows were deleted.");
        }
        stmt.close();
        connection.close();
    } catch (SQLException e) {
        System.out.println("Error deleting data: " + e.getMessage());
    }
}
   
    
}

