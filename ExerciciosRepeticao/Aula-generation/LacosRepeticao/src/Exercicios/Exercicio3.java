package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite a idade do participante: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Esse participante pertence a categoria infantil");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("Esse participante pertence a categoria juvenil");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("Esse participante pertence a categoria adulto");
		}
		else {
			System.out.println("Esse participante n�o pertence a nenhuma categoria");
		}
	}
}
