package ListaDuplamenteEncadeada;


public class Nodo {
    protected String dado;
    protected Nodo proximo;
    protected Nodo anterior;    
    
    public Nodo(String dado){
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    } 
    
    //getters e setters serão feitos depois/algum dia/talvez   
}

