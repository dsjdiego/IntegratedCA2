/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

//GITHUB LINK: https://github.com/dsjdiego/IntegratedCA2.git

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */

// Defines a class named DBConnection to handle database connections.
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/integratedca2";
    private static final String USER = "root";
    private static final String PASSWORD = "Di101010@";

    // Static method that attempts to establish a connection to the database.
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (ClassNotFoundException | SQLException e) {
                return null;
            }
    } 
}   
