package br.com.tarefaMod14;

public class PessoaFisica extends Pessoa {
	
	private Long cpf;
	
	private Boolean registroCarteira;

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Boolean getRegistroCarteira() {
		return registroCarteira;
	}

	public void setRegistroCarteira(boolean b) {
		this.registroCarteira = b;
	}

}
