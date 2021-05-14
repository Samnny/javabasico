package cursoJava.basico;
/*
 * Classe que exemplifica funções.
 * 
 * versão 1.0 
 * 
 * autor:Samay de Oliveira 
 * */
public class Funcoes {

	public static void main(String[] args) {
		
		int result = soma(10, 60);
		
		System.out.println(result);
		
		quadrado(7);
		
		String texto = mensagem();
		
		olaMundo();
		
		int nota = 8;
		String resultado = nota >= 7 ?"Você foi aprovado":"Você ficou de recuperação";
		System.out.println(resultado);
	}
	// com retorno do tipo int e recebe dois parâmetros.
	static int soma(int a, int b){
		
		return a + b;
	}
	//sem retorno
	static void quadrado(int numero) {
		
		System.out.println(numero*numero);
	}
	
	 static String mensagem() {
		 
		 return "Mensagem do Sistema";
	 }
	 
	 static void olaMundo() {
		 
		 System.out.println("ola mundo");
		 
	 }
}
