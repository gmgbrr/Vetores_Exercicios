package application;

import java.util.Scanner;

public class Problema_Alturas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double alturaTotal = 0, porcMenor;
		int menor16 = 0, n;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = scan.nextInt();
			String nome[] = new String[n];
			double altura[] = new double[n];
			int idade[] = new int[n];
			
			
		for(int i = 0; i < n; i++) {	
			System.out.printf("Dados da %dª pessoa: \n", i + 1);
			System.out.print("Nome: ");
			nome[i] = scan.next();
				System.out.print("Idade: ");
				idade[i] = scan.nextInt();
					System.out.print("Altura: ");
					altura[i] = scan.nextDouble();
					
			alturaTotal += altura[i];
		}
		 scan.close();
		
		for(int i = 0; i < n; i++) {
			if(idade[i] < 16) {
				menor16++;
			}
		}
		
		porcMenor = (menor16 * 100 )/ n;	
			
			System.out.printf("\nAltura média: %.2f\n", alturaTotal / n);
			System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcMenor);
				for(int i = 0; i < n; i++) {
					if(idade[i] < 16) {
						System.out.println(nome[i]);
					}
				}
			
	}

}