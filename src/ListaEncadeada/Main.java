package ListaEncadeada;

public class Main {
	public static void main(String[] args) {
		Listinha l = new Listinha();
		l.adicionarFinal("Batata");
		l.adicionarFinal("Pure");
		l.adicionarFinal("Bolacha");
		l.adicionarFinal("Biscoito");
		l.adicionarFinal("Pizza");
		System.out.println("Após inserção no final:");
		l.imprimir();
		System.out.println("------");
		System.out.println("Inserção no começo:");
		l.adicionarComeco("comeco");
		l.adicionarComeco("comeco2");
		l.imprimir();
		System.out.println("------");
		System.out.println("Adicionar na Posição 2 -- contagem inicia em 0");
		l.adicionarNaPosicao("posição 2", 2);
		l.imprimir();
		System.out.println("------");
		System.out.println("Adicionar na Posição 0 -- contagem inicia em 0");
		l.adicionarNaPosicao("posição 0", 0);
		l.imprimir();
		System.out.println("------");
		System.out.println("Remoção na posição 0  -- contagem inicia em 0");
		l.removerNaPosicao(0);
		l.imprimir();
		System.out.println("------");
		System.out.println("Remoção na posição 2  -- contagem inicia em 0");
		l.removerNaPosicao(2);
		l.imprimir();
		System.out.println("------");
		System.out.println("Substituir na posição 1  -- contagem inicia em 0");
		l.substituirNaPosicao("substiuído", 1);;
		l.imprimir();
		System.out.println("------");
		System.out.println("Remoção da bolacha:");
		l.remover("Bolacha");
		l.imprimir();
		System.out.println("------ índices começam contagem em 0 ------");
		System.out.println("índice da bolacha:" + l.posicaoDado("Bolacha"));
		System.out.println("------");
		System.out.println("índice do comeco2:" + l.posicaoDado("comeco2"));
		System.out.println("------");
		System.out.println("índice do Pure:" + l.posicaoDado("Pure"));
		System.out.println("\nListinha Final:\n");
		l.imprimir();
		
		
		

	}
}
