package ListaCircular;

public class Listinha {

	private Nodo primeiro;
	private Nodo ultimo;

	public Listinha() {
		this.primeiro = null;
		this.ultimo = null;
	}

	public void adicionarFinal(String dado) {
		Nodo novoNodo = new Nodo(dado);
		if (primeiro == null) {
			primeiro = novoNodo;
			ultimo = novoNodo;
			ultimo.setProximo(primeiro);
		} else {
			ultimo.setProximo(novoNodo);
			novoNodo.setProximo(primeiro);
			ultimo = novoNodo;
		}
	}

	public void adicionarComeco(String dado) {
		Nodo novoNodo = new Nodo(dado);
		if (primeiro == null) {
			primeiro = novoNodo;
			ultimo = novoNodo;
			ultimo.setProximo(primeiro);
			;
		} else {
			novoNodo.setProximo(primeiro);
			primeiro = novoNodo;
			ultimo.setProximo(primeiro);
		}
	}

	public void imprimir() {
		Nodo aux = primeiro;
		while (aux.getProximo() != primeiro) {
			System.out.println(aux.getDado());
			aux = aux.getProximo();
		}
		System.out.println(aux.getDado());
	}

	public void remover(String dado) {
		Nodo aux = primeiro;
		if (primeiro.getDado().equalsIgnoreCase(dado)) {
			primeiro = primeiro.getProximo();
			ultimo.setProximo(primeiro);
		} else if (aux.getProximo() == ultimo && ultimo.getDado().equalsIgnoreCase(dado)) {
			aux.setProximo(primeiro);
			ultimo = aux;
		} else {
			do {
				if (aux.getProximo().getDado().equalsIgnoreCase(dado)) {
					aux.setProximo(aux.getProximo().getProximo());
				} else {
					aux = aux.getProximo();
				}
			} while (aux.getProximo() != primeiro);
		}
	}

	public Nodo buscaElemento(String dado) {
		Nodo aux = primeiro;
		do {
			if (dado.equalsIgnoreCase(aux.getDado())) {
				return aux;
			} else {
				aux = aux.getProximo();
			}
		} while (aux != primeiro);
		
		return aux;
	}
}
