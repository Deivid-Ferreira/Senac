package Interrogatorio;

public class Interrogatorio {

	public static void main(String[] args) {

		boolean resp1 = true;
		boolean resp2 = true;
		boolean resp3 = false;
		boolean resp4 = true;
		boolean resp5 = true;

		System.out.println("Responda as perguntas\n------------------------------------");

		System.out.println("Telefonou para a vítima?");

		System.out.println("Esteve no local do crime?");

		System.out.println("Mora perto da vítima?");

		System.out.println("Devia para a vítima?");

		System.out.println("Já trabalhou com a vítima?");

		Respostas respostas = new Respostas(resp1, resp2, resp3, resp4, resp5);
		System.out.println(respostas.veredito(respostas.contadorDeRespostas()));
       
	}

}
