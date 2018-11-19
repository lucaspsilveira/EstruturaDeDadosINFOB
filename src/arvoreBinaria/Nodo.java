package arvoreBinaria;

public class Nodo {
	private Nodo pai;
	private Nodo esquerda;
	private Nodo direita;
	private String dado;
	
	public Nodo getPai() {
		return pai;
	}
	public void setPai(Nodo pai) {
		this.pai = pai;
	}
	public Nodo getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(Nodo esquerda) {
		this.esquerda = esquerda;
	}
	public Nodo getDireita() {
		return direita;
	}
	public void setDireita(Nodo direita) {
		this.direita = direita;
	}
	public String getDado() {
		return dado;
	}
	public void setDado(String dado) {
		this.dado = dado;
	}
	
	
}
