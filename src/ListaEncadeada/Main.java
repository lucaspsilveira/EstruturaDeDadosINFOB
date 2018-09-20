package ListaEncadeada;

public class Main {
	public static void main(String[] args) {
		Listinha l = new Listinha();
		l.adicionarFinal("Batata");
		l.adicionarFinal("Pure");
		l.adicionarFinal("Bolacha");
		l.adicionarFinal("Biscoito");
		l.adicionarFinal("Pizza");
		System.out.println("Ap�s inser��o no final:");
		l.imprimir();
		System.out.println("------");
		System.out.println("Inser��o no come�o:");
		l.adicionarComeco("comeco");
		l.adicionarComeco("comeco2");
		l.imprimir();
		System.out.println("------");
		System.out.println("Adicionar na Posi��o 2 -- contagem inicia em 0");
		l.adicionarNaPosicao("posi��o 2", 2);
		l.imprimir();
		System.out.println("------");
		System.out.println("Adicionar na Posi��o 0 -- contagem inicia em 0");
		l.adicionarNaPosicao("posi��o 0", 0);
		l.imprimir();
		System.out.println("------");
		System.out.println("Remo��o na posi��o 0  -- contagem inicia em 0");
		l.removerNaPosicao(0);
		l.imprimir();
		System.out.println("------");
		System.out.println("Remo��o na posi��o 2  -- contagem inicia em 0");
		l.removerNaPosicao(2);
		l.imprimir();
		System.out.println("------");
		System.out.println("Substituir na posi��o 1  -- contagem inicia em 0");
		l.substituirNaPosicao("substiu�do", 1);;
		l.imprimir();
		System.out.println("------");
		System.out.println("Remo��o da bolacha:");
		l.remover("Bolacha");
		l.imprimir();
		System.out.println("------ �ndices come�am contagem em 0 ------");
		System.out.println("�ndice da bolacha:" + l.posicaoDado("Bolacha"));
		System.out.println("------");
		System.out.println("�ndice do comeco2:" + l.posicaoDado("comeco2"));
		System.out.println("------");
		System.out.println("�ndice do Pure:" + l.posicaoDado("Pure"));
		System.out.println("\nListinha Final:\n");
		l.imprimir();
		
		
		

	}
}
