package com.evergent.corejava.FinalProject.StudentProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.util.List;
import java.util.HashMap;
public class StudentDAO {
	HashMap<String,String> hs=new HashMap<>();
    public int createStudentAcc(StudentBean sBean) {
        try (Connection con = StudentDBConnection.createConnection();
             PreparedStatement pstmt = con.prepareStatement("INSERT INTO student (studentId, studentName, studentMobileNumber, studentTotalFee, studentTotalPaidFee,totalfeetobepaid) VALUES (?, ?, ?, ?, ?,?)")) {
            pstmt.setInt(1, sBean.getStudentId());
            pstmt.setString(2, sBean.getStudentName());
            pstmt.setLong(3, sBean.getStudentMobileNumber());
            pstmt.setDouble(4, sBean.getStudentTotalFee());
            pstmt.setDouble(5, sBean.getStudentTotalPaidFee());
            pstmt.setDouble(6, sBean.getStudentTotalFeeToBePaid());
            
            return pstmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return 0;
        }
    }

    public double showFeeToBePaid(int studentId) {
        try (Connection con = StudentDBConnection.createConnection();
             PreparedStatement pstmt = con.prepareStatement("SELECT studentTotalFee - studentTotalPaidFee FROM student WHERE studentId = ?")) {
            pstmt.setInt(1, studentId);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getDouble(1);
            }
            return 0;
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }
    public HashMap getFacilitiesChoosenByStudent(int sId) {
    	
    	try {
    		Connection con = StudentDBConnection.createConnection();
                PreparedStatement pstmt = con.prepareStatement("SELECT * FROM OptionsChoosen where Id=?");
                pstmt.setInt(1, sId);
                ResultSet rs = pstmt.executeQuery();
                		 while (rs.next()) {
                             int studentId = rs.getInt("Id");
                             String branch=rs.getString("Branch");
                             String choosenLibraryFee=rs.getString("choosenLibraryFee");
                             String choosenTransportFee=rs.getString("choosenTransportFee");
                            String  choosenMessFee=rs.getString("choosenMessFee");
                            String choosenSpecialFee=rs.getString("choosenSpecialFee");
                            
                           // hs.put("Student Id",studentId);
                            hs.put("Branch Selected      ",branch);
                            hs.put("Library Selected     ",choosenLibraryFee);
                            hs.put("Transport Selected   ",choosenTransportFee);
                            hs.put("Mess Selected        ",choosenMessFee);  
                            hs.put("Special Fee  Selected",choosenSpecialFee);  
                           
}
    }
    catch (Exception e) {
        System.out.println(e.toString());
        
       
    }
    	return hs;}
    public void setFacilitiesChoosenByStudent(int studentId,String branch,String choosenLibraryFee,String choosenTranportFee,String choosenMessFee,String choosenSpecialFee) {
        try (Connection con = StudentDBConnection.createConnection();
        		
             PreparedStatement pstmt = con.prepareStatement("INSERT INTO OptionsChoosen (Id,branch,choosenLibraryFee,choosenTransportFee,choosenMessFee,choosenSpecialFee) VALUES (?, ?, ?, ?, ?,?)")) {
            pstmt.setInt(1,studentId);
            pstmt.setString(2,branch);
            pstmt.setString(3,choosenLibraryFee);
            pstmt.setString(4,choosenTranportFee);
            pstmt.setString(5,choosenMessFee);
            pstmt.setString(6,choosenSpecialFee);
              pstmt.executeUpdate();
          
            
        } catch (Exception e) {
            System.out.println(e.toString());
           
        }
    }
    public int updateStudentFee(int studentId, double amountPaid) {
        try (Connection con = StudentDBConnection.createConnection();
             PreparedStatement pstmt = con.prepareStatement("UPDATE student SET studentTotalPaidFee = studentTotalPaidFee + ? WHERE studentId = ?")) {
            pstmt.setDouble(1, amountPaid);
            pstmt.setInt(2, studentId);

            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public List<String> getAllTransactions() {
        List<String> transactions = new ArrayList<>();
        try (Connection con = StudentDBConnection.createConnection();
             PreparedStatement pstmt = con.prepareStatement("SELECT studentId, studentTotalPaidFee FROM student");
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int studentId = rs.getInt("studentId");
                double totalPaidFee = rs.getDouble("studentTotalPaidFee");
                transactions.add("Student ID:    " + studentId + ", Total Paid Fee Till Now: " + totalPaidFee);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return transactions;
    }
}
