# Email Administration App
An email admin app useful for creating an individual company email based on the department with a unique password.

## Setup
To run the program run the java class emailApp.java located in the src's emailapp package folder.

## Basic Output
You will be presented with the worker name, department codes, and a prompt to enter the code.
```
New Worker: Jason Nembhard 

DEPARTMENT CODES
    1 = Sales, 2 = Development, 3 = Accounting, 0 = none

Enter department code: 
```

For example, entering "3" in the terminal will output the following information:

```
DISPLAY NAME: Jason Nembhard
  COMPANY EMAIL: jason.nembhard@acct.example.com
  MAILBOX CAPACITY: 500 mb
  PASSWORD: DKfWx$Ntyg
```

## Additional Emails
To add additional emails, you can create new objects with the following structure in the emailApp.java class and print the result:

```Java
public class emailApp {
    public static void main(String[] args) {
        Email em2 = new Email("Second", "Name");
        Email em3 = new Email("Third", "Name");

        System.out.println(em2.showInfo());
        System.out.println(em3.showInfo());
    }
}
```
You may add as many as are necessary.

