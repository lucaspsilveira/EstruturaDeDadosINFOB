package PilhaDinamica;

public class Main {
	public static void main(String[] args) {
		PilhaDinamica pilhinha = new PilhaDinamica();
		System.out.println("Está vazia?: "+ pilhinha.isEmpty());
		
		System.out.println("Empilhando '1'\n");
		pilhinha.push("1");
		System.out.println("Empilhando '2'\n");
		pilhinha.push("2");
		System.out.println("Empilhando '3'\n");
		pilhinha.push("3");
		
		System.out.println("\n----Pilhinha---\n");
		pilhinha.mostraMilha();
		
		System.out.println("Topo: "+ pilhinha.top());
		System.out.println("Tamanho: "+pilhinha.size());
		
		System.out.println("\n----Pilhinha---\n");
		pilhinha.mostraMilha();
		
		System.out.println("Pop: "+pilhinha.pop());
		System.out.println("Pop: "+pilhinha.pop());
		
		System.out.println("\n----Pilhinha---\n");
		pilhinha.mostraMilha();
		
		System.out.println("Empilhando '6'\n");
		pilhinha.push("6");
		
		System.out.println("\n----Pilhinha---\n");
		pilhinha.mostraMilha();
		
		System.out.println("Tamanho: "+pilhinha.size());
		System.out.println("Limpando... com clear recursivo");
		pilhinha.clear();
		
		System.out.println("\n----Pilhinha---\n");
		pilhinha.mostraMilha();
		
		
		System.out.println("Tamaho: "+pilhinha.size());
		
		System.out.println("\n----Pilhinha---\n");
		pilhinha.mostraMilha();
	}
}
