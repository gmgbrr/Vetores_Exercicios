package application;

import java.util.Arrays;
import java.util.Scanner;

public class Problema_Mais_velho {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		int loop, max = 0;
		
		System.out.print("Quantas pessoas você vai digitar?");
			loop = scan.nextInt();
				String nomes[] = new String[loop];
				byte idades[] = new byte[loop];
		
	
		for(int i = 0; i < loop; i++) {
			System.out.printf("Dados da %dª pessoa", i + 1);
				System.out.printf("\nNome: ");
				 nomes[i] = scan.next();
					System.out.printf("Idade: ");
					 idades[i] = scan.nextByte();
					 	max = Math.max(max, idades[i]);
		}	
		scan.close();			
			System.out.printf("PESSOA MAIS VELHA: %s", nomes[Arrays.binarySearch(idades, (byte) max)]);
		
	}

}
