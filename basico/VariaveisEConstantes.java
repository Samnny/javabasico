package cursoJava.basico;

public class VariaveisEConstantes {

	public static void main(String[] args) {
		
		//Criação de constantes.
			
			final double ACELERAÇÃO_GRAVITACIONAL = 9.80665;
			
		//Criação de variáveis.
		
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
			System.out.println("Doador de Orgãos: "+ doadorOrgaos);
			System.out.println("Gravidade: "+ ACELERAÇÃO_GRAVITACIONAL + "m/s²");
	}

}
