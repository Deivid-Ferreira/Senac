package Interrogatorio;

import javax.swing.JOptionPane;

public class Interrogatorio {

	public static void main(String[] args) {
		
		int resp1;
		int resp2;
		int resp3;
		int resp4;
		int resp5;
		
		String pergunta1 = "Telefonou para a vítima?";
		resp1 = JOptionPane.showConfirmDialog(null, pergunta1);

		String pergunta2 = "Esteve no local do crime?";
		resp2 = JOptionPane.showConfirmDialog(null, pergunta2);

		String pergunta3 = "Mora perto da vítima?";
		resp3 = JOptionPane.showConfirmDialog(null, pergunta3);

		String pergunta4 = "Já trabalhou com a vítima?";
		resp4 = JOptionPane.showConfirmDialog(null, pergunta4);
		String pergunta5 = "Já trabalhou com a vítima?";
		resp5 = JOptionPane.showConfirmDialog(null, pergunta5);



	Respostas respostas = new Respostas(resp1, resp2, resp3, resp4, resp5);
	JOptionPane.showMessageDialog(null, respostas.veredito(respostas.contadorDeRespostas()));
       
	}

}
