package application;

import java.util.Scanner;

public class Problema_Dados_pessoas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
			int homens = 0, loop = scan.nextInt();
		 		double altura[] = new double[loop];
		 		char genero[] = new char[loop];
		 		
		for(int i = 0; i < loop; i++) {
			System.out.printf("Altura da %dª pessoa: ", i + 1);
			altura[i] = scan.nextDouble();
				System.out.printf("Gênero da %dª pessoa(M/F): ", i + 1);
				genero[i] = scan.next().charAt(0);
		}
		scan.close();
		double max = altura[0], min = altura[0], mediaF = 0, mulheres = 0;
		
		for(int i = 0; i < loop; i++) {
			if (genero[i] == 'F') {
				mediaF += altura[i];
				mulheres++;
			}
				if (genero[i] == 'M') {
					homens++;
				}
					max = Math.max(max, altura[i]);
					min = Math.min(min, altura[i]);
	
		}
		
		System.out.printf("Menor altura = %.2f", min);
		System.out.printf("\nMaior altura = %.2f", max);
		System.out.printf("\nMédia das alturas da mulheres = %.2f", mediaF / mulheres);
		System.out.printf("\nNúmero de homens = %d", homens);
		
	}

}