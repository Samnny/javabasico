package cursoJava.basico;

public class RepeticaoContinuacao {

	public static void main(String[] args) {
		
		String frutas[] = {"maçã", "banana", "abacate", "laranja", "uva"};
		
			for(int x = 0; x < 5; x++){
				
				System.out.println(frutas[x]);
		}
			
			for(String fruta : frutas) {
				
				System.out.println(fruta);
				
			}
	}

}
