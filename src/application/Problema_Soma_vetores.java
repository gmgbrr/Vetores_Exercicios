package application;

import java.util.Scanner;

public class Problema_Soma_vetores {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int size;
		
		
		System.out.print("Quantos valores cada vetor terá? ");
			size = scan.nextInt();
			
		int V1[] = new int[size], V2[] = new int[size];
		
		
		System.out.println("Digite os valores do vetor A: ");
			for(int i = 0; i < V1.length; i++) {
				V1[i] = scan.nextInt();
			}
			System.out.println("Digite os valores do vetor B: ");
				for(int i = 0; i < V2.length; i++) {				
					V2[i] = scan.nextInt();
				}
		scan.close();		
		
		 
		System.out.println("VETOR RESULTANTE:");
			for(int i = 0; i < size; i++){
				System.out.println((V1[i] + V2[i]));
			}
	
	}

}
