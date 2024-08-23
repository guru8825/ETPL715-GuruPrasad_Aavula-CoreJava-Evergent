package com.evergent.corejava.guru.application4;
import java.util.Scanner;

public class FeeManagement extends FeeDetails implements StudentInterface {
static Scanner scanner=new Scanner(System.in);
    public FeeManagement() {
        // Initialize fees to zero
        libraryFee = 0;
        transportFee = 0;
        messFee = 0;
        specialFee = 0;
    }

    // Calculate total fees
    @Override
    public void calculateTotalFees() {
        totalBranchFees = branchFee + libraryFee + transportFee + messFee + specialFee;
        amountToBePaid = totalBranchFees;
    }

    // Method to select branch and set branch fee
     public void branchSelection() {
        System.out.println("Branch Selection");
        System.out.println("======================");
        System.out.println("CSE - Computer Science Engineering");
        System.out.println("ECE - Electronics and Communication Engineering");
        System.out.println("ME - Mechanical Engineering");
        System.out.println("CE - Civil Engineering");
        System.out.println("======================");
        System.out.print("Enter your Branch code (CSE,ECE,ME,CE) : ");
        String branchCode = scanner.nextLine().toUpperCase();

        try {
            Branch branch = Branch.valueOf(branchCode);
            switch (branch) {
                case CSE:
                    branchFee = 50000;
                    break;
                case ECE:
                    branchFee = 48000;
                    break;
                case ME:
                    branchFee = 47000;
                    break;
                case CE:
                    branchFee = 45000;
                    break;
            }
            System.out.println("Branch fee selected: RS " + branchFee);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Branch Code!");
            return;
        }

        calculateTotalFees(); // Calculate total fees after setting branch fee
    }

    // Method to calculate miscellaneous fees
    public void calculateMiscellaneousFees() {
        System.out.println("Miscellaneous");
        System.out.println("======================");
        System.out.println("1 - Library Fees");
        System.out.println("2 - Transport Fees");
        System.out.println("3 - Mess Fees");
        System.out.println("4 - Special Fees");
        System.out.print("Enter your Fee type code (1,2,3,4) : ");
        String feeCode = scanner.nextLine();

        switch (feeCode) {
            case "1":
                libraryFee = 1000;
                break;
            case "2":
                transportFee = 1500;
                break;
            case "3":
                messFee = 2000;
                break;
            case "4":
                System.out.print("Enter special fee amount: ");
                specialFee = Integer.parseInt(scanner.nextLine());
                break;
            default:
                System.out.println("Invalid Fee Code!");
                return;
        }

        calculateTotalFees();
        System.out.println("Total fee to be paid: RS " + totalBranchFees);
    }

    // Method to process payment
    public final void processPayment() {
        System.out.println("Payment Type");
        System.out.println("======================");
        System.out.println("C - Cash");
        System.out.println("D - Debit/Credit Card");
        System.out.print("Enter your Payment type code (C,D) : ");
        String paymentType = scanner.nextLine().toUpperCase();
        try {
            PaymentType type = PaymentType.valueOf(paymentType);
            switch (type) {
                case C:
                    System.out.println("Payment of RS " + amountToBePaid + " made by Cash.");
                    break;
                case D:
                    System.out.println("Payment of RS " + amountToBePaid + " made by Debit/Credit Card.");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Payment Type Code!");
        }
    }

    // Implement the studentInfo method
    @Override
    public void studentInfo(int studentId, Branch branch) {
        System.out.println("Student ID: " + studentId);
        System.out.println("Branch: " + branch);
    }
}


