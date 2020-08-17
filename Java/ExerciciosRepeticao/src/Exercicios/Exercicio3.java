package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int idade,jovens=0, senhores=0;
			System.out.println("Digite a idade: ");
			idade = ler.nextInt();
			while(idade != -99) {
				if(idade>0 && idade<21) {
					jovens++;
				}
				else if(idade>50) {
					senhores++;
				}
				System.out.println("Digite a idade: ");
				idade = ler.nextInt();
			}
			System.out.printf("\nO número de pessoas com menos de 21 anos é: %d", jovens);
			System.out.printf("\nO número de pessoas com mais de 50 anos é: %d", senhores);
		}
}
