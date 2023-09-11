package bank.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SBI.rateOfInterest = 7;
        HDFCBank.rateOfInterest = 6;

        SBI account1 = new SBI(100000,"123","Rahul");

        SBI account2 = new SBI(150000,"456","Dhakad");

        HDFCBank account3 = new HDFCBank(150000,"789","Kumar");

        //wrong password
        int balance=account1.checkBalance("124");
        System.out.println("The balance for account1 is "+balance);

        //Right password : check balance
        int balanceCheck = account1.checkBalance("123");
        System.out.println("The balance for account1 is "+balanceCheck);

        //Add Money
       String bankMessage= account2.addMoney(50000);
        System.out.println(bankMessage);

        //Wrong password retry
       String message = account3.withdrawMoney(50000,"785");
        System.out.println(message);

        //Right password
        String message1 = account3.withdrawMoney(50000,"789");
        System.out.println(message1);

        //SBI Account
        double interest = account1.calculateTotalInterest(20);
        System.out.println("The total interest you will get "+interest);

        // HDFC Account
        double interest1 = account3.calculateTotalInterest(20);
        System.out.println("The total interest you will get "+interest1);


        System.out.println("Make it dynamic");

        System.out.println("Welcome to SBI,please the details to create account");
        System.out.println("Enter name");

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.println("Enter balance :");
        int intialBalance = sc.nextInt();
        System.out.println("Enter password :");
        String password = sc.next();

        SBI sbiAccount = new SBI(intialBalance,password,name);

        System.out.println("Enter Money and Password to add");







    }
}