package Exercicios;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	private double salarioFinal;
	public Empregado(String nome, String endereco, String telefone, int idade, String sexo, int codigoSetor,
			double salarioBase, double imposto) {
		super(nome, endereco, telefone, idade, sexo);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public double calcularSalario(double salarioBase, double imposto) {
		imposto = imposto/100;
		salarioFinal = salarioBase - (salarioBase*imposto);
		return salarioFinal;
	}
	
}
