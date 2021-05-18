package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "example.com";
    private String email;

    // Constructor to receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for the department
        this.department = setDepartment();

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }
    // Ask for the department
    private String setDepartment() {
        System.out.print("New Worker: " + firstName + " " +  lastName + " \n\nDEPARTMENT CODES\n\t" +
                " 1 = Sales, 2 = Development, 3 = Accounting, 0 = none" +
                "\n\nEnter department code: ");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();

        if(depChoice == 1) {return "sales";}
        else if(depChoice == 2) {return "dev";}
        else if(depChoice == 3) {return "acct";}
        else{return "";}
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&";
        char[] password = new char[length];

        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    private void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword() {return password;}

    public String showInfo() {
        return "\nDISPLAY NAME: " + firstName + " " + lastName +
                "\n\tCOMPANY EMAIL: " + email +
                "\n\tMAILBOX CAPACITY: " + mailboxCapacity + " mb" +
                "\n\tPASSWORD: " + password;
    }
}
