package ListaDuplamenteEncadeada;

public class Listinha {
	private Nodo primeiro;
	private Nodo ultimo;

	public Listinha(){
        this.primeiro = null;
        this.ultimo = null;        
    }

	public void removePosicao(int posicao) {
		Nodo remover = retornaNodo(posicao);
		if (remover == primeiro) {
			primeiro.proximo.anterior = null;
			primeiro = primeiro.proximo;
		} else if (remover == ultimo) {
			ultimo.anterior.proximo = null;
			ultimo = ultimo.anterior;
		} else {
			remover.anterior.proximo = remover.proximo;
			remover.proximo.anterior = remover.anterior;
		}
	}

	public Nodo retornaNodo(int posicao) {
		Nodo aux = primeiro;
		for (int i = 0; i < posicao; i++) {
			if (aux != null) {
				aux = aux.proximo;
			} else {
				break;
			}
		}
		return aux;
	}

	// buscar o elemento da lista que se encontra
	// em uma determinada posição;
	public String retornaDado(int posicao) {
		Nodo aux = primeiro;
		for (int i = 0; i < posicao; i++) {
			if (aux != null) {
				aux = aux.proximo;
			} else {
				break;
			}
		}
		if (aux == null) {
			return "";
		} else {
			return aux.dado;
		}
	}

	public void removerPorOcorrencia(String dado) {
		Nodo aux = primeiro;
		while (true) {
			if (aux.dado.equalsIgnoreCase(dado)) {
				if (aux == primeiro) {
					primeiro.proximo.anterior = null;
					primeiro = primeiro.proximo;
					break;
				} else if (aux == ultimo) {
					ultimo.anterior.proximo = null;
					ultimo = ultimo.anterior;
					break;
				} else {
					// forma 1
					aux.anterior.proximo = aux.proximo;
					aux.proximo.anterior = aux.anterior;

					// forma 2
					/*
					 * Nodo antes = aux.anterior; Nodo depois = aux.proximo; antes.proximo = depois;
					 * depois.anterior = antes;
					 */
					break;
				}
			} // fecha o if do caso onde encontrou o dado
				// verifica se chegou ao final, senão chegou, passa
				// para o próximo
			if (aux == ultimo) {
				break;
			} else {
				aux = aux.proximo;
			}
		} // fecha o while
	}

	public void imprimir2() {
		Nodo aux = primeiro;
		while (true) {
			System.out.println(aux.dado);
			if (aux == ultimo) {
				break;
			}
			aux = aux.proximo;
		}
	}
	public void imprimirTrasPraFrente() {
		Nodo aux = ultimo;
		while (true) {
			System.out.println(aux.dado);
			if (aux == primeiro) {
				break;
			}
			aux = aux.anterior;
		}
	}

	public void imprimir() {
		Nodo aux = primeiro;
		while (aux != ultimo) {
			System.out.println(aux.dado);
			aux = aux.proximo;
		}
		System.out.println(ultimo.dado);
	}

	public void adicionarNoFinal(String dado) {
		Nodo novoNodo = new Nodo(dado);
		if (primeiro == null) {
			// lista está vazia
			primeiro = novoNodo;
			ultimo = novoNodo;
		} else {
			ultimo.proximo = novoNodo;
			novoNodo.anterior = ultimo;
			ultimo = novoNodo;
		}
	}
	public void adicionarNoComeco(String dado) {
		Nodo novoNodo = new Nodo(dado);
		if (primeiro == null) {
			// lista está vazia
			primeiro = novoNodo;
			ultimo = novoNodo;
		} else {
			primeiro.anterior = novoNodo;
			novoNodo.proximo = primeiro;
			primeiro = novoNodo;
		}
	}
	public void adicionarNaPosicao(String dado, int posicao) {
		Nodo nodoNaPosicao = retornaNodo(posicao);
		Nodo novoNodo = new Nodo(dado);
		if (primeiro == null) {
			// lista está vazia
			primeiro = novoNodo;
			ultimo = novoNodo;
		} else {
			if (nodoNaPosicao == primeiro) {
				primeiro.anterior = novoNodo;
				novoNodo.proximo = primeiro;
				primeiro = novoNodo;
			} else if (nodoNaPosicao == ultimo) {
				ultimo.proximo = novoNodo;
				novoNodo.anterior = ultimo;
				ultimo = novoNodo;
			} else {
				novoNodo.proximo = nodoNaPosicao;
				novoNodo.anterior = nodoNaPosicao.anterior;
				nodoNaPosicao.anterior.proximo = novoNodo;
				nodoNaPosicao.anterior = novoNodo;
			}
			
		}
	}
}
