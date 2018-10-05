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
public class Filinha {
    Nodo inicio;

    public Filinha() {
        this.inicio = null;
    }
    
    
    
    public void enqueue(String valor){
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
    
    public String dequeue(){
        if (isEmpty()){
            return null;
        } else {
            String dado = inicio.getDado();
            inicio = inicio.getApos();
             return dado;
            
            
        }
    }
    public String head(){
        return inicio.getDado();
    }
    public int size() {
        Nodo no = inicio;
        int cont = 0;
        while (no != null) {
            cont++;
            no = no.getApos();
        }
        
        return cont;
    }
    public boolean isEmpty(){
       return inicio == null;
    }
    public void clear(){
        while (!isEmpty()){
            dequeue();
        }
    }
    
}
