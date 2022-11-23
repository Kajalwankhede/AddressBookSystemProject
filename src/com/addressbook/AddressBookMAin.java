package com.addressbook;

import java.util.Scanner;

public class AddressBookMAin {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("******************Welcome to AddressBook System************************");
        AddressBookDetails addressBook = new AddressBookDetails();

        boolean flag = true;

        while(flag) {

            System.out.println("1.Add Contact");
            System.out.println("2.Display Contact");
            System.out.println("3.Edit Contact");
            System.out.println("4.Delete Contact");
            System.out.println("5.Sort Person details");
            System.out.println("6.Exit");
            System.out.println("Enter Choice: ");

            int option = sc.nextInt();

            switch (option)
            {
                case 1:
                    addressBook.addDetails();
                    break;

                case 2:
                    addressBook.displayDetails();;

                case 3:
                    System.out.println("Enter the FirstName to edit details: ");
                    String firstName = sc.next();

                    boolean update = addressBook.updateDetails(firstName);
                    if (update == true) {
                        System.out.println("Record Updated SuccessFully!!");
                        System.out.println("--------------------------------------------------------");
                    } else {
                        System.out.println("Record Not Found!!");
                        System.out.println("--------------------------------------------------------");
                    }
                    break;


                case 4:
                    flag =false;
                    break;

            }
        }
    }
}
