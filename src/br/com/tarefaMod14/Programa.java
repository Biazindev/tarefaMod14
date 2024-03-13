package br.com.tarefaMod14;

public class Programa {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		pf.setCpf(12345L);
		pf.setEndereco("Rua Java, 04");
		pf.setNome("Elionay");
		pf.setRegistroCarteira(true);
		System.out.println("******* Pessoa Física: " + pf.getNome() + " Escrita no CPF: " + pf.getCpf() + 
		" Residente no endereço: " + pf.getEndereco() + " Registrada?: " + pf.getRegistroCarteira() + " *******");

		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("Batman");
		pj.setEndereco("Bat Caverna");
		pj.setCnpj(1234566l);
		pj.setEmpresa(true);
		System.out.println(" ******* Pessoa Jurídica: " + pj.getNome() + " escrita no CNPJ: " + pj.getCnpj() +
		" Residente no endereço: " + pj.getEndereco() + " tem empresa?: " + pj.getEmpresa() + " *******" );
		
		
	}

}
