package application;

import java.util.Scanner;

public class Problema_Media_pares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num, par = 0, qtd = 0;
		
		System.out.print("Quantos elementos o vetor ter�?");
			int vetor[] = new int[scan.nextInt()];
		
			
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um n�mero: ");
				num = scan.nextInt();
					if(num % 2 == 0) {
						par += num;
						qtd++;
					}
		}
		 scan.close();

		if (qtd != 0) {
			System.out.printf("M�DIA DOS PARES = %.1f", (double) par / qtd);
		} else {
			System.out.println("NENHUM N�MERO PAR");
		}

	}

}
