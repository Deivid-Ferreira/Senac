package Ex07_Conversor_Farenheit_Celsius;

import java.util.Scanner;

public class Ex07_Conversor_Farenheit_Celsius {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Informe a temperatura em Farenheit : ");
		double celsius = conversor(in.nextDouble());
		
		

		System.out.println("Celsius : " + celsius);

		in.close();

	}

	private static double conversor(double nextDouble) {
	
		return (5*(nextDouble-32)/9);
	}

}
