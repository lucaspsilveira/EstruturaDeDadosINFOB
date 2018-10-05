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
public class Main {

    public static void main(String[] args) {
        Filinha fila = new Filinha();
    System.out.println("Adicionando 4 elementos");
        fila.enqueue("1");
        fila.enqueue("2");
        fila.enqueue("3");
        fila.enqueue("4");

        System.out.println("Primeiro da fila: " + fila.head());

        System.out.println("Tamanho da Fila: " + fila.size());
        System.out.println("Lista inteira: ");
        fila.imprimir();

        System.out.println("Dequeue: " + fila.dequeue());
        System.out.println("Dequeue: " + fila.dequeue());
        System.out.println("Tamanho da Fila: " + fila.size());
        System.out.println("Lista inteira: ");
        fila.imprimir();
        System.out.println("Dequeue: " + fila.dequeue());
        System.out.println("Tamanho da Fila: " + fila.size());
        System.out.println("Lista inteira: ");
        fila.imprimir();
        System.out.println("Dequeue: " + fila.dequeue());
        System.out.println("Tamanho da Fila: " + fila.size());
        System.out.println("Lista inteira: ");
        fila.imprimir();
        System.out.println("Dequeue: " + fila.dequeue());
        
        System.out.println("Adicionando 4 elementos de novo...");
        fila.enqueue("1");
        fila.enqueue("2");
        fila.enqueue("3");
        fila.enqueue("4");
        
        System.out.println("Tamanho da Fila: " + fila.size());
        System.out.println("Lista inteira: ");
        fila.imprimir();
        
        fila.clear();
        System.out.println("Após Limpar com clear");
        System.out.println("Tamanho da Fila: " + fila.size());
        System.out.println("Lista inteira: ");
        fila.imprimir();
    }
}
