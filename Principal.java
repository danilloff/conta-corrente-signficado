package oi;

public class Principal {
	public static void main(String[] args) {
		ContaCorrenteSimp c1;
		c1 = new ContaCorrenteSimp(); //modo didático.
		
		ContaCorrenteSimp c2 = new ContaCorrenteSimp(); //boa prática.

		c1.agencia = "123";
		c1.nroConta = "1115-2";
		c1.nomeDoCorretista = "Kamila";
		c1.saldo = 10000.00;
		c1.especial = true;

		c2.agencia = "123";
		c2.nroConta = "2227-3";
		c2.nomeDoCorretista = "Marcus";
		c2.saldo = 10000.00;
		c2.especial = true;
		

		c1.sacar(11000);
		c1.exibirSaldo();
		
		PessoaFisica pessoa = new PessoaFisica();
		pessoa.nome = "João da Silva";
		pessoa.dataNascimento = "29/02/1996";
		pessoa.cpf = "123.456.789-11";
		pessoa.rg = "85732-22";
		pessoa.orgaoExpedidor = "SSP/GO";
		pessoa.profissao = "Desenvolvedor";
		
		ContaCorrenteSimp c3 = new ContaCorrenteSimp();
		c3.agencia = "456-1";
		c3.nroConta = "33725-2";
		c3.especial = false;
		c3.adicionarPessoa(pessoa);
		c3.imprimirDadosCorrentista();
		
		
		
		
		
	}

}
