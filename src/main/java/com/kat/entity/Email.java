package com.kat.entity;


import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private int defaultPassL = 10;
    private String department;
    private int mailboxCapacity = 500;
    private String alternativeEmail;
    private String email;
    private String compSuffix = "funcompany.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();

        this.password = generateRandomPass(defaultPassL);
        System.out.println("PASSWORD: " + password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase()+ "@" + department + "." + compSuffix;
    }

    private String setDepartment() {
        System.out.println("New worker: " + firstName + ". Department codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter the department code");
        ;
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();

        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acc";
        } else {
            return "";
        }
    }

    private String generateRandomPass(int lenght){
        String passSet = "ABCDEFGHIJKLMNOPRSTUVWXYZ1234567890!@#$%^&*();";

        char[] password = new char[lenght];

        for (int i=0; i<lenght; i++){
            int random = (int) (Math.random() * passSet.length());
            password[i] = passSet.charAt(random);
        }
        return new String (password);
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showAccInformation(){
        return "Display name: " + firstName + " " + lastName + " " +
                "\nCompany email: " + email + " " +
                "\nMailbox capacity: " + mailboxCapacity + "mb";
    }

}
