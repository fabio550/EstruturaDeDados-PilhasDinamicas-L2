package controller;

public class Exercicio {

	public Exercicio() {
		
	}

	// Exercicio 1
	public double mult(double a, double b) {
		if (b == 0) {
			return 0;
		} else {
			return a + mult(a, b-1);
		}
	}
	
	public double div(double dividendo, double divisor) {
		if (dividendo > 1) {
			return div(dividendo - divisor, divisor);
		} else {
			return dividendo;
		}
	}
	
	
	
}
