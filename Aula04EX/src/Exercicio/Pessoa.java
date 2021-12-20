package Exercicio;

//Exerc�cio
//Declare de forma leg�vel vari�veis que representam seus dados pessoais como: nome, cpf, idade, altura, doador orgao, email, telefone e data de nascimento.
//Informe os valores de cada vari�vel considerando o tipo com dados reais ou fict�cios.

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	private double altura;
	private boolean doadorOrgao;
	private String email;
	private String telefone;
	private String dataNascimento;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public boolean isDoadorOrgao() {
		return doadorOrgao;
	}
	public void setDoadorOrgao(boolean doadorOrgao) {
		this.doadorOrgao = doadorOrgao;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	@Override
	public String toString() {
		return "Dados "
				+ "nome=" + nome + ","
				+ " cpf=" + cpf + ","
				+ " idade=" + idade + ","
				+ " altura=" + altura + ","
				+ " doadorOrgao=" + doadorOrgao + ","
				+ " email=" + email + ","
				+ " telefone=" + telefone + "," 
				+ " Data Nascimento="	+ dataNascimento;
	}

	public Pessoa(String nome, String cpf, int idade, double altura, boolean doadorOrgao, String email, String telefone,
			String dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.doadorOrgao = doadorOrgao;
		this.email = email;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}

}
