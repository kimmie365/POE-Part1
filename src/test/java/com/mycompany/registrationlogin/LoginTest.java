/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registrationlogin;


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    public LoginTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
   

    /**
     * Test of checkUserName method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String user = "ben";
        String pass = "";
        String phone = "";
        String first = "";
        String last = "";
        Login instance = new Login(user, pass, phone, first, last);
        boolean expResult = false;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
   

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String user = "ben";
        String pass = "";
        String phone = "";
        String first = "";
        String last = "";
        Login instance = new Login("kim1_1","chantell","+27821234567","Kyle","Smith");
        instance.password="gjghggg";
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String user = "ben";
        String pass = "Password123!";
        String phone = "+27882319732";
        String first = "Ben";
        String last = "Smith";
        Login instance = new Login(user, pass, phone, first, last);
        boolean expResult = true;
        boolean result = instance.checkCellPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @org.junit.jupiter.api.Test
    public void testCheckCellPhoneNumberFalse() {
        System.out.println("checkCellPhoneNumber");
        String user = "ben";
        String pass = "Password123!";
        String phone = "0882319732";
        String first = "Ben";
        String last = "Smith";
        Login instance = new Login(user, pass, phone, first, last);
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testRegisterUsertrue() {
        System.out.println("registerUser");
        String user = "ben_1";
        String pass = "Password123!";
        String phone = "+2782319732";
        String first = "Ben";
        String last = "Smith";
        Login instance = new Login(user, pass, phone, first, last);
        String expResult = "User has been registered successfully";
        String result = instance.registerUser();
        System.out.print("Actual output:"+ result);
       
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of LoginUser method, of class Login.
     */
    @org.junit.jupiter.api.Test
    public void testLoginUser() {
        System.out.println("LoginUser");
        String enteredUsername = "ben_1";
        String enteredPassword = "Password123!";
        Login instance = new Login("ben_1", "Password123!", "0882319732","Ben","Smith");
        boolean expResult = true;
        boolean result = instance.LoginUser(enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    
    
}
