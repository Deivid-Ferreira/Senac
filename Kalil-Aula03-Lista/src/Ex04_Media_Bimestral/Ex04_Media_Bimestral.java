package Ex04_Media_Bimestral;

import java.util.Scanner;

public class Ex04_Media_Bimestral {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nota 1 : ");
		Double n1 = in.nextDouble();
		System.out.println("Nota 2 : ");
		Double n2 = in.nextDouble();
		System.out.println("Nota 3 : ");
		Double n3 = in.nextDouble();
		System.out.println("Nota 4 : ");
		Double n4 = in.nextDouble();
		
		Double res = (n1+n2+n3+n4)/4;
		System.out.println("Media bimestral : " + res);

		in.close();

	}

}
