package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("Stabilire lunghezza dell'array: ");
		int length = input.nextInt();
		int[] insieme = new int[length];
		int oLength = 0;
		int eLength = 0;
		int sum = 0;
		for (int i = 0; i < length; i++) {			
			insieme[i] = r.nextInt(100);
		}
		
		for (int i = 0; i < insieme.length; i++) {
			if ((insieme[i] % 2) != 0) {
				System.out.println(insieme[i]);
				oLength++;
			}
			if ((insieme[i] % 2) == 0)  {
				eLength++;
			}
			if (insieme[i] > 10 && insieme[i] < 50) {
				sum = sum + insieme[i];
			}
		}
		
		System.out.println("Numero di dispari: " + oLength);
		System.out.println("Numero di pari: " + eLength);
		System.out.println("Somma dei numeri compresi tra 10 e 50: " + sum);
		
		
		
		
		input.close();
	}

}

