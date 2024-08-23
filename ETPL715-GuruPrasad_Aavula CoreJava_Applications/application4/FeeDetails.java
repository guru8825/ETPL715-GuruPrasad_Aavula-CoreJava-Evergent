package com.evergent.corejava.guru.application4;
public abstract class FeeDetails {
    protected int branchFee;
    protected int libraryFee;
    protected int transportFee;
    protected int messFee;
    protected int specialFee;
    protected int totalBranchFees;
    protected int amountToBePaid;

    // Abstract method to calculate total fees
    public abstract void calculateTotalFees();

    // Method to display fees
    public void displayFees() {
        System.out.println("Branch Fee: RM " + branchFee);
        System.out.println("Library Fee: RM " + libraryFee);
        System.out.println("Transport Fee: RM " + transportFee);
        System.out.println("Mess Fee: RM " + messFee);
        System.out.println("Special Fee: RM " + specialFee);
        System.out.println("Total Fee: RM " + totalBranchFees);
    }
}




