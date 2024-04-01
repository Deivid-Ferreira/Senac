package bombas;

public class BombaGasolina {

	private double precoGasolina;
	private boolean abastecerPorLitro;
	private boolean abastecerPorValor;
	
	public BombaGasolina(double precoGasolina) {
		this.precoGasolina = precoGasolina;
	}

	public BombaGasolina(boolean abastecerPorLitro, boolean abastecerPorValor) {
		setAbastecerPorValor(abastecerPorValor);
		setAbastecerPorLitro(abastecerPorLitro);
	}

	public double getPrecoGasolina() {
		return precoGasolina;
	}

	public void setPrecoGasolina(double precoGasolina) {
		this.precoGasolina = precoGasolina;
	}

	public boolean getAbastecerPorLitro() {
		return abastecerPorLitro;
	}

	public void setAbastecerPorLitro(boolean abastecerPorLitro) {
		this.abastecerPorLitro = abastecerPorLitro;
	}

	public boolean getAbastecerPorValor() {
		return abastecerPorValor;
	}

	public void setAbastecerPorValor(boolean abastecerPorValor) {
		this.abastecerPorValor = abastecerPorValor;
	}
	public String toString() {
		return "Bomba Gasolina. Abastecer por litro ? " + getAbastecerPorLitro()
				+ "\nAbastecer por valor ? " + getAbastecerPorValor();
	}
	
}
