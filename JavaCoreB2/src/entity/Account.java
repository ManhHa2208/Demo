package entity;


import java.time.LocalDate;

public class Account {

     int id;
     String email;
     String userName;
     String fullName;

     @Override
     public String toString() {
          return "Account{" +
                  "id=" + id +
                  ", email='" + email + '\'' +
                  ", userName='" + userName + '\'' +
                  ", fullName='" + fullName + '\'' +
                  '}';
     }
}

