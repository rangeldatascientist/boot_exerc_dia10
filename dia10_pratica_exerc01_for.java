package laco_for_while_do;

import java.util.Scanner;

public class dia10_pratica_exerc01_for {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1, num2;
	System.out.println("Digite o primeiro número do intervalo: ");
	num1 = sc.nextInt();
	System.out.println("Digite o último número do intervalo: ");
	num2 = sc.nextInt();
	
	

	if(num1>num2) {
		System.out.println("Intervalo inválido");
		

	}else {
		for(int i=num1; i<=num2;i++) {
		if (i%3==0 && i%5==0)
		System.out.println(i+ "É multiplo de 3 e 5");
			
			
		}
	}
	
	
	
	sc.close();
	
	}

}
