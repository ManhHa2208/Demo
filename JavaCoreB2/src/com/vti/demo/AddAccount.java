package com.vti.demo;

import java.time.LocalDate;

public class AddAccount {

    public static void Ques1(){
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            Account account = new Account();
            account.email = "Email : " + (i+1);
            account.fullName = "FullName" + (i+1);
            account.userName = "Username" + (i+1);
            account.createDate = LocalDate.now();

            accounts[i] = account;

            System.out.println(accounts[i].toString());
        }


    }
}
