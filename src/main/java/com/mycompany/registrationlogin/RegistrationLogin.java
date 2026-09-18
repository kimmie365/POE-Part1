/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationlogin;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class RegistrationLogin {

    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("===== REGISTRATION =====");

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        System.out.print("Enter your South African cell phone number: ");
        String cellPhoneNumber = scanner.nextLine();

        Login user = new Login(
                username,
                password,
                cellPhoneNumber,
                firstName,
                lastName
        );

System.out.println();
System.out.println(user.registerUser());

if (user.checkUserName()
        && user.checkPasswordComplexity()
        && user.checkCellPhoneNumber()) {

    System.out.println();
    System.out.println("===== LOGIN =====");

    System.out.print("Enter your username: ");
    String loginUsername = scanner.nextLine();

    System.out.print("Enter your password: ");
    String loginPassword = scanner.nextLine();

    System.out.println();

    System.out.println(
            user.returnLoginStatus(
                    loginUsername,
                    loginPassword
            )
    );

} else {

    System.out.println();
    System.out.println("Registration unsuccessful.");
}

scanner.close();
    }
        
        
        
        
    }

