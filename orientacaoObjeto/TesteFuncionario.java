package cursoJava.orientacaoObjeto;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		FuncionarioOperacional f1 = new FuncionarioOperacional(1112, "Sara", "Auxiliar administrativo", 2000.0, "Vendas");
		
		FuncionarioOperacional f2 = new FuncionarioOperacional();
		
		FuncionarioOperacional f3 = new FuncionarioOperacional();

		
		System.out.println(f1.getCadastro());
		System.out.println(f1.getNome());
		System.out.println(f1.getOcupacao());
		System.out.println(f1.getSalario());
		System.out.println(f1.getSetor());
		
		FuncionarioOperacional.verFuncionarios();
		
	}

}
