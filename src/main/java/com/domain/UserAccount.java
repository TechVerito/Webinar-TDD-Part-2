package com.domain;

import java.util.Objects;

public class UserAccount {

    private String username;
    private String password;
    private String firstname;
    private String lastName;

    public UserAccount(final String username, final String password, final String firstname, final String lastName) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastName = lastName;
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final UserAccount that = (UserAccount) o;
        return Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, firstname, lastName);
    }

    public String fullName() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
