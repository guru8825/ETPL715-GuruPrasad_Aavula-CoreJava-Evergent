package com.evergent.corejava.guru.CaseStudy;

public class Ticket {
	private int number;
    private String description;
    public Ticket(int number, String description) {
        this.number = number;
        this.description = description;
    }
    public int getNumber() {
        return number;
    }
    public String getDescription() {
        return description;
    }
    @Override
    public String toString() {
        return "Ticket Number = " + number + ", Description = " + description;
    }
}
