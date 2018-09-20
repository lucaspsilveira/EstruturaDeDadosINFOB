package PilhaDinamica;

public interface Pilha {
    /**
     * Insere o elemento e no topo da pilha
     * @param dado String a ser adicionada no topo da pilha
     */
    public void push(String dado);
    /**
     * remove e retorna o elemento do topo da pilha, retorna
     * null se a pilha estiver vazia
     * @return String contida no topo da pilha
     */
    public String pop();
    
    /**
     * Retorna, mas n�o remove, o elemento do topo da pilha, 
     * retorna null se a pilha estiver vazia
     * @return String contida no topo da pilha
     */
    public String top();
    
    /**
     * Retorna o n�mero de elementos da pilha
     * @return total de elementos da pilha
     */
    public int size();
    
    /**
     * retorna true se a pilha estiver vazia, 
     * e false caso contr�rio
     * @return true caso vazio, false caso contr�rio
     */
    public boolean isEmpty();

    /**
     * Esvazia a pilha
     */
    public void clear();
    public void mostraMilha();
}
