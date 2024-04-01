package bombas;

public class BombaDisel extends bomba {

	private double precoDisel;
	private boolean abastecerPorLitro;
	private boolean abastecerPorValor;

	public BombaDisel(double precoDisel) {
		setPrecoDisel(precoDisel);
	}

	public BombaDisel(boolean abastecerPorLitro, boolean abastecerPorValor) {
	setAbastecerPorValor(abastecerPorValor);
		setAbastecerPorLitro(abastecerPorLitro);

	}

	public double getPrecoDisel() {
		return precoDisel;
	}

	public void setPrecoDisel(double precoDisel) {
		this.precoDisel = precoDisel;
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
		return "Bomba Disel. Abastecer por litro ? " + getAbastecerPorLitro()
				+ "\nAbastecer por valor ? " + getAbastecerPorValor();
	}
	

}
