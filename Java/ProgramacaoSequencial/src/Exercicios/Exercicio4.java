package Exercicios;

import java.util.Scanner;
import java.math.BigInteger;
public class Exercicio4 {
 
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a,b,c,d,r,s;
		
		System.out.println("Digite o valor de a: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de b: ");
		b = ler.nextInt();
		System.out.println("Digite o valor de c: ");
		c = ler.nextInt();
		
		r= (int) Math.pow((a+b), 2);
		s= (int) Math.pow((b+c), 2);
		d=(r+s)/2;
		
		System.out.println("O resultado da expressão é: " + d);
	}
}
