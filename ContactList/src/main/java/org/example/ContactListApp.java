package org.example;


import java.util.Scanner;

public class ContactListApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Contact List application");

        Contact contact = new Contact();
        System.out.println("Enter first name: ");
        String first = sc.nextLine();
        contact.setFirstName(first);
        
        System.out.println(contact.getFirstName());
    }
}