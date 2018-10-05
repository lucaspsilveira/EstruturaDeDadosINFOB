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
public class Filinha implements Fila {
    Nodo inicio;

    public Filinha() {
        this.inicio = null;
    }
    
    
    @Override
    public void enqueue(Pessoa valor){
        if (inicio == null){
            inicio = new Nodo(valor);
        } else {
            Nodo aux = inicio;
            while (aux.getApos() != null) {
                aux = aux.getApos();
            }
            aux.setApos(new Nodo(valor));        
        }
    }
    
    @Override
    public void imprimir(){
        if (isEmpty()) {
            System.out.println("Lista Vazia");
        }
        Nodo no = inicio;
        while (no != null){
            System.out.println(no.getDado());
            no = no.getApos();
        }
    }
    
    @Override
    public Pessoa dequeue(){
        if (isEmpty()){
            return null;
        } else {
            Pessoa dado = inicio.getDado();
            inicio = inicio.getApos();
             return dado;
            
            
        }
    }
    @Override
    public Pessoa head(){
        return inicio.getDado();
    }
    @Override
    public int size() {
        Nodo no = inicio;
        int cont = 0;
        while (no != null) {
            cont++;
            no = no.getApos();
        }
        
        return cont;
    }
    @Override
    public boolean isEmpty(){
       return inicio == null;
    }
    @Override
    public void clear(){
        while (!isEmpty()){
            dequeue();
        }
    }
    
}
