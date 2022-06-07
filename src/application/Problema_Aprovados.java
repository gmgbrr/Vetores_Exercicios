package application;

import java.util.Scanner;

public class Problema_Aprovados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int loop;
		
		System.out.print("Quantos alunos serão digitados? ");
			loop = scan.nextInt();
				String nome[] = new String[loop];
					double nota1[] = new double[loop], nota2[] = new double[loop];
		
		for(int i = 0; i < loop; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno: \n", i+1);
				nome[i] = scan.nextLine();	
				nome[i] += scan.nextLine();
					nota1[i] = scan.nextDouble();
					nota2[i] = scan.nextDouble();
		}
		 scan.close();
		
		System.out.println("Alunos aprovado: ");
		for(int i = 0; i < loop; i++) {
			if((nota1[i] + nota2[i]) / 2 >= 6) {
				System.out.println(nome[i]);
			}
		}
		
	}

}