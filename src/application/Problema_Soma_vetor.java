package application;

import java.util.Scanner;

public class Problema_Soma_vetor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int loops;
		double soma = 0;
		
		
		System.out.print("Quantos números você vai digitar? ");
			loops = scan.nextInt();
				double num[] = new double[loops];
				
		for (int x = 0; x < num.length; x++) {
			System.out.print("Digite um número: ");
				num[x] = scan.nextDouble();
					soma += num[x];				
		}
		 scan.close();
		
		System.out.print("VALORES = ");
		for (int x = 0; x < num.length; x++) {
			System.out.printf("%.1f  ", num[x]);
		}
			System.out.printf("\nSOMA = %.2f", soma);
				System.out.printf("\nMEDIA = %.2f", soma / loops);
			
	}

}