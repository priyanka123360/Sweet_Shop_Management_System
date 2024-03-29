package com.workshop.demo;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	private static UserInterface instance;
	private final int Exit_Value = 5;
	
	private UserInterface() {
		
	}
	
	public static UserInterface getInstance() {
		if (instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}
	
	public  void PrintAllSweet(Set<Sweet> sweetList) {
		//for (int i = 0; i < sweetList.size(); i++ )
		//System.out.println(sweetList.get(i));
		for (Sweet sweet:sweetList) {
			System.out.println(sweet);
			
		}
	}
	
	public int showUserMenu() {
		System.out.println("Enter \n1.Add sweet\n2.remove Sweet"+""
				+ "\n3.update sweet\n4.Print sweet \n" + Application.Exit_Value + ".Exit");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
}
