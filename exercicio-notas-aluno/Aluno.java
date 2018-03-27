class Aluno {
	double notas[];
	
	Aluno(double n1, double n2, double n3) {
		notas = new double[3];
		notas[0] = n1;
		notas[1] = n2;
		notas[2] = n3;		
	}
	
	double obterNota1() { return notas[0]; }
	double obterNota2() { return notas[1]; }
	double obterNota3() { return notas[2]; }
	
	double obterMedia() {
		double soma = 0.0;
		for (double n :  notas) {
			soma += n;
		}
		return (soma / notas.length);
	}
}
