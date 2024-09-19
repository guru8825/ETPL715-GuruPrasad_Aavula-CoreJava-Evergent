package com.evergent.corejava.FinalProject.StudentProject;

import java.util.Scanner;
import java.util.HashMap;
import java.util.List;

public class StudentService {
    StudentDAO studentDAO = new StudentDAO();
    static int branchFee = 0;
    static int libraryFee = 0;
    static int transportFee = 0;
    static int messFee = 0;
    static int specialFee = 0;
    static int totalFees = 0;
    static String branch="";

    public int createStudentAccount(int studentId, String studentName, long studentMobileNumber, double studentTotalFee, double studentTotalPaidFee,double studentTotalFeeToBePaid) {
        StudentBean studentBean = new StudentBean();
        studentBean.setStudentId(studentId);
        studentBean.setStudentName(studentName);
        studentBean.setStudentMobileNumber(studentMobileNumber);
        studentBean.setStudentTotalFee(studentTotalFee);
        studentBean.setStudentTotalPaidFee(studentTotalPaidFee);
        studentBean.setStudentTotalFeeToBePaid(studentTotalFeeToBePaid);
        setFacilitiesOptedBtStudent(studentId);

        return studentDAO.createStudentAcc(studentBean);
    }
  public void setFacilitiesOptedBtStudent(int studentId) {
    	
    	String choosenLibraryFee=(libraryFee>0)?"Yes":"No";
    	String choosenTranportFee=(transportFee>0)?"Yes":"No";
    	String choosenMessFee=(messFee>0)?"Yes":"No";
    	String choosenSpecialFee=(specialFee>0)?"Yes":"No";
    	studentDAO.setFacilitiesChoosenByStudent(studentId,branch,choosenLibraryFee,choosenTranportFee,choosenMessFee,choosenSpecialFee);

    }
    public double FacilitiesProvidedByManagement() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("To calculate your Total Fee Select Your option in each section Accordingly ");
        System.out.println("Select Branch:");
        System.out.println("1. CSE - Computer Science Engineering");
        System.out.println("2. ECE - Electronics and Communication Engineering");
        System.out.println("3. ME - Mechanical Engineering");
        System.out.println("4. CE - Civil Engineering");
        System.out.println("Select One Option from {1,2,3,4}:");

        int branchCode = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        switch (branchCode) {
            case 1:
            	
                branchFee = 50000;
                branch="CSE";
                break;
            case 2:
                branchFee = 48000;
                branch="ECE";
                break;
            case 3:
                branchFee = 47000;
                branch="ME";
                break;
            case 4:
                branchFee = 45000;
                branch="CE";
                break;
            default:
                System.out.println("Invalid Branch Code!");
                return 0;
        }
        
        while (true) {
            System.out.println("Select Miscellaneous Fee:");
            System.out.println("1. Library Fees");
            System.out.println("2. Transport Fees");
            System.out.println("3. Mess Fees");
            System.out.println("4. Special Fees");
            System.out.println("5. Finish and Calculate Total Fee");
            System.out.println("Enter Your Choice{1,2,3,4,5}:");
            
            int feeCode = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (feeCode) {
                case 1:
                    libraryFee = 1000;
                    break;
                case 2:
                    transportFee = 1500;
                    break;
                case 3:
                    messFee = 2000;
                    break;
                case 4:
                    System.out.print("Enter special fee amount: ");
                    specialFee = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    break;
                case 5:
                    // Exit the loop and calculate total fees
                    totalFees = branchFee + libraryFee + transportFee + messFee + specialFee;
                    System.out.println("Total fee to be paid: " + totalFees);
                    return totalFees;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
           
        }
    }


    public double showStudentFeeToBePaid(int studentId) {
        return studentDAO.showFeeToBePaid(studentId);
    }

  
    public void amountPayingNow(int studentId) {
        double amountToBePaid = showStudentFeeToBePaid(studentId);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount Paying Now: ");
        double amountPaid = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        if (amountPaid <= amountToBePaid) {
            int updateCount = studentDAO.updateStudentFee(studentId, amountPaid);
            if (updateCount > 0) {
                System.out.println("Amount paid successfully.");
            } else {
                System.out.println("Failed to update the payment.");
            }
        } else {
            System.out.println("Amount exceeds the total fee to be paid.");
        }
    }
    public void getFacilitiesOptedByStudent(int studentId) {
    	HashMap<String,String> result=studentDAO.getFacilitiesChoosenByStudent(studentId);
    	if(result.isEmpty()) {
    		System.out.println("NO Facilities  Choosen or Employee Not registered");
    	}
    	else {
    		for(Object o:result.keySet()) {
    			System.out.println(o+"  :"+result.get(o));
    		}
    	}
    }

    public void printTransactions() {
        List<String> transactions = studentDAO.getAllTransactions();
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
        	transactions.forEach(System.out::println);
        }
    }
}
