package tpFinal;

public class Cliente {
	
	private String cpf;
	private String nome;
	private String identidade;
	private String endereco;
	private String telefone;
	private String dataNascimento;
	
	public Cliente(String cpf, String nome, String identidade, String endereco, String telefone, String dataNascimento) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.identidade = identidade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
