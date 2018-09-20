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

		animais.adicionarNoComeco("Come�o 1");
		animais.adicionarNoComeco("Come�o 2");
		System.out.println("\n\nAdcionado no come�o:\n");
		animais.imprimir();
		
		System.out.println("\n\n Impress�o Come�o ao fim:\n");
		animais.imprimir();
		System.out.println("\n\n Impress�o Fim ao come�o:\n");
		animais.imprimirTrasPraFrente();
		
		System.out.println("\nBuscando elemento da posi��o 0 - in�cio em 0\n");
		System.out.println(animais.retornaDado(0));
		System.out.println("\nBuscando elemento da posi��o 3 - in�cio em 0\n");
		System.out.println(animais.retornaDado(3));
		
		System.out.println("\nAdi��o na posi��o 0 - in�cio em 0\n");
		animais.adicionarNaPosicao("posi��o 0", 0);
		System.out.println("\nImpress�o p�s inser��o:\n ");
		animais.imprimir();
		System.out.println("\nAdi��o na posi��o 2 - in�cio em 0\n");
		animais.adicionarNaPosicao("posi��o 2", 2);
		System.out.println("\nImpress�o p�s inser��o:\n ");
		animais.imprimir();
		System.out.println("\nAdi��o na posi��o 3 - in�cio em 0\n");
		animais.adicionarNaPosicao("posi��o 3", 3);
		System.out.println("\nImpress�o p�s inser��o:\n ");
		animais.imprimir();
		
		
		System.out.println("Remo��o na posi��o 0: in�cio em 0\n");
		animais.removePosicao(0);
		animais.imprimir();
		
		System.out.println("Remo��o na posi��o 2: in�cio em 0\n");
		animais.removePosicao(2);
		animais.imprimir();
		
		
		System.out.println("\nRemo��o de ocorr�ncia 'posi��o 2': \n");
		animais.removerPorOcorrencia("Posi��o 2");
		animais.imprimir2();
		System.out.println("\nRemo��o de ocorr�ncia 'Lhama': \n");
		animais.removerPorOcorrencia("Lhama");
		animais.imprimir2();
		
	}
}
