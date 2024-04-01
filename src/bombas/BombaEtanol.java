package bombas;

public class BombaEtanol {

	private double precoEtanol;
	private boolean abastecerPorLitro;
	private boolean abastecerPorValor;

	public BombaEtanol(double precoEtanol) {
		this.precoEtanol = precoEtanol;
	}

	public BombaEtanol(boolean abastecerPorLitro, boolean abastecerPorValor) {
		setAbastecerPorLitro(abastecerPorLitro);
		setAbastecerPorValor(abastecerPorValor);
	}

	public double getPrecoEtanol() {
		return precoEtanol;
	}

	public void setPrecoEtanol(double precoEtanol) {
		this.precoEtanol = precoEtanol;
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
		return "Bomba Etanol. Abastecer por litro ? " + getAbastecerPorLitro()
				+ "\nAbastecer por valor ? " + getAbastecerPorValor();
	}

}
