package Exercicios;

public class TesteProdutoEletronico {
	public static void main(String[] args) {
		ProdutoEletronico produto1 = new ProdutoEletronico();
		produto1.setNomeProduto("Fone headset");
		produto1.setPreco(90.50);
		
		System.out.println("O produto "+produto1.getNomeProduto()+" custa "+produto1.getPreco()+" reais");
	}
}
