package application;

import java.util.Scanner;

public class Problema_Abaixo_da_media {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("Quantos elementos o vetor ter�? ");
			double vetor[] = new double[scan.nextInt()], soma = 0, media;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um n�mero: ");
				vetor[i] = scan.nextDouble();
					soma += vetor[i];
		}
		 scan.close();
		
		media = soma / vetor.length;		
		System.out.printf("\nMEDIA DO VETOR = %.3f", media);
			System.out.println("\nELEMENTOS ABAIXO DA M�DIA:");
				
				for(int i = 0; i < vetor.length; i++) {
					if(vetor[i] < media) {
						System.out.println(vetor[i]);
					}
				}
		
		
		
			
	}

}
