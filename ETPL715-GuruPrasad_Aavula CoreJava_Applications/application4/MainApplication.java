package com.evergent.corejava.guru.application4;


import java.util.Scanner;

public class MainApplication {
static	 Scanner scanner = new Scanner(System.in);
    //enum Module {G, P, R, E} // G-General Module, P-Payment Module, R-Report Module, E-Quit Module
   // enum SubModule {S, F, E} // S-Select Branch, F-Miscellaneous
   // enum Branch {CSE, ECE, ME, CE} // Computer Science, Electronics, Mechanical, Civil
   //enum ReportType {I, D, E} // I-Invoice, D-Details
  //  enum PaymentType {C, D} // C-Cash, D-Debit/Credit Card
static {
	System.out.println("\n\t\t\t Welcome To ENGINEERING FEE MANAGEMENT SYSTEM");
}
    public static void main(String[] args)  {
       
        FeeManagement feeManagement = new FeeManagement();

        

        while (true) {
            System.out.println("======================");
            System.out.println(" FEE Main Menu");
            System.out.println("======================");
            System.out.println("G-General Module");
            System.out.println("P-Payment Module");
            System.out.println("R-Report Module");
            System.out.println("E-Quit Module");
            System.out.println("======================");
            System.out.print("Enter your Module code (G,P,R,E) : ");
            String moduleCode = scanner.nextLine().toUpperCase();
            System.out.println("You entered module: " + moduleCode);

            switch (Module.valueOf(moduleCode)) {
                case G:
                    handleGeneralModule( feeManagement);
                    break;

                case P:
                    handlePaymentModule(feeManagement);
                    break;

                case R:
                    handleReportModule( feeManagement);
                    break;

                case E:
                    System.out.println("THANK YOU");
                    System.exit(0);

                default:
                    System.out.println("Invalid Module Code!");
            }
        }
    }

    private static final void handleGeneralModule(FeeManagement feeManagement) {
        while (true) {
            System.out.println("======================");
            System.out.println(" General Module");
            System.out.println("======================");
            System.out.println("S-Select Branch");
            System.out.println("F-Miscellaneous Fee");
            System.out.println("E-Return to Main Menu");
            System.out.println("======================");
            System.out.print("Enter your Module code (S,F,E) : ");
            String moduleCode = scanner.nextLine().toUpperCase();

            switch (SubModule.valueOf(moduleCode)) {
                case S:
                    feeManagement.branchSelection();
                    break;

                case F:
                    feeManagement.calculateMiscellaneousFees();
                    break;

                case E:
                    return;

                default:
                    System.out.println("Invalid Sub-Module Code!");
            }
        }
    }

    private static final void handlePaymentModule(FeeManagement feeManagement) {
        while (true) {
            System.out.println("Payment Module");
            System.out.println("======================");
            System.out.println("T - Display Total Amount");
            System.out.println("P - Make Payment");
            System.out.println("E - Return to Main Menu");
            System.out.println("======================");
            System.out.print("Enter your Payment Module code (T,P,E) : ");
            String moduleCode = scanner.nextLine().toUpperCase();

            switch (moduleCode) {
                case "T":
                    System.out.println("Total Amount to be Paid: RM " + feeManagement.amountToBePaid);
                    break;

                case "P":
                    feeManagement.processPayment();
                    break;

                case "E":
                    return;

                default:
                    System.out.println("Invalid Payment Module Code!");
            }
        }
    }

    private static final void handleReportModule( FeeManagement feeManagement) {
        while (true) {
            System.out.println("Report Module");
            System.out.println("======================");
            System.out.println("I - Invoice");
            System.out.println("D - Details");
            System.out.println("E - Return to Main Menu");
            System.out.println("======================");
            System.out.print("Enter your Report Module code (I,D,E) : ");
            String moduleCode = scanner.nextLine().toUpperCase();

            switch (ReportType.valueOf(moduleCode)) {
                case I:
                    feeManagement.displayFees();
                    break;

                case D:
                    System.out.println("Details Report");
                    System.out.println("======================");
                    System.out.println("Branch: " + (feeManagement.branchFee > 0 ? "Selected" : "Not Selected"));
                    System.out.println("Library Fee: " + (feeManagement.libraryFee > 0 ? "Selected" : "Not Selected"));
                    System.out.println("Transport Fee: " + (feeManagement.transportFee > 0 ? "Selected" : "Not Selected"));
                    System.out.println("Mess Fee: " + (feeManagement.messFee > 0 ? "Selected" : "Not Selected"));
                    System.out.println("Special Fee: " + (feeManagement.specialFee > 0 ? "Selected" : "Not Selected"));
                    System.out.println("Total Amount to be Paid: RM " + feeManagement.amountToBePaid);
                    break;

                case E:
                    return;

                default:
                    System.out.println("Invalid Report Module Code!");
            }
        }
    }
}
