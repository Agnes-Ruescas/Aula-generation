package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, idade;
		System.out.println("Digite sua idade em dias: ");
		idade = ler.nextInt();
		
		anos = idade/365;
		meses= (idade%365)/30;
		dias = (idade%365)%30;
		System.out.println("Sua idade é: "+anos+" anos "+meses+" meses "+dias+" dias");
	}

}
