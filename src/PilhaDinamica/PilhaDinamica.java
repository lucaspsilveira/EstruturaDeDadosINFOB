package PilhaDinamica;

public class PilhaDinamica implements Pilha {
	private No topo;
	@Override
	public void push(String dado) {
		No novoNo = new No(dado);
		novoNo.setAbaixo(topo);
		topo = novoNo;
	}

	@Override
	public String pop() {
		if (isEmpty())
			return null;
		No atual = topo;
		topo = topo.getAbaixo();
		return atual.getDado();
	}

	@Override
	public String top() {
		if (isEmpty()) {
			return null;
		}
		return topo.getDado();
	}

	@Override
	public int size() {
		No no = topo;
		int cont = 0;
		
		while (no != null) {
			cont++;
			no = no.getAbaixo();
		}
		return cont;
	}

	@Override
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		System.out.println("Desempilhando:"+ pop());
		if(topo != null)
			clear();
	}

	@Override
	public void mostraMilha() {
		No aux = topo;
		if (isEmpty())
			System.out.println("Vazia!");
		else 
			while (aux != null) {
				System.out.println("Elemento: "+aux.getDado());
				aux = aux.getAbaixo();
			}
		
	}
	
	
}
