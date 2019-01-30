package Zadanie1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Zgadywanie {
	
	public static void main(String[] args) {
		Random r = new Random();
		int numb = r.nextInt(101);
		int liczba = 0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Zgadnij liczbe: ");
		while (!(numb == liczba)) {
		try {
			liczba = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("To nie jest liczba.");
			scan.next();
		}
		if (liczba > numb) {
			System.out.println("Za duzo!");
		} else if (liczba < numb && liczba != 0) {
			System.out.println("Za malo!");
		} else if (liczba == numb) {
			System.out.println("Zgadles!");
		}
	
		}
	}
}
