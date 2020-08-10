package Exercicios;

import java.util.Scanner;
import java.math.*;


public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite o número: ");
		num = ler.nextInt();
		
		if(num%2==0) {
			num = (int) Math.sqrt(num);
			System.out.printf("O número é par e ele elevado ao quadrado é %d ", num);
		}
		else {
			num = (int) Math.pow(num, 2);
			System.out.printf("\nO número é ímpar e sua raiz quadrada é %d ", num);
		}
	}
}
