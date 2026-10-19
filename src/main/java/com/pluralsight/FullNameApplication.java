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
        String fullName = firstName;
        if (middleName.isEmpty()) {
            fullName = firstName + " " + lastName;
        }
        if (suffix.isEmpty()){
            fullName = fullName + " " + lastName;
        }
        if (!suffix.isEmpty()){
            fullName = firstName + " " + lastName + " " + suffix;
        }
        if (!middleName.isEmpty()) {
            fullName = firstName + " " + middleName + " " + lastName;
        }


        System.out.println(fullName);




    }
}
