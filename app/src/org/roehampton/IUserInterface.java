package org.roehampton;

import java.time.LocalDate;

public interface IUserInterface {
    void start();  // Start the interface loop
    void showMessage(String message);  // Show messages to the user
    String getInput(String prompt);    // Get input from user
    LocalDate getDate(String prompt);  // Ask user for a date
}
