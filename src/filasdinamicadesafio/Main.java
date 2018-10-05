/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filasdinamicadesafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucas
 */
public class Main {

    public static void main(String[] args) {
        Filinha filaNormais = new Filinha();
        Filinha filaPrioritarios = new Filinha();
        Filinha filaRetiradas = new Filinha();
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            boolean sair = false;
            do {
                System.out.println("\n========= CARTÓRIO ==========");
                System.out.println("Escolha uma das opções, digite: \n 1 - Cadastrar novo Cliente \n 2 - Chamar Cliente para atendimento \n 3 - Retirada de documentos \n 'Sair' - para Sair \n");
                String res = bf.readLine();
                switch (res) {
                    case "1":
                        System.out.println("Insira o nome do cliente: ");
                        String nome = bf.readLine();
                        System.out.println("Insira 'Sim' caso seja prioritário: ");
                        String prior = bf.readLine();
                        if (prior.equalsIgnoreCase("Sim")) {
                            filaPrioritarios.enqueue(new Pessoa(nome, true));
                        } else {
                            filaNormais.enqueue(new Pessoa(nome, false));
                        }
                        System.out.println("Cliente Adicionado!");
                        break;
                    case "2":
                        Pessoa pessoa = null;
                        if (!filaPrioritarios.isEmpty()) {
                            pessoa = filaPrioritarios.dequeue();
                            System.out.println("Cliente: " + pessoa.getNome() + " chamado para atendimento!");
                            filaRetiradas.enqueue(pessoa);
                        } else {
                            if (!filaNormais.isEmpty()) {
                                pessoa = filaNormais.dequeue();
                                System.out.println("Cliente: " + pessoa.getNome() + " chamado para atendimento!");
                                filaRetiradas.enqueue(pessoa);
                            } else {
                                System.out.println("Nenhum cliente em espera!");
                            }
                        }
                        break;
                    case "3":
                        Pessoa pes = null;
                        if (!filaRetiradas.isEmpty()) {
                            pes = filaRetiradas.dequeue();
                            System.out.println("Cliente: " + pes.getNome() + " chamado para Retirada!");
                        } else {
                            System.out.println("Nenhum cliente para retirada!");
                        }
                        break;
                    case "Sair":
                        sair = true;
                        break;
                    default:
                        System.out.println("Insira um valor válido meu querido :)");
                }
            } while (!sair);
            
            System.out.println("=== Hasta la vista baby! À Bientôt! ===");
        } catch (IOException ex) {
            ex.getStackTrace();
        }

//        filaNormais.enqueue(new Pessoa("Lucas", true));
//        filaNormais.enqueue(new Pessoa("José", true));
//        filaNormais.enqueue(new Pessoa("Paula", true));
//        filaNormais.enqueue(new Pessoa("Claudia", true));
//
//        System.out.println("Primeiro da fila: " + filaNormais.head());
//
//        System.out.println("Tamanho da Fila: " + filaNormais.size());
//        System.out.println("Lista inteira: ");
//        filaNormais.imprimir();
//
//        System.out.println("Dequeue: " + filaNormais.dequeue());
//        System.out.println("Dequeue: " + filaNormais.dequeue());
//        System.out.println("Tamanho da Fila: " + filaNormais.size());
//        System.out.println("Lista inteira: ");
//        filaNormais.imprimir();
//        System.out.println("Dequeue: " + filaNormais.dequeue());
//        System.out.println("Tamanho da Fila: " + filaNormais.size());
//        System.out.println("Lista inteira: ");
//        filaNormais.imprimir();
//        System.out.println("Dequeue: " + filaNormais.dequeue());
//        System.out.println("Tamanho da Fila: " + filaNormais.size());
//        System.out.println("Lista inteira: ");
//        filaNormais.imprimir();
//        System.out.println("Dequeue: " + filaNormais.dequeue());

    }
}
