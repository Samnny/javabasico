package cursoJava.basico;

public class EstruturaDecisao {

	public static void main(String[] args) {
		
		String texto = 10 == 7 ?"Dez � igual a sete":"Dez � diferente de sete";
		int idade = 19;
		
		if(idade > 18){
			
			System.out.println("J� pode tirar a cnh");
		}
		
		if(idade >= 18){
			
			System.out.println("J� pode tirar a cnh");
			
		}else {
			
			System.out.println("N�o tem idade sufiente");

		}
		
		String semaforo = "vermelho";
		
			if(semaforo == "verde"){
				
				System.out.println("siga em frente");
				
			}else if(semaforo == "amarelo"){
				
				System.out.println("tenha aten��o");
				
			}else if(semaforo == "vermelho"){
				
				System.out.println("pare");
				
			}else {
				
				System.out.println("semafaro quebrado");
				
			}
			
		char opcao = 'b';
		
			switch(opcao){
			
			case 'a': 
				System.out.println("Cadastrar produto");
				break;
				
			case 'b':
				System.out.println("Visualizar detalhes");
				break;
				
			case 'c': 
				System.out.println("Editar produto");
				break;
				
			case 'd': 
				System.out.println("Deletar produto");
				break;
				
			default:			
				System.out.println("Op��o inv�lida");
			
			}
	}

}
