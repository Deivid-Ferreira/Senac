package Ex06_Salario_no_Mes;

import java.util.Scanner;

public class Ex06_Salario_no_Mes {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Informe quanto recebe por hora :  ");
		Double numero = in.nextDouble();

		System.out.println("Informe as horas trabalhadas :  ");
		Double numero2 = in.nextDouble();
		
		double calculo = calculo(numero,numero2);
		System.out.println("Salario final : "+ calculo);
		
		in.close();
		

	}

	private static double calculo(Double n1,Double n2) {
				
		return n1*n2;
	}

}
