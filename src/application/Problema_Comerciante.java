package application;

import java.util.Scanner;

public class Problema_Comerciante {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double totalCompra = 0, totalVenda = 0, lucro = 0;
		int n, lucroAbaixo = 0, lucroEntre = 0, lucroAcima = 0;
		
		System.out.println("Serão digitados dados de quantos produtos? ");
			n = scan.nextInt();
				String nomes[] = new String[n];
					double precoCompra[] = new double[n],
						   precoVenda[] = new double[n],
						   porcLucro[] = new double[n];
					
		for(int i = 0; i < n; i++) {
			System.out.printf("Produto %d:\n", i + 1);
				System.out.print("Nome: ");
				nomes[i] = scan.next();
					System.out.print("Preço de compra: ");
					precoCompra[i] = scan.nextDouble();
						System.out.print("Preço de venda: ");
						precoVenda[i] = scan.nextDouble();
						
			totalCompra += precoCompra[i];
			totalVenda += precoVenda[i];
		}
		scan.close();		
		 	
		
		 for(int i = 0; i < n; i++) {
			 porcLucro[i] = (precoVenda[i] - precoCompra[i]) / precoCompra[i] * 100;
		 }
		 
		 for(int i = 0; i < n; i++) {
			 if(porcLucro[i] < 10) {
				 lucroAbaixo++;
			 } else if (porcLucro[i] <= 20) {
				lucroEntre++; 
			 } else {
				 lucroAcima++;
			 }
		 }
		
		lucro = totalVenda - totalCompra;
				
		System.out.println("RELATÓRIO: ");
		 System.out.printf("Lucro abaixo de 10%%: %d\n", lucroAbaixo);
		  System.out.printf("Lucro entre 10%% e 20%%: %d\n", lucroEntre);
		   System.out.printf("Lucro acima de 20%%: %d\n", lucroAcima); 
		    System.out.printf("Valor total de compra: R$1%.2f\n", totalCompra);
		     System.out.printf("Valor total de venda: R$%.2f\n", totalVenda);
		      System.out.printf("Lucro total: R$%.2f", lucro);
		
	}

}