package view;
import controller.Exercicio;

public class main {

	public static void main(String[] args) {
		Exercicio ex = new Exercicio();
		
		// Exerc�cio 1
		double res1 = ex.Mult(2, 3);
		System.out.println("Exerc�cio 1: " + res1);

		// Exerc�cio 2
		double res2 = ex.Resto(11, 2);
		System.out.println("Exerc�cio 2: " + res2);

		// Exerc�cio 3
		int res3 = ex.ContaPares(new int[] {2, 3, 5, 6, 8, 9} , 6);
		System.out.println("Exerc�cio 3: " + res3);
		
		// Exerc�cio 4
		int fat = 5;
		if (fat % 2 != 0) {
			int res4 = ex.FatDuplo(fat);			
			System.out.println("Exerc�cio 4: " + res4);
		}
		
		// Exerc�cio 5
		int res5 = ex.MDC(20, 24);
		System.out.println("Exerc�cio 5: " + res5);
		
		
		
	}

}
