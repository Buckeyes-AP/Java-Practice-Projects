package org.example;




public class ContactListApp {
    public static void main(String[] args) {

        Console.displayWelcome();
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            Contact contact = new Contact();
            String first = Console.getString("Enter first name: ");
            String last = Console.getString("Enter last name: ");
            String email = Console.getString("Enter email: ");
            String phone = Console.getString("Enter phone: ");

            contact.setFirstName(first);
            contact.setLastName(last);
            contact.setEmail(email);
            contact.setPhone(phone);

            System.out.println(contact.displayContact());
            choice = Console.getString("Continue? (y/n): ", "y", "n");
            System.out.println();
        }
        System.out.println("Goodbye!");
    }
}