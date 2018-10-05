/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filasdinamicadesafio;

/**
 *
 * @author Lucas
 */
public class Nodo {
    	private Pessoa dado;
	private Nodo apos;

	public Nodo(Pessoa dado) {
		this.dado = dado;
		this.apos = null;
	}

	public Pessoa getDado() {
		return dado;
	}

	public Nodo getApos() {
		return apos;
	}

	public void setDado(Pessoa dado) {
		this.dado = dado;
	}

	public void setApos(Nodo apos) {
		this.apos = apos;
	}
}
