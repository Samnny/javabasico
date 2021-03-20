package cursoJava.basico;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		// Entrada de dados.
		
			Scanner sc = new Scanner(System.in);
			
			String nome; 
			int idade; 
			double altura; 
			
			System.out.println("Digite seu nome: ");
				nome = sc.nextLine();
			System.out.println("Digite sua idade: ");
				idade = sc.nextInt();
			System.out.println("Digite sua altura: ");
				altura = sc.nextDouble();
			
		// Saída de dados.
				
			System.out.println(nome);
			System.out.println(idade);
			System.out.println(altura);
			System.out.printf("Nome: %s \nidade: %d \naltura %.2f", nome, idade, altura);
			
	}

}
