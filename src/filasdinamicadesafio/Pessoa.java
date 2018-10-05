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
public class Pessoa {
    private String nome;
    private boolean prioritario;

    public Pessoa(String nome, boolean prioritario) {
        this.nome = nome;
        this.prioritario = prioritario;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPrioritario() {
        return prioritario;
    }

    public void setPrioritario(boolean prioritario) {
        this.prioritario = prioritario;
    }
    
}
