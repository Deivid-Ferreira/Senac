package Ex09_Peso_Ideal;

import java.util.Scanner;

public class Ex09_Peso_Ideal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Informe um sua altura 'Homens': ");
		double pesoHomem = pesoIdealHomem(in.nextDouble());
		System.out.println("Peso ideal para sua altura : " + pesoHomem);
		System.out.println("Informe um sua altura 'Mulheres': ");
		double PesoMulher = pesoIdealMulher(in.nextDouble());
		System.out.println("Peso ideal para sua altura : " + PesoMulher);

		in.close();

	}

	private static double pesoIdealMulher(double numero) {
		return (62.1 * numero) - 44.7;

	}

	private static double pesoIdealHomem(double nextDouble) {

		return (72.7 * nextDouble) - 58;
	}

}
