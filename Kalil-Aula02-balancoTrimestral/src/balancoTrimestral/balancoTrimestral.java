package balancoTrimestral;

public class balancoTrimestral {

	public static void main(String[] args) {
		
		int gastoJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		
		
		double gastoTrimestre = gastoJaneiro+gastosFevereiro+gastosMarco;
		double mediaMensal =  gastoTrimestre/3;
		
		System.out.println("Gasto total : "+gastoTrimestre+"\nMedia : "+mediaMensal);
		
		
	}

}
