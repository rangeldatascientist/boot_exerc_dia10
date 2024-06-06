package laco_for_while_do;

import java.util.Scanner;

public class exerc05_do {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		int total = 0;
		
		do {
		System.out.println("Digite um numero:");
		numero = sc.nextInt();
		if(numero > 0)
		total+=numero;
		} while (numero!=0);
		System.out.println("A soma dos números positivos é: "+total);
		
		
		sc.close();
		}

	}


