/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationlogin;

import java.util.regex.Pattern;

/**
 *
 * @author Student
 */
public class Login {

    private String username;
    private String password;
    private String cellPhoneNumber;
    private String FirstName;
    private String LastName;
    
    public Login(String username, String password, String cellPhoneNumber, String FirstName, String LastName) {
        this.username = username;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity() {
        boolean hasCapitalLetter
                = !password.equals(password.toLowerCase());
        boolean hasNumber
                = password.matches(".*\\d.*");
        boolean hasSpecialCharacter
                = password.matches(".*[^a-zA-Z0-9].*");
        return password.length() >= 8
                && hasCapitalLetter
                && hasNumber
                && hasSpecialCharacter;

    }

    public boolean checkCellPhoneNumber() {
        String regex = "^\\+27|27[0-9]{9}$";
        return Pattern.matches(regex, cellPhoneNumber);

    }

    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly structured;please ensure that your username comtains an underscore and is no more than five characters in length.";
        } else if (!checkPasswordComplexity()) {
            return "password is not correctly structured ;please ensure that the password contains ar least eight charactera, a capital Letter, and a special character.";
        } else if (!checkCellPhoneNumber()) {
            return "Cell phone number incorrectly structured .";
        } else {
            return "Username and password succesfully captured.";

        }
    }

    public boolean LoginUser(String enteredUsername,
            String enteredPassword) {
        return username.equals(enteredUsername)
                && password.equals(enteredPassword);
    }

    public String returnLoginStatus(String enteredUsername, String enteredPassword) {
        if(LoginUser(enteredUsername, enteredPassword)){
            return "welcome" + FirstName + "" + LastName+ ",it is a pleasure to see you again";
        }else {
            return "Username or password incorrect, please try again";
        }
    }

}
