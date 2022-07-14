package com.dio.desafio.oo;

public class Main {
	public static void main(String[] args) {
	    // criando nova conta corrente
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Jean Fernandes");
	    Conta cc = new ContaCorrente(cliente1);
	    
	    // criando nova conta poupança 
	    Cliente cliente2 = new Cliente();
	    cliente2.setNome("Carolina Iurk");
	    Conta poupanca = new ContaPoupanca(cliente2);
	    
	    // depositando valor na conta corrente 
	    cc.depositar(100);
	    
	    // transferindo valor da conta corrente para a conta poupança 
	    cc.transferir(100, poupanca);
	    
	    // imprimindo extrato da conta corrente
	    cc.imprimirExtrato();
	    System.out.println();
	    
	    // imprimindo extrato da conta poupança 
	    poupanca.imprimirExtrato();
	}
}