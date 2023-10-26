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
        String name = firstName + " " + lastName;
        return "Name: " + name + "\n" + "Email Address: " + email + "\n" + "Phone Number: " + phone;
    }
}
