/*
Topic: Exception Handling: Create custom exceptions.
Task: 
A student portal provides user to register their profile, during registration
the system needs to validate the user should be located in India. If not the 
system should throw an exception.
step 1: Create a user defined exception class InvalidCountryException
step 2: Create a main class UserRegistration and following method
registerUser() the parameters are String userName and String userCountry
step 3: Logic inside the methods
        (i) If userCountry is not India throw a InvalidCountryException with the
        Message "User outside India cannot be registered".
        (ii) If userCountry is India print the message "User Registration successful"
      
*/

import java.util.Scanner;

class InvalidCountryException extends Exception {
    InvalidCountryException() {
        super("User Outside India Cannot register.");
    }
}

class UserRegistration {

    void registerUser(String userName, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException();
        } else {
            System.out.println("User Registered Successfully.");
        }
    }

    public static void main(String[] args) {
        UserRegistration newUser = new UserRegistration();
        Scanner scn = new Scanner(System.in);
        String userName = scn.next();
        String userCountry = scn.next();
        try {
            newUser.registerUser(userName, userCountry);
        } catch (InvalidCountryException e) {
            System.out.println(e);
        }
    }
}
