package Exercicios;

public class Administrador extends Pessoa {
	private double salario;
	private double ajudaDeCusto;
	private double salarioAjustado;
	
	public Administrador(String nome, String endereco, String telefone, int idade, String sexo, double salario,
			double ajudaDeCusto) {
		super(nome, endereco, telefone, idade, sexo);
		this.salario = salario;
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	public double salarioAjustado(double salario, double ajudaDeCusto) {
		 salarioAjustado = salario+ajudaDeCusto;
		 return salarioAjustado;
	}
}

