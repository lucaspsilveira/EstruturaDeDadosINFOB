package ListaEncadeada;

public class Nodo {
	private String dado;
	private Nodo proximo;

	public Nodo(String dado) {
		this.dado = dado;
		this.proximo = null;
	}

	public String getDado() {
		return dado;
	}

	public Nodo getProximo() {
		return proximo;
	}

	public void setDado(String dado) {
		this.dado = dado;
	}

	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
}
