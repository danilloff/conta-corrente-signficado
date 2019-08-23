package oi;

public class ContaCorrenteSimp {
	
	String nomeDoCorretista;
	String agencia;
	String nroConta;
	double saldo;
	boolean especial;
	PessoaFisica[] pessoas = new PessoaFisica[2];
	int qtdMax = 2;
	int qtdAtual = 0;
	
	

	double sacar (double valor){
		if(valor > this.saldo && this.especial == false ){
		System.out.print("Saldo Insuficiente\n");
	}
			
		else { 
			if(this.saldo - valor > -5000)
				this.saldo= this.saldo - valor;
			
		}
		return this.saldo;
	}
	
	double depositar (double valor){
		this.saldo= this.saldo + valor;
		return this.saldo;
	}
	
	void exibirSaldo (){
	System.out.println("Saldo : "+ this.saldo);
	}
	
	void adicionarPessoa(PessoaFisica p) {
		if (qtdAtual < qtdMax) {
			this.pessoas[qtdAtual] = p;
			qtdAtual++;
		}
	}
	
	
	void imprimirDadosCorrentista() {
		if(this.pessoas[0] != null) {
			System.out.println("==== CORRENTISTA 1 ====");
			System.out.println("NOME: "+this.pessoas[0].nome);
			System.out.println("CPF: "+this.pessoas[0].cpf);
			System.out.println("RG: "+this.pessoas[0].rg);
			System.out.println("ORGÃO EXPEDIDOR: "+this.pessoas[0].orgaoExpedidor);
			System.out.println("DATA NASCIMENTO: "+this.pessoas[0].dataNascimento);
			System.out.println("PROFISSÃO: "+this.pessoas[0].profissao);
			}
		
		if(this.pessoas[1] != null) {
			System.out.println("==== CORRENTISTA 2 ====");
			System.out.println("NOME: "+this.pessoas[1].nome);
			System.out.println("CPF: "+this.pessoas[1].cpf);
			System.out.println("RG: "+this.pessoas[1].rg);
			System.out.println("ORGAO EXPEDIDOR: "+this.pessoas[1].orgaoExpedidor);
			System.out.println("DATA NASCIMENTO: "+this.pessoas[1].dataNascimento);
			System.out.println("PROFISSÃO: "+this.pessoas[1].profissao);
			}
	
	}
}
