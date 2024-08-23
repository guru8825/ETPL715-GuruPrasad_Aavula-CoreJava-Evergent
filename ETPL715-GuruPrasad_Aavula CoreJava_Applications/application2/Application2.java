package com.evergent.corejava.guru.application;

import java.io.IOException;
import java.util.Scanner;

public class Application2 {

    enum Module {G, P, R, E} // G-General Module, P-Payment Module, R-Report Module, E-Quit Module
    enum SubModule {S, F,E} // S-Select Branch, F-Miscellaneous
    enum Branch {CSE, ECE, ME, CE} // Computer Science, Electronics, Mechanical, Civil
    enum ReportType {I, D,E} // I-Invoice, D-Details
    enum PaymentType {C, D} // C-Cash, D-Debit/Credit Card

    static int branchFee;
    static int libraryFee;
    static int transportFee;
    static int messFee;
    static int specialFee;
    static int totalBranchFees;
    static int amountToBePaid;

    public static void main(String[] args) throws IOException {
        String moduleCode;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\t\t Welcome To ENGINEERING FEE MANAGEMENT SYSTEM");

        while (true) {
            System.out.println("======================");
            System.out.println(" FEE Main Menu");
            System.out.println("======================");
            System.out.println("G-General Module");
            System.out.println("P-Payment Module");
            System.out.println("R-Report Module");
            System.out.println("E-Quit Module");
            System.out.println("======================");
            System.out.println("Enter your Module code (G,P,R,E) : ");
            moduleCode = scanner.nextLine();
            System.out.println("You entered module: " + moduleCode);

           
                switch (Module.valueOf(moduleCode)) {
                    case G:
                        while (true) {
                            System.out.println("======================");
                            System.out.println(" General Module");
                            System.out.println("======================");
                            System.out.println("S-Select Branch");
                            System.out.println("F-Miscelleous Fee");
                            System.out.println("E-Return to Main Menu");
                            System.out.println("======================");
                            System.out.println("Enter your Module code (S,F,E) : ");
                            
                            moduleCode = scanner.nextLine();
                            System.out.println("You entered sub-module: " + moduleCode);

                            switch (SubModule.valueOf(moduleCode)) {
                                case S:
                                    System.out.println("Branch Selection");
                                    System.out.println("======================");
                                    System.out.println("CSE - Computer Science Engineering");
                                    System.out.println("ECE - Electronics and Communication Engineering");
                                    System.out.println("ME - Mechanical Engineering");
                                    System.out.println("CE - Civil Engineering");
                                    System.out.println("======================");
                                    System.out.println("Enter your Branch code (CSE,ECE,ME,CE) : ");
                                    
                                    moduleCode = scanner.nextLine();
                                            switch (Branch.valueOf(moduleCode)) {
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
                                        System.out.println("Branch fee selected: RM " + branchFee);
                                    
                                    break;

                                case F:
                                    System.out.println("Miscellaneous");
                                    System.out.println("======================");
                                    System.out.println("1 - Library Fees");
                                    System.out.println("2 - Transport Fees");
                                    System.out.println("3 - Mess Fees");
                                    System.out.println("4 - Special Fees");
                                    System.out.println("Enter your Fee type code (1,2,3,4) : ");
                                    
                                    moduleCode = scanner.nextLine();
                                    switch (moduleCode) {
                                        case "1":
                                            libraryFee = 1000;
                                            System.out.println("Library Fee: RM " + libraryFee);
                                            break;
                                        case "2":
                                            transportFee = 1500;
                                            System.out.println("Transport Fee: RM " + transportFee);
                                            break;
                                        case "3":
                                            messFee = 2000;
                                            System.out.println("Mess Fee: RM " + messFee);
                                            break;
                                        case "4":
                                            System.out.println("Enter special fee amount: ");
                                            specialFee = Integer.parseInt(scanner.nextLine());
                                            System.out.println("Special Fee: RM " + specialFee);
                                            break;
                                        default:
                                            System.out.println("Invalid Fee Code!");
                                            continue;
                                    }
                                    
                                    // Calculate total fees
                                    totalBranchFees = branchFee + libraryFee + transportFee + messFee + specialFee;
                                    System.out.println("Total fee to be paid: RM " + totalBranchFees);
                                    amountToBePaid = totalBranchFees; // Set the amount to be paid
                                    break;

                                
                            }
                            if (moduleCode.equals("E")) break; // Exit the while loop if user chooses to return to the main menu
                        }
                        break;

                    case P:
                        while (true) {
                            System.out.println("Payment Module");
                            System.out.println("======================");
                            System.out.println("T - Display Total Amount");
                            System.out.println("P - Make Payment");
                            System.out.println("E - Return to Main Menu");
                            System.out.println("======================");
                            System.out.println("Enter your Payment Module code (T,P,E) : ");
                            
                            moduleCode = scanner.nextLine();
                            switch (moduleCode) {
                                case "T":
                                    System.out.println("Total Amount to be Paid: RM " + amountToBePaid);
                                    break;
                                case "P":
                                    System.out.println("Payment Type");
                                    System.out.println("======================");
                                    System.out.println("C - Cash");
                                    System.out.println("D - Debit/Credit Card");
                                    System.out.println("======================");
                                    System.out.println("Enter your Payment type code (C,D) : ");
                                    
                                    moduleCode = scanner.nextLine();
                                    
                                        switch (PaymentType.valueOf(moduleCode)) {
                                            case C:
                                                System.out.println("Payment of RM " + amountToBePaid + " made by Cash.");
                                                break;
                                            case D:
                                                System.out.println("Payment of RM " + amountToBePaid + " made by Debit/Credit Card.");
                                                break;
                                        }
                                    
                                    break;
                                case "E":
                                    // Return to the main menu
                                    break;
                                default:
                                    System.out.println("Invalid Payment Module Code!");
                                    continue;
                            }
                            if (moduleCode.equals("E")) break; // Exit the while loop if user chooses to return to the main menu
                        }
                        break;

                    case R:
                        while (true) {
                            System.out.println("Report Module");
                            System.out.println("======================");
                            System.out.println("I - Invoice");
                            System.out.println("D - Details");
                            System.out.println("E - Return to Main Menu");
                            System.out.println("======================");
                            System.out.println("Enter your Report Module code (I,D,E) : ");
                            
                            moduleCode = scanner.nextLine();
                           
                                switch (ReportType.valueOf(moduleCode)) {
                                    case I:
                                        System.out.println("Invoice Display");
                                        System.out.println("==================");
                                        System.out.println("Branch Fee: RM " + branchFee);
                                        System.out.println("Library Fee: RM " + libraryFee);
                                        System.out.println("Transport Fee: RM " + transportFee);
                                        System.out.println("Mess Fee: RM " + messFee);
                                        System.out.println("Special Fee: RM " + specialFee);
                                        System.out.println("Total Fee: RM " + totalBranchFees);
                                        break;
                                    case D:
                                        System.out.println("Details Report");
                                        System.out.println("======================");
                                        System.out.println("Branch: " + (branchFee > 0 ? "Selected" : "Not Selected"));
                                        System.out.println("Library Fee: " + (libraryFee > 0 ? "Selected" : "Not Selected"));
                                        System.out.println("Transport Fee: " + (transportFee > 0 ? "SELECTED" : "Not Selected"));
                                        System.out.println("Mess Fee: " + (messFee > 0 ? "Selected" : "Not Selected"));
                                        System.out.println("Special Fee: " + (specialFee > 0 ? "Selected" : "Not Selected"));
                                        System.out.println("Total Amount to be Paid: RM " + amountToBePaid);
                                        break;
                                }
                            
                            if (moduleCode.equals("E")) break; // Exit the while loop if user chooses to return to the main menu
                        }
                        break;

                    case E:
                    	System.out.println("THANK YOU");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid Module Code!");
                        continue;
                }
            } 
    }
}




