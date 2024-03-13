package br.com.tarefaMod14;

public class PessoaJuridica extends Pessoa {
	
	private Long cnpj;
	
	private Boolean empresa;

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public Boolean getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Boolean empresa) {
		this.empresa = empresa;
	}
	

}
