package bytebank.br.com.ByteBank.Banco.Modelo;

public class Cliente implements Autenticavel {
	
	private String nome;
	private String cpf;
	private String profissao;
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(1313);
	}
	
	@Override
	public boolean autentica (int senha) {
		return this.autenticador.autentica(1313);
	}
	
//Nome:
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
//CPF:
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
//Profissao:

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
