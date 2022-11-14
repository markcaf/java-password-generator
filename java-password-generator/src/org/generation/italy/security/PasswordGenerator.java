package org.generation.italy.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome");
		String name = sc.nextLine();
		
		System.out.println("Inserisci il tuo cognome");
		String lastName = sc.nextLine();
		
		System.out.println("Inserisci il tuo colore preferito");
		String color = sc.nextLine();
		
		System.out.println("Inserisci la tua data di nascita:");
		System.out.println("Giorno:");
		int day = sc.nextInt();
		System.out.println("Mese:");
		int month = sc.nextInt();
		System.out.println("Anno:");
		int year = sc.nextInt();
		
		int sum = day + month + year;
		
		System.out.println("La tua password sarà: " + name + "-" + lastName + "-" + color + "-" + sum);

	}

}
