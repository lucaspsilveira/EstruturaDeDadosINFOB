package ListaDuplamenteEncadeada;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listinha animais = new Listinha();
		animais.adicionarNoFinal("Lhama");
		animais.adicionarNoFinal("Gato");
		animais.adicionarNoFinal("Mafagafinho");
		animais.adicionarNoFinal("Coelho");
		animais.adicionarNoFinal("Cachorro");
		System.out.println("Adcionado no Final\n");
		animais.imprimir();

		animais.adicionarNoComeco("Começo 1");
		animais.adicionarNoComeco("Começo 2");
		System.out.println("\n\nAdcionado no começo:\n");
		animais.imprimir();
		
		System.out.println("\n\n Impressão Começo ao fim:\n");
		animais.imprimir();
		System.out.println("\n\n Impressão Fim ao começo:\n");
		animais.imprimirTrasPraFrente();
		
		System.out.println("\nBuscando elemento da posição 0 - início em 0\n");
		System.out.println(animais.retornaDado(0));
		System.out.println("\nBuscando elemento da posição 3 - início em 0\n");
		System.out.println(animais.retornaDado(3));
		
		System.out.println("\nAdição na posição 0 - início em 0\n");
		animais.adicionarNaPosicao("posição 0", 0);
		System.out.println("\nImpressão pós inserção:\n ");
		animais.imprimir();
		System.out.println("\nAdição na posição 2 - início em 0\n");
		animais.adicionarNaPosicao("posição 2", 2);
		System.out.println("\nImpressão pós inserção:\n ");
		animais.imprimir();
		System.out.println("\nAdição na posição 3 - início em 0\n");
		animais.adicionarNaPosicao("posição 3", 3);
		System.out.println("\nImpressão pós inserção:\n ");
		animais.imprimir();
		
		
		System.out.println("Remoção na posição 0: início em 0\n");
		animais.removePosicao(0);
		animais.imprimir();
		
		System.out.println("Remoção na posição 2: início em 0\n");
		animais.removePosicao(2);
		animais.imprimir();
		
		
		System.out.println("\nRemoção de ocorrência 'posição 2': \n");
		animais.removerPorOcorrencia("Posição 2");
		animais.imprimir2();
		System.out.println("\nRemoção de ocorrência 'Lhama': \n");
		animais.removerPorOcorrencia("Lhama");
		animais.imprimir2();
		
	}
}
