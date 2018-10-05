/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filasdinamica;

/**
 *
 * @author Lucas
 */
public class Nodo {
    	private String dado;
	private Nodo apos;

	public Nodo(String dado) {
		this.dado = dado;
		this.apos = null;
	}

	public String getDado() {
		return dado;
	}

	public Nodo getApos() {
		return apos;
	}

	public void setDado(String dado) {
		this.dado = dado;
	}

	public void setApos(Nodo apos) {
		this.apos = apos;
	}
}
