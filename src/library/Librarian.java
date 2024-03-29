package library;

import java.util.Scanner;

public class Librarian {

    private int librarianID;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    public Librarian(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public int getLibrarianID() {
        return librarianID;
    }

    public void setLibrarianID(int librarianID) {
        this.librarianID = librarianID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Librarian() {
    }

    public static Librarian createLibrarian(Scanner console) {

        System.out.println("Librarian first name:");
        String firstName = console.next();

        System.out.println("Librarian last name:");
        String lastName = console.next();

        System.out.println("Librarian username:");
        String username = console.next();

        System.out.println("Librarian password:");
        String password = console.next();

        Librarian librarian = new Librarian(firstName, lastName, username, password);

        return librarian;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-6d\n", "LibrarianID: ", librarianID) +
                String.format("%-15s %-50s\n", "First Name:", firstName) +
                String.format("%-15s %-50s\n", "Last Name:", lastName) +
                String.format("%-15s %-50s\n", "Username:", username) +
                String.format("%-15s %-50s\n", "Password:", password);

    }
}
