package ListaCircular;

public class Main {
	public static void main(String[] args) {
		Listinha l = new Listinha();
		l.adicionarComeco("Lucas");
		l.adicionarComeco("Paula");
		l.adicionarComeco("Carolina");
		System.out.println("Ap�s adi��o no come�o: \n");
		l.imprimir();
		l.adicionarFinal("Jos�");
		l.adicionarFinal("Luana");
		l.adicionarFinal("Helena");
		System.out.println("Ap�s adi��o no Final: \n");
		l.imprimir();
		
		System.out.println("\n Busca o elemento 'Jos�': ");
		System.out.println(l.buscaElemento("Jos�").getDado());
		System.out.println("\n Busca o elemento 'Lucas': ");
		System.out.println(l.buscaElemento("Lucas").getDado());
		System.out.println("\n Busca o elemento 'Helena': ");
		System.out.println(l.buscaElemento("Helena").getDado());
		
		System.out.println("\n\nAs seguintes opera��es de remo��o utilizam m�todo que remove o dado independente de sua posi��o, tanto no in�cio, no meio ou no fim.");
		
		System.out.println("Removendo o elemento 'Carolina': \n");
		l.remover("Carolina");
		l.imprimir();
		System.out.println("Removendo o elemento 'Helena': \n");
		l.remover("Helena");
		l.imprimir();
		
		System.out.println("Removendo o elemento 'Jos�': \n");
		l.remover("Jos�");
		l.imprimir();
		
	}
}
