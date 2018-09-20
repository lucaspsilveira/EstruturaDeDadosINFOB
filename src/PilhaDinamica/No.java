package PilhaDinamica;

public class No {
	private String dado;
	private No abaixo;

	public No(String dado) {
		this.dado = dado;
		this.abaixo = null;
	}

	public String getDado() {
		return dado;
	}

	public No getAbaixo() {
		return abaixo;
	}

	public void setDado(String dado) {
		this.dado = dado;
	}

	public void setAbaixo(No abaixo) {
		this.abaixo = abaixo;
	}
}
