package de.neeroxz.user;

public class User {
    String firstname;
    String lastname;
    int telefonnumber;
    String email;
    String username;

    public User(String firstname, String lastname, String email, String userName) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTelefonnumber() {
        return telefonnumber;
    }

    public void setTelefonnumber(int telefonnumber) {
        this.telefonnumber = telefonnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
