package com.evergent.corejava.FinalProject.StudentProject;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentDBConnection {
    public static Connection createConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/finalprojectcorejava", "root", "admin"); 
    }
}

