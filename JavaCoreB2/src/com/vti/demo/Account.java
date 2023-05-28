package com.vti.demo;

import java.time.LocalDate;

public class Account {
    String userName;
    String email;
    String fullName;
    LocalDate createDate;

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
