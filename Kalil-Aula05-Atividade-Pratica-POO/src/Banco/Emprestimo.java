package Banco;

public class Emprestimo {

	double emprestimo;
	double parcelas;


	public Emprestimo(double emprestimo2, double parcelas2) {
		setEmprestimo(emprestimo2);
		setParcelas(parcelas2);

	}

	public double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}

	public double getParcelas() {
		return parcelas;
	}

	public void setParcelas(double parcelas) {
		this.parcelas = parcelas;
	}

	public double jurosComposto() {

		double calc = getEmprestimo() * Math.pow((1 + 0.02), getParcelas());
		calc = calc /getParcelas();
		return calc;

	}

}
