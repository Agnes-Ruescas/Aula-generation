package Exercicios;

import java.util.Scanner;
import java.math.*;


public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite o n�mero: ");
		num = ler.nextInt();
		
		if(num%2==0) {
			num = (int) Math.sqrt(num);
			System.out.printf("O n�mero � par e ele elevado ao quadrado � %d ", num);
		}
		else {
			num = (int) Math.pow(num, 2);
			System.out.printf("\nO n�mero � �mpar e sua raiz quadrada � %d ", num);
		}
	}
}
