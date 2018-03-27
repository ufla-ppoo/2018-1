class ContaBancaria {
	int numero;
	double saldo;
	double limite;
	
	// assinatura: ContaBancaria-int
	ContaBancaria(int numero) { 
		this.numero = numero;
		this.saldo = 0.0;
		this.limite = 0.0;
	}
	
	// assinatura: ContaBancaria-int-double
	ContaBancaria(int numero, double limite) { 
		this.numero = numero; 
		this.limite = limite;
		this.saldo = 0.0;
	}
	
	void depositar(double valor) {
    	saldo += valor;
	}
	
	boolean sacar(double valor) {
    	if (valor <= (saldo + limite) ) {
      		saldo -= valor;
      		return true;
    	}    	
    	return false;
	}
	
	void transferir(ContaBancaria contaDestino, double valor) {
		if (sacar(valor)) {
			contaDestino.depositar(valor);
		}
	}

	void imprimirDados() {
		System.out.printf("Número: %d\nSaldo: R$%.2f\nLimite: R$%.2f\n\n",
            numero, saldo, limite);
	}
	
	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria(123);
		ContaBancaria c2 = new ContaBancaria(321, 100);
		c1.imprimirDados();
		c2.imprimirDados();
		
		c2.transferir(c1, 50);
		
		c1.imprimirDados();
		c2.imprimirDados();
		
		double notas[] = {1.3, 7.5, 8.2, 9.0};
		for (double n : notas) {
			System.out.print(n + " ");		
		}
		
		
	}
}
