package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int num1, num2, num3;
			
			System.out.println("Digite o primeiro valor: ");
			num1 = ler.nextInt();
			System.out.println("Digite o segundo valor: ");
			num2 = ler.nextInt();
			System.out.println("Digite o terceiro valor: ");
			num3 = ler.nextInt();
			
			if(num1>=num2 && num2>=num3) {
				System.out.println(num3 + "," + num2+"," + num1);
			}
			else if(num1>=num3 && num3>=num2) {
				System.out.println(num2 + "," + num3 + "," + num1);
			}
			else if(num2>=num3 && num3>=num1){
				System.out.println(num1 + "," + num3 + "," + num2);
			}
			else if(num2>=num1 && num1>=num3) {
				System.out.println(num3 + "," + num1 + "," + num2);
			}
			else if(num3>=num1 && num1>=num2) {
				System.out.println(num1 + "," + num2 + "," + num3);
			}
			else {
				System.out.println(num2 + "," + num1 + "," + num3);
			}
			
		}
}
