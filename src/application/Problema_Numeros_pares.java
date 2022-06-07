package application;

import java.util.Scanner;

public class Problema_Numeros_pares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int loop, quantidade = 0;
		
		System.out.print("Quantos números você vai digitar? ");
			loop = scan.nextInt();
				int num[] = new int[loop];
			
		for(int x = 0; x < num.length; x++) {
			System.out.print("Digite um número: ");
				num[x] = scan.nextInt();
		}
		 scan.close();
		
		System.out.println("NÚMEROS PARES: ");
		 
		for (int x = 0; x < num.length; x++) {			
			if(num[x] % 2 == 0) {
				System.out.printf("%d  ", num[x]);
				quantidade++;
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d", quantidade);
			
	}

}
