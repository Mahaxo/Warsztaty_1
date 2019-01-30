package Zadanie2;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lotto {
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Wytypuj 6 liczb w zakresie od 1-49");
	int guess = 6;
	int counter = 1;
	int temp = 0;
	boolean duplicate;
	boolean smallBig;
	int[] guesses = new int[guess];
	while (counter <= guess) {
		duplicate = false;
		smallBig = false;
		try {
			temp = scan.nextInt();
			for (int i = 0; i <= counter - 2; i++) {
				if (temp == guesses[i]) {
					duplicate = true;
					break;
				} else if (temp <= 1 || temp >= 49) {
					smallBig = true;
					break;
				}
			}
			if (duplicate) {
				System.out.println("Juz wybrales te liczbe!");
			} else if (smallBig) {
					System.out.println("Liczby maja byc pomiedzy 1 a 49!");
				}
				else {
				guesses[counter-1] = temp;
				counter++;
			}
		} catch (InputMismatchException e) {
			System.out.println("To nie liczba!");
		}
	}
	Integer[] arr = new Integer[49];
	for	(int i = 0; i < arr.length;	i++)	{
			arr[i]	= i	+ 1;
	}
	System.out.println(Arrays.toString(arr));
	Collections.shuffle(Arrays.asList(arr));
	System.out.println(Arrays.toString(arr));
	
}
}
