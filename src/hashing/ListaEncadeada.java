package hashing;


public class ListaEncadeada {
	protected Nodo primeiro;
	
	public ListaEncadeada(){
		this.primeiro = null;	
	}
	
	/**
	 * remover um elemento contido em determinada posição da lista
	 * */
	public void removerDaPosicao(int posicao){
		if(primeiro == null){
			return;
		} else if(posicao == 0){
			primeiro = primeiro.proximo;
		} else {			
			Nodo aux = primeiro;			
			for(int i=0; i<posicao-1; i++){
				aux = aux.proximo;
			}
			//Neste ponto, aux terá o objeto ANTERIOR ao que queremos remover
			if(aux.proximo != null){
				aux.proximo = aux.proximo.proximo;
			}
		}
	}
		
	/**
	 *  imprimir todo o conteúdo da lista 
	 *  */
	public void imprimeTodos(){
		Nodo aux = primeiro;
		while(aux != null){
			System.out.println(aux.dado);
			aux = aux.proximo;			
		}		
	}	
	
	/**
	 * 
	 retornar o índice da primeira ocorrência do elemento na lista,
	 ou -1 se a lista não contiver o elemento.
	 */
	public int pesquisaPosicao(String dadoParaPesquisa){
		int posicao = 0;
		Nodo aux = primeiro;
		while(aux != null){
			if(aux.dado.getNome().equalsIgnoreCase(dadoParaPesquisa)){
				return posicao;
			} else {	
				aux = aux.proximo;
				posicao++;
			}
		}	
		return -1;
	}
	
	/**
	 * adicionar um novo elemento em determinada posição da lista 
	 * */
	public void adicionaNaPosicao(Pessoa dado, int posicao){		
		Nodo novoNodo = new Nodo(dado);
		//Se não há ainda o primeiro elemento, ou foi solicitado que o novo nodo
		//seja inserido na primeira posição, então chamamos o método para adicionar
		//no começo.
		if(primeiro == null || posicao == 0){
			adicionarNoComeco(dado);
			return; //finaliza o método.
		} else{	
			//opcao com for
			Nodo aux = primeiro;
			//vamos percorrer até posição - 1, porque temos que parar um antes.
			//se formos até a posição informada, não vamos conseguir fazer a troca
			//corretamente
            for (int i = 0; i < posicao - 1; i++) { 
                if(aux.proximo == null){ //Se o próximo é nulo, é pq estamos no último elemento
                	adicionarNoFinal(dado); //então, add no final
                	return; //e faz o método parar (caso o usuário tenha colocado um posição inexistente)
                } else {
                	aux = aux.proximo; //caso contrário, continua percorrendo, passando para o próximo.
                }
            }
            //se ao final do for, ele estiver com um elemento que possui próximo, é porque
            //ele achou a posição que quero alterar.
			if(aux.proximo != null){				
	            novoNodo.proximo = aux.proximo; //faz a alteração
	            aux.proximo = novoNodo;
			}
		}		
	}
	
	/**
	 * adicionar um novo elemento no começo da lista
	 * */
	public void adicionarNoComeco(Pessoa dado){
		//Adicionar um novo nodo no começo da lista
		Nodo novoNodo = new Nodo(dado);
		if(primeiro == null){
			primeiro = novoNodo;
		} else {
			novoNodo.proximo = primeiro;
			primeiro = novoNodo;
		}
	}
	
	/**
	 * adicionar um novo elemento no final da lista
	 *  */
	public void adicionarNoFinal(Pessoa dado){
		//cria-se um novo nodo contendo o dado do parâmetro
		Nodo novoNodo = new Nodo(dado);
		//se não tiver nenhum dado na lista, definiremos que o nosso
		//novo nodo é o primeiro.
		if(primeiro == null){
			primeiro = novoNodo;
		} else {
			//caso hajam dados na lista, precisamos encontrar o final dela.
			Nodo aux = primeiro;
			//a pesquisa deverá para quando encontrarmos o nodo que
			//NÃO possui um próximo elemento.
			while(aux.proximo != null){			
				aux = aux.proximo;			
			}	
			//então, definimos que o próximo elemento deste nodo é
			//o novo nodo que havíamos criado.
			aux.proximo = novoNodo;
		}
	}

	/**
	 *  remover a primeira ocorrência do elemento na lista, se estiver presente;
	 *  */
	public void removerPorOcorrencia(String dadoPesquisa){
		//Para este método não precisamos "reinventar a roda".
		//Para executar a ação, precisamos fazer duas coisas:
		//1-Descobrir em que posição há a ocorrência do dado que queremos remover
		//2-Mandar remover o dado da posição encontrada anteriormente. 
		
		//Já temos dois métodos que fazem isso separadamente:
		int posicao = pesquisaPosicao(dadoPesquisa);
		//Se o comando anterior retornar -1, é porque o dado não existe na lista. Qualquer coisa diferente disso
		//significa que ele foi encontrado.
		if(posicao != -1){
			removerDaPosicao(posicao); //usamos o outro método que criamos para fazer a remoção.
		}
	}
	
}
