package Exercicios;

import java.util.Scanner;
import java.math.*;


public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double num;
		
		System.out.println("Digite o número: ");
		num = ler.nextDouble();
		
		if(num%2==0) {
			num =  Math.sqrt(num);
			System.out.printf("\nO número é par e sua raiz quadrada é %f ", num);
		}
		else {
			num = Math.pow(num, 2);
			System.out.printf("O número é ímpar e ele elevado ao quadrado é %f  ", num);
		}
	}
}
