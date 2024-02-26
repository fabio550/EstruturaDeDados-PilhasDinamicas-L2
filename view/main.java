package view;
import controller.Exercicio;

public class main {

	public static void main(String[] args) {
		Exercicio ex = new Exercicio();
		
		double res1 = ex.mult(2, 3);
		double res2 = ex.div(11, 2);
		
		System.out.println(res2);
	}

}
