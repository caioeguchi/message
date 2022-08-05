package com.caionilson.core.tema12;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite seu nome");
		String name = sc.nextLine();
		System.out.println("Digite a data do seu aniversario");
		String birthday = sc.nextLine();
		System.out.println("Digite a rua da onde voce mora");
		String road = sc.nextLine();
		System.out.println("Digite o numero da sua casa");
		String number = sc.nextLine();
		System.out.println("Digite o nome do estado da onde voce mora");
		String city = sc.nextLine();
		System.out.println("Digite o nome da cidade da onde voce mora");
		String state = sc.nextLine();
		
		
		User user = UserBuilder.builder()
				.userName(name)
				.userBirthday(birthday)
				.userAddress(road, number, city, state)
				.build();
		
		System.out.println("Ola " +user.getName()
				+"\nVoce nasceu em "+user.getBirthday()
				+"\nE mora na rua "+user.getAddress().getRoad()
				+" do numero "+user.getAddress().getNumber()
				+"\nNo estado de "+user.getAddress().getState()
				+" da cidade de "+user.getAddress().getCity());
	}

}
