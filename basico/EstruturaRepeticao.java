package cursoJava.basico;

import java.util.Scanner;

public class EstruturaRepeticao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		
		while(flag){
			
			System.out.println("true");
			
			flag = sc.nextBoolean();		
		
		}
		
		int contator = 0;
		
		while(contator < 10){
			
			System.out.println(contator++);
			
		}
		
		do {
			
			System.out.println("Testando");
			
		}while(false);
	}

}
