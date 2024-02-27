package controller;

public class Exercicio {

	public Exercicio() {
		
	}

	// Exercício 1
	public double Mult(double a, double b) {
		if (b == 0) {
			return 0;
		} else {
			return a + Mult(a, b-1);
		}
	}
	
	// Exercício 2
	public double Resto(double dividendo, double divisor) {
		if (dividendo > 1) {
			return Resto(dividendo - divisor, divisor);
		} else {
			return dividendo;
		}
	}
	
	// Exercício 3
	public int ContaPares(int[] vetor, int tamanho) {
		if (tamanho > 0) {
			if (vetor[tamanho-1] % 2 == 0) {
				return 1 + ContaPares(vetor, tamanho -1);
			} else {
				return ContaPares(vetor, tamanho - 1);
			}
		} else {
			return 0;
		}
	}
	
	// Exercício 4
	public int FatDuplo(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * FatDuplo(num-2);		
		}
	}
	
	// Exercício 5
	public int MDC(int a, int b) {
		if (a > b) {
			return MDC(a-b, b);
		} else if(a == b) {
			return a;
		} else {
			return MDC(b, a);
		}
	}
	
	
}
