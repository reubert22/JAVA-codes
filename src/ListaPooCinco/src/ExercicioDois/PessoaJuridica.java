package ExercicioDois;

public class PessoaJuridica extends Pessoa {
	
	private String cpnj;
	private String razaoSocial;
	
	public PessoaJuridica(String cnpj, String razaoSocial, String nome, String telefone){
		super(nome, telefone);
		this.cpnj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getCpnj() {
		return cpnj;
	}

	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
}
