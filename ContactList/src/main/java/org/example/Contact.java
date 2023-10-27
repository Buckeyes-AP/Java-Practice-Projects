package org.example;

public class Contact {
    // instance variables
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    // constructor
    public Contact() {
        firstName = "";
        lastName = "";
        email = "";
        phone = "";
    }



    // set and get methods for code variable
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }

    public String displayContact() {
        String name = "Name:\t\t\t" + firstName + " " + lastName + "\n";
        String emailAddress = "Email Address:\t" + email + "\n";
        String phoneNumber = "Phone Number:\t" + phone + "\n";
        String dash = "---------------------------\n";
        String title = "--- Current Contact -------\n";
        return "\n" + dash + title + dash + name + emailAddress + phoneNumber + dash;
    }
}
