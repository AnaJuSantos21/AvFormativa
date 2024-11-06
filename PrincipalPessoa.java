package AvFormativa.desafios;

public class PrincipalPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Vitoria", "(15)5555-5555");
		System.out.println("***************");
		System.out.println("\nPessoa");
		System.out.println("Nome: "+ pessoa.getNome());
		System.out.println("Telefone: "+ pessoa.getTelefone());

		
		
		PessoaFisica pessoafisica = new PessoaFisica("Cecilia Seabra", "(15)8888-8888", "444.444.444", "1234");
		System.out.println("***************");
		System.out.println("\nPessoa Física");
		System.out.println("Nome: "+ pessoafisica.getNome());
		System.out.println("Telefone: "+ pessoafisica.getTelefone());
		System.out.println("CPF: "+ pessoafisica.getCpf());
		System.out.println("RG: "+ pessoafisica.getRg());

	}

}
