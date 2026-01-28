package com.naman.validator;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonValidator {

    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public static boolean isValidAge(int age) {
        return age > 0;
    }

    public static void main(String[] args) throws IOException {

            ObjectMapper mapper = new ObjectMapper();

            User[] users = mapper.readValue(new File("users.json"), User[].class);

            for (User user : users) {
                if (!isValidEmail(user.getEmail())) {
                    System.out.println("User ID " + user.getId() + " invalid: Invalid email --->" + user.getEmail() );
                }
                if (!isValidAge(user.getAge())) {
                    System.out.println("User ID " + user.getId() + " invalid: Age must be > 0 ---> " + user.getAge() );
                }
            }




    }
}
