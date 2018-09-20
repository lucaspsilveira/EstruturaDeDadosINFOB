package ListaCircular;

public class Main {
	public static void main(String[] args) {
		Listinha l = new Listinha();
		l.adicionarComeco("Lucas");
		l.adicionarComeco("Paula");
		l.adicionarComeco("Carolina");
		System.out.println("Após adição no começo: \n");
		l.imprimir();
		l.adicionarFinal("José");
		l.adicionarFinal("Luana");
		l.adicionarFinal("Helena");
		System.out.println("Após adição no Final: \n");
		l.imprimir();
		
		System.out.println("\n Busca o elemento 'José': ");
		System.out.println(l.buscaElemento("José").getDado());
		System.out.println("\n Busca o elemento 'Lucas': ");
		System.out.println(l.buscaElemento("Lucas").getDado());
		System.out.println("\n Busca o elemento 'Helena': ");
		System.out.println(l.buscaElemento("Helena").getDado());
		
		System.out.println("\n\nAs seguintes operações de remoção utilizam método que remove o dado independente de sua posição, tanto no início, no meio ou no fim.");
		
		System.out.println("Removendo o elemento 'Carolina': \n");
		l.remover("Carolina");
		l.imprimir();
		System.out.println("Removendo o elemento 'Helena': \n");
		l.remover("Helena");
		l.imprimir();
		
		System.out.println("Removendo o elemento 'José': \n");
		l.remover("José");
		l.imprimir();
		
	}
}
