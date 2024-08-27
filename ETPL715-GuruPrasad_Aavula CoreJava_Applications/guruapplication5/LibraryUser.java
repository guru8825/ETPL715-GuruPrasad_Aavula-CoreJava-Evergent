package com.evergent.corejava.guruapplication5;

public interface LibraryUser {
 void registerAccount(int age) throws NotValidAge;
 void registerBook(String btype) throws NotEligibleForThisBook;
}
