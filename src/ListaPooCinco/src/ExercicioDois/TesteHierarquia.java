package ExercicioDois;

public class TesteHierarquia {
	public static void main(String[] args) {
		PessoaFisica pesFisica = new PessoaFisica('M', "92902992", "93327382623", "Ademar", "3561-1183");
		PessoaJuridica pesJuridica = new PessoaJuridica("637272367632", "ComercialAguas", "Reubert", "997494545");
		Funcionario funcionario = new Funcionario("1112234", "07082000", 1000.00, 'M', "15536217", "8263576725", "Jose", "43276647");
		
		System.out.println("Pessoa Fisica\nNome: "+pesFisica.getNome()+"\nSexo: "+pesFisica.getSexo()+"\nCPF: "+pesFisica.getCpf()+"\nRG: "+pesFisica.getIdentidade()+"\nTelefone: "+pesFisica.getTelefone());
		System.out.println("\nPessoa Juridica\nNome: "+pesJuridica.getNome()+"\nCNPJ: "+pesJuridica.getCpnj()+"\nRazão Social: "+pesJuridica.getRazaoSocial()+"\nTelefone: "+pesJuridica.getTelefone());
		System.out.println("\nFuncionario\nNome: "+funcionario.getNome()+"\nSexo: "+funcionario.getSexo()+"\nCarteira de Trabalho: "+funcionario.getCarteiraTrabalho()+
							"\nData de Contratação: "+funcionario.getDataContratacao()+"\nSalário: "+funcionario.getSalario()+"\nIdentidade: "+funcionario.getIdentidade()+
							"\nCPF: "+funcionario.getCpf()+"\nTelefone: "+funcionario.getTelefone());
		funcionario.reajusteSalarial(0.10);
		System.out.println("\nFuncionario: "+funcionario.getNome()+"\nAno de contrato: "+funcionario.getAnoContratacao()+"\nNovo salario: "+funcionario.getSalario());
	}

}
