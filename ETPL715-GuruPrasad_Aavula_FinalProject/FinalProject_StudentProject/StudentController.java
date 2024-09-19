package com.evergent.corejava.FinalProject.StudentProject;

import java.util.Scanner;

public class StudentController {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();

        System.out.println("------------------------WELCOME TO YOUR Student Fee Management System---------------------");

        while (true) {
            System.out.println("1. Create a New Student Account");
            System.out.println("2. To Check The Facilities Opted By Student");
            System.out.println("3. Show Student Total Fee To be Paid");
            System.out.println("4. To Pay Amount Now");
            System.out.println("5.To Print All Transactions ");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int studentId = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter The Student Name: ");
                    String studentName = sc.nextLine();
                    System.out.print("Enter Mobile Number: ");
                    long studentMobileNumber = sc.nextLong();
                    double studentTotalFee = studentService.FacilitiesProvidedByManagement();
                    System.out.println("The student total fee: " + studentTotalFee);
                    System.out.print("Enter Student Fee Paid Till Now: ");
                    double studentTotalPaidFee = sc.nextDouble();
                    double studentTotalFeeToBePaid=studentTotalFee-studentTotalPaidFee;
                    int updateCount = studentService.createStudentAccount(studentId, studentName, studentMobileNumber, studentTotalFee, studentTotalPaidFee,studentTotalFeeToBePaid);
                    System.out.println(updateCount + " Account Created successfully");
                    break;

                case 2:
                	System.out.print("Enter The Student ID: ");
                	studentService.getFacilitiesOptedByStudent(sc.nextInt());
                    break;

                case 3:
                    try {
                        System.out.print("Enter The Student ID: ");
                        double totalFees = studentService.showStudentFeeToBePaid(sc.nextInt());
                        System.out.println("The Total Fee To Be Paid by Student: " + totalFees);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Enter the Student ID: ");
                        studentService.amountPayingNow(sc.nextInt());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    try {
                        studentService.printTransactions();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 6:
                    System.out.println("Exiting the system.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    break;
                
            }
        }
    }
}
