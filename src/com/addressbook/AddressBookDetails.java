package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookDetails {
    public static Scanner sc = new Scanner(System.in);
    public List<AddressBook> list = new ArrayList<AddressBook>();

    public void addDetails() {
        System.out.println("Enter the First name: ");
        String firstName = sc.next();
        System.out.println("Enter the Last name: ");
        String lastName = sc.next();
        System.out.println("Enter the Address: ");
        String address = sc.next();
        System.out.println("Enter the City: ");
        String city = sc.next();
        System.out.println("Enter the State: ");
        String state = sc.next();
        System.out.println("Enter the Zip code: ");
        String zip = sc.next();
        System.out.println("Enter the Email: ");
        String email = sc.next();
        System.out.println("Enter the Phone Number: ");
        String phoneNumber = sc.next();

        list.add(new AddressBook(firstName, lastName, address, city, state, zip, email, phoneNumber));

    }
    public void displayDetails() {
        if (list.isEmpty()) {
            System.out.println("Not Found!");
        } else {
            for (AddressBook contact : list) {
                System.out.println(contact);
            }
        }

    }
}