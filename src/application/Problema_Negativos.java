package application;

import java.util.Scanner;

public class Problema_Negativos {

	public static void main(String[] args) {
		
		byte size;
		
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Quantos n�meros voc� vai digitar? ");
			size = scan.nextByte();	
				if(size > 10 || size <= 0) {
					System.out.println("Erro!"); 
						System.exit(0);
				}	
				int num[] = new int[size];
			
		for(int x = 0; x < num.length; x++) {
				System.out.print("Digite um n�mero: ");
					num[x] = scan.nextInt();
			}
		 scan.close();
		
		System.out.println("N�MERO NEGATIVOS: ");
		
		for(int x = 0; x < num.length; x++) {
			if (num[x] < 0) {
				System.out.println(num[x]);
			}
		}	
		
	}

}
