package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First Name (Required): ");
        String firstName = scan.nextLine().trim();
        while (firstName.isEmpty()) {
            System.out.println("First Name is REQUIRED");
             firstName = scan.nextLine().trim();
        }
        System.out.println("Last Name: ");
        String lastName = scan.nextLine().trim();
        while (lastName.isEmpty()) {
            System.out.println("Last Name is REQUIRED");
            lastName = scan.nextLine().trim();
        }
        System.out.println("Middle Name (optional): ");
        String middleName = scan.nextLine().trim();
        System.out.println("Suffix (Optional): ");
        String suffix = scan.nextLine().trim();
        //Putting together
       /* String fullName = firstName;
        if (middleName.isEmpty()) {
            fullName = firstName + " " + lastName;
        }
        else if (suffix.isEmpty()){
            fullName = fullName + " " + lastName;
        }
        else if (!suffix.isEmpty()){
            fullName = firstName + " " + lastName + " " + suffix;
        }
        else if (!middleName.isEmpty()) {
            fullName = firstName + " " + middleName + " " + lastName;
        }
        System.out.println();


        System.out.println(fullName);*/

        String fullName = switch (
                //if middle name is empty chose case 0 else case 1 +
    (middleName.isEmpty() ? 0 : 1) +
            //if suffix is empty choose case 0 else case 2
    (suffix.isEmpty() ? 0 : 2)
) {
    case 0 -> firstName + " " + lastName;
    case 1 -> firstName + " " + middleName + " " + lastName;
    case 2 -> firstName + " " + lastName + ", " + suffix;
    case 3 -> firstName + " " + middleName + " " + lastName + ", " + suffix;
    default -> firstName + " " + lastName;
};

System.out.println("Full name: " + fullName);




    }
}
