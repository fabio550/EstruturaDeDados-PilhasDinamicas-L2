package view;
import controller.Exercicio;

public class main {

	public static void main(String[] args) {
		Exercicio ex = new Exercicio();
		
		// Exercício 1
		double res1 = ex.Mult(2, 3);
		System.out.println("Exercício 1: " + res1);

		// Exercício 2
		double res2 = ex.Resto(11, 2);
		System.out.println("Exercício 2: " + res2);

		// Exercício 3
		int res3 = ex.ContaPares(new int[] {2, 3, 5, 6, 8, 9} , 6);
		System.out.println("Exercício 3: " + res3);
		
		// Exercício 4
		int fat = 5;
		if (fat % 2 != 0) {
			int res4 = ex.FatDuplo(fat);			
			System.out.println("Exercício 4: " + res4);
		}
		
		// Exercício 5
		int res5 = ex.MDC(20, 24);
		System.out.println("Exercício 5: " + res5);
		
		
		
	}

}
