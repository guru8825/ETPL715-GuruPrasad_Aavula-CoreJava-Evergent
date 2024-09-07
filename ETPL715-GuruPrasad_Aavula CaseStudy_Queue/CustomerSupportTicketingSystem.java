package com.evergent.corejava.guru.CaseStudy;
import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;

class QueueEmptyException extends Exception {
    public QueueEmptyException(String message) {
        super(message);
    }
}

public class CustomerSupportTicketingSystem {
    private Deque<Ticket> ticketQueue = new ArrayDeque<>();
    static Scanner sc = new Scanner(System.in);
   static int number=0;

    // Method to add a ticket to the queue
    public void addTicket() {
    	 System.out.print("Enter Your Ticket Description : ");
         String newTicketDescription = sc.nextLine();
         int ticketNumber=++number;
         Ticket ticket=new Ticket(ticketNumber,newTicketDescription);
        ticketQueue.add(ticket);
        System.out.println("Your Ticket \"" + newTicketDescription + "\" has been added successfully.");
    }

    // Method to process the next ticket
    public void processNextTicket() throws QueueEmptyException {
        Ticket processedTicket = ticketQueue.poll();
        if (processedTicket == null) {
            throw new QueueEmptyException("Oops! Queue is empty.");
        }
        System.out.println("The Ticket \"" + processedTicket + "\" has been processed.");
    }

    // Method to peek at the next ticket
    public void peekNextTicket() throws QueueEmptyException {
        Ticket peekedTicket = ticketQueue.peek();
        if (peekedTicket == null) {
            throw new QueueEmptyException("Oops! Queue is empty.");
        }
        else {
        System.out.println("The Next Ticket in the Queue is: \"" + peekedTicket + "\"");
        }
    }

    // Method to display all tickets in the queue
    public void displayQueue() {
        if (ticketQueue.isEmpty()) {
            System.out.println("The queue is currently empty.");
        } else {
            System.out.println("The Tickets in the Queue are: " + ticketQueue);
        }
    }
    static {
   	 System.out.println("\t\tWelcome To Customer Support Ticketing System");
   }
    public static void main(String[] args) {
    	
       
        CustomerSupportTicketingSystem ticketSystem = new CustomerSupportTicketingSystem();
       

        while (true) {
        	
            System.out.println("Ticket Management System ");
            System.out.println("The Available Options are --");
            System.out.println("1 - Add A New Ticket To Queue");
            System.out.println("2 - Process The Next Ticket");
            System.out.println("3 - Display The Next Ticket in Queue");
            System.out.println("4 - Display All Tickets in Queue");
            System.out.println("5 - Exit");
            System.out.print("Choose Your Option: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1-5.");
                continue;
            }
        

            try {
                switch (choice) {
                    case 1:
                    	ticketSystem.addTicket();
                        break;
                    case 2:
                        ticketSystem.processNextTicket();
                        break;
                    case 3:
                        ticketSystem.peekNextTicket();
                        break;
                    case 4:
                        ticketSystem.displayQueue();
                        break;
                    case 5:
                        System.out.println("Thank you for using the Customer Support Ticketing System.");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (QueueEmptyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
