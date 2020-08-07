package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
		double media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextInt();
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextInt();
		System.out.println("Digite a terceira nota: ");
		n3 = ler.nextInt();
		
		media = ((n1*2)+(n2*3)+(n3*5))/10;
		
		System.out.println("A média do aluno é: "+media);
		
	}
}
