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
public interface Fila {
    public void enqueue(Pessoa valor);
    public void imprimir();
    public Pessoa dequeue();
    public Pessoa head();
    public int size();
    public boolean isEmpty();
    public void clear();
}
