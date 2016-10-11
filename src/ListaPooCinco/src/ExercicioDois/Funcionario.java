package ExercicioDois;

public class Funcionario extends PessoaFisica {
	
	private String carteiraTrabalho;
	private String dataContratacao;
	private double salario;
	
	public Funcionario(String carteiraTrabalho, String dataContratacao, double salario,
					   char pFSexo, String pFIdantidade, String pFCpf, String pNome, String pTelefone){
		
		super(pFSexo, pFIdantidade, pFCpf, pNome, pTelefone);
		this.carteiraTrabalho = carteiraTrabalho;
		this.dataContratacao = dataContratacao;
		this.salario = salario;
	}

	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	public String getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void reajusteSalarial(double percentualAjuste){
		this.salario += (this.salario * percentualAjuste);
	}
	
	public String getAnoContratacao(){
		return " "+this.dataContratacao.substring(4, 8);
	}
}
