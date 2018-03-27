class Principal {
	public static void main(String[] args) {
		Aluno a = new Aluno(4.6, 3.3, 2.5);
		System.out.printf("Nota 1: %.2f\n", a.obterNota1());
		System.out.printf("Nota 2: %.2f\n", a.obterNota2());
		System.out.printf("Nota 3: %.2f\n", a.obterNota3());
		System.out.printf("Média: %.2f\n", a.obterMedia());
		
		double media = a.obterMedia();
		if (media >= 6.0) {
			System.out.println("Situação: Aprovado");	
		} else if (media >= 5.0) {
			System.out.println("Situação: Em recuperação");	
		} else {
			System.out.println("Situação: Reprovado");	
		}
	}
}
