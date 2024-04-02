package Ex05_Conversao_Metros_para_Cm;

import java.util.Scanner;

public class Ex05_Conversao_Metros_para_Cm {

	public static void main(String[] args) {
		
		
			
			Scanner in = new Scanner(System.in);

			System.out.println("--Conversor M -> CM--");
			System.out.println("Digite o numero que deseja converter : ");
			Double resposta = conversor(in.nextDouble());
			System.out.println("Convertido : " + resposta+" Cm");
			in.close();
			

	}

	private static Double conversor(double nextDouble) {
		
		return nextDouble*100;
	}

	

}
