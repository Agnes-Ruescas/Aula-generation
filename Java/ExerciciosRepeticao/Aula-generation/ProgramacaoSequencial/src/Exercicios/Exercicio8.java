package Exercicios;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double cc, c;
		
		System.out.println("Digite custo de fábrica: ");
		c= ler.nextDouble();
		
		cc= c+ c*0.73;
		
		System.out.println("O custo para o consumidor é de R$"+cc);
	}
}
