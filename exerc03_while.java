package laco_for_while_do;

import java.util.Scanner;

public class exerc03_while {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int idade = 0, menor=0, maior=0;
	while(idade>=0)  {
		
	System.out.println("Digite uma idade");
	idade = sc.nextInt();
	if(idade <21 && idade>=0) {
	menor++;
	}else if (idade >50) {
	maior++;
	
	}
	
	}
	System.out.println("Total de pessoas menores de 21 anos: " +menor);
	System.out.println("Total de pessoas menores de 50 anos: " +maior);
	
	sc.close();
	}

}
