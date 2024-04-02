package bombas;

public class bomba {

	public static void main(String[] args) {
		double precoDisel = 5.00;
		double precoEtanol = 4.00;
		double precoGasolina = 5.70;

		double litrosVendidos = 5; // Exemplo de valor para o codigo
		double quantidade = 0;	   // Exemplo de valor para o codigo
//--------------------------------------------------------------------------
		BombaDisel bombaDisel = new BombaDisel(precoDisel);               
		BombaEtanol bombaEtanol = new BombaEtanol(precoEtanol);            
		BombaGasolina bombaGasolina = new BombaGasolina(precoGasolina); 

		double valor = valorPorLitros(bombaDisel.getPrecoDisel());																 
		BombaDisel bombaDisel1 = new BombaDisel(abastecerPorLitro(litrosVendidos, valor),abastecerPorValor(quantidade, valor)); 
		System.out.println(bombaDisel1.toString());																			   

		valor = valorPorLitros(bombaEtanol.getPrecoEtanol());
		BombaEtanol bombaEtanol1 = new BombaEtanol(abastecerPorLitro(litrosVendidos, valor),abastecerPorValor(quantidade, valor));
		System.out.println(bombaEtanol1.toString());

		valor = valorPorLitros(bombaGasolina.getPrecoGasolina());
		BombaGasolina bombaGasolina1 = new BombaGasolina(abastecerPorLitro(litrosVendidos, valor),abastecerPorValor(quantidade, valor));
		System.out.println(bombaGasolina1.toString());

	}

	private static boolean abastecerPorValor(double quantidade, double preco) {
		boolean ress = (quantidade != 0.0) && (preco != 0.0);
		return ress;
	}

	private static boolean abastecerPorLitro(double preco, double litrosVendidos) {
		boolean ress = (preco != 0.0) && (litrosVendidos != 0.0);

		return ress;
	}

	private static double valorPorLitros(double preco) {

		return preco;

	}

}
