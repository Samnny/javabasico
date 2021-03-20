package cursoJava.basico;

public class Operadores {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 8;
		
		//Operadores aritméticos + - * / %.
			
			int result1 = num1 + num2; 
			int result2 = num1 - num2; 
			int result3 = num1 * num2; 
			double result4 = (double)num1 / num2; 
			int result5 = num1 % num2; 
			
			System.out.println(result1);
			System.out.println(result2);
			System.out.println(result3);
			System.out.println(result4);
			System.out.println(result5);
			
		// Operadores de incremento.
			
			++num1;
			num1++; 
			num1 += 10;
			num1 *= 2;
			num1 /= 2;
			
		// Operadores de igualdade.
			
			System.out.println(num1 == num2);
			System.out.println(num1 != num2);
			
		// Operadore relacionais.
			
			System.out.println(num1 > num2);
			System.out.println(num1 >= num2);
			System.out.println(num1 < num2);
			System.out.println(num1 <= num2);
			
		// Operadores lógicos.
			
			// false && false = false;
			// true && true = true;
			// false && true = false;
			// true && false = false;
			
			// false || false = false;
			// true || true = true;
			// false || true = true;
			// true || false = true;
			
			
			
			
	}

}
