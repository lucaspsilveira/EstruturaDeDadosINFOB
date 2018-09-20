package ListaEncadeada;

public class Listinha {

	private Nodo primeiro;

	public Listinha() {
		this.primeiro = null;
	}

	public void adicionarFinal(String dado) {
		if (primeiro == null) {
			primeiro = new Nodo(dado);
		} else {
			Nodo novoNodo = new Nodo(dado);
			Nodo aux = primeiro;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novoNodo);
		}
	}

	public void adicionarComeco(String dado) {
		if (primeiro == null) {
			primeiro = new Nodo(dado);
		} else {
			Nodo novoNodo = new Nodo(dado);
			novoNodo.setProximo(primeiro);
			primeiro = novoNodo;
		}
	}

	public void adicionarNaPosicao(String dado, int pos) {
		Nodo novoNodo = new Nodo(dado);
		Nodo aux = primeiro;
		int cont = 0;
		if (pos == 0) {
			novoNodo.setProximo(primeiro);
			primeiro = novoNodo;
		}
		while (aux != null) {
			if (cont == pos - 1) {
				novoNodo.setProximo(aux.getProximo());
				aux.setProximo(novoNodo);
				break;
			}
			aux = aux.getProximo();
			cont++;
		}
	}

	public void imprimir() {
		Nodo aux = primeiro;
		while (aux.getProximo() != null) {
			System.out.println(aux.getDado());
			aux = aux.getProximo();
		}
		System.out.println(aux.getDado());
	}

	public void removerNaPosicao(int pos) {
		if (pos == 0) {
			primeiro = primeiro.getProximo();
		} else {
			Nodo aux = primeiro;
			for (int i = 0; i < pos - 1; i++) {
				aux = aux.getProximo();
			}
			aux.setProximo(aux.getProximo().getProximo());
		}
	}
	
	public void substituirNaPosicao(String dado, int pos) {
		Nodo novo = new Nodo(dado);
		if (pos == 0) {
			novo.setProximo(primeiro.getProximo());
			primeiro = novo;
		} else {
			Nodo aux = primeiro;
			for (int i = 0; i < pos - 1; i++) {
				aux = aux.getProximo();
			}
			novo.setProximo(aux.getProximo());
			aux.setProximo(novo);
		}
	}

	public int posicaoDado(String dado) {
		Nodo aux = primeiro;
		int cont = 0;
		while (aux != null) {
			if (aux.getDado().equals(dado)) {
				return cont;
			} else {
				cont++;
				aux = aux.getProximo();
			}
		}
		return -1;
	}

	public void remover(String dado) {
		Nodo aux = primeiro;
		if (primeiro.getDado().equalsIgnoreCase(dado)) {
			primeiro = primeiro.getProximo();
		} else {
			do {
				if (aux.getProximo().getDado().equalsIgnoreCase(dado)) {
					aux.setProximo(aux.getProximo().getProximo());
				} else {
					aux = aux.getProximo();
				}
			} while (aux.getProximo() != null);
		}
	}
}
