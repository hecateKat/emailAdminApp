package com.kat;

import com.kat.entity.Email;

public class EmailApp {

    public static void main(String[] args) {

        Email email1 = new Email("Ann", "Rosa");
        System.out.println(email1.showAccInformation());
    }
}
