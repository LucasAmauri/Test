package Programa;

import java.util.Scanner;

public class OperadoresCalculadora {
	
	public void soma() {
		
		Scanner entrada;
		entrada = new Scanner(System.in);
	     int num1, num2;
    
	System.out.printf("informe o primeiro numero\n");
	num1 = entrada.nextInt();

	System.out.println("Informe o segundo numero\n");
	num2 = entrada.nextInt();
	
	int soma = num1 + num2;
	
	System.out.println("O resultado eh:" + soma);
}
	
public void subtrai() {
		
		Scanner entrada;
		entrada = new Scanner(System.in);
	     int num1, num2;
    
	System.out.printf("informe o primeiro numero\n");
	num1 = entrada.nextInt();

	System.out.println("Informe o segundo numero\n");
	num2 = entrada.nextInt();
	
	int soma = num1 - num2;
	
	System.out.println("O resultado eh:" + soma);
}
	
	

}
