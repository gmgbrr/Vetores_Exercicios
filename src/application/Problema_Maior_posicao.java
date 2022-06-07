package application;

import java.util.Scanner;

public class Problema_Maior_posicao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int loop, posicao = 0;
		
		System.out.print("Quantos números você vai digitar? ");
			loop = scan.nextInt();
				double num[] = new double[loop];
		
		for(int x = 0; x < num.length; x++) {
			System.out.print("Digite um número: ");
				num[x] = scan.nextDouble();
		}
		 scan.close();		
		 double max = num[0];
		
		
		for(int x = 0; x < num.length; x++) {			
			if(max < num[x]) {
				max = num[x];
				posicao = x;
			}
		
		}
						
		System.out.printf("\nMAIOR VALOR = %.1f", max);
			System.out.printf("\nPOSIÇÃO DO MAIOR VALOR = %d", posicao);
		
	}

}
