package cursoJava.basico;

public class VariaveisEConstantes {

	public static void main(String[] args) {
		
		//Cria��o de constantes.
			
			final double ACELERA��O_GRAVITACIONAL = 9.80665;
			
		//Cria��o de vari�veis.
		
			String nome = "Gustavo";
			int idade = 16; 
			double peso = 68.7,altura = 1.88;
			char sexo = 'M',cnh = 'B';
			boolean doadorOrgaos = true; 
			
			System.out.println("Nome: "+ nome);
			System.out.println("Idade: "+ idade);
			System.out.println("Peso: "+ peso);
			System.out.println("Altura: "+ altura);
			System.out.println("Sexo: "+ sexo);
			System.out.println("Cnh: "+ cnh);
			System.out.println("Doador de Org�os: "+ doadorOrgaos);
			System.out.println("Gravidade: "+ ACELERA��O_GRAVITACIONAL + "m/s�");
	}

}
