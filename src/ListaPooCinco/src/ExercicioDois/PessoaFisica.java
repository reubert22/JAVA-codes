package ExercicioDois;

public class PessoaFisica extends Pessoa{
	private char sexo;
	private String identidade;
	private String cpf;
	
	public PessoaFisica(char sexo, String identidade, String cpf, String nome, String telefone){
		super(nome, telefone);
		this.sexo = sexo;
		this.identidade = identidade;
		this.cpf = cpf;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
}
