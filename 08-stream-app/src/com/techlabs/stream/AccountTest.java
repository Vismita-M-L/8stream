package com.techlabs.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> accounts=Arrays.asList(new Account(1,"Vismita",5000),new Account(2,"Varun",10000),new Account(3,"Jyothi",15000),new Account(4,"Mahesh",20000));
		accounts.stream().forEach((account)->System.out.println(account));
		
		System.out.println("Minimum balance account Deatils:");
		System.out.println(accounts.stream().min(Comparator.comparingDouble(Account::getBalance)));
		
		System.out.println("Maximum balance account Deatils:");
		System.out.println(accounts.stream().max(Comparator.comparingDouble(Account::getBalance)));
		
		System.out.println("Total balance of all account:");
		System.out.println(accounts.stream().map(Account::getBalance).reduce(0.0, Double::sum));
		
		

	}

}
