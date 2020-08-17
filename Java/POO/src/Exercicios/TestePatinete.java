package Exercicios;

public class TestePatinete {
	public static void main(String[] args) {
		Patinete patinete = new Patinete();
		patinete.setCor("Azul");
		patinete.setEletrico(true);
		
		System.out.println("O patinete é "+patinete.getCor()+" \nEle é elétrico? "+patinete.getEletrico());
		
	}
}
