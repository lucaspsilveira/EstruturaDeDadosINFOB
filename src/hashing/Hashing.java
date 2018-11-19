package hashing;

import java.math.BigInteger;

public class Hashing {

	//private ListaEncadeada [] hashing;
	private Pessoa[] pessoas;
	
	public Hashing() {
		/*hashing = new ListaEncadeada[26];
		for(int i=0; i<26; i++) {
			hashing[i] = new ListaEncadeada();
		}	*/	
		pessoas = new Pessoa[699999997];
		for(int i=0; i<699999997; i++) {
			pessoas[i] = null;
		}
	}
	
	public void addData(Pessoa p, int chave) {
		if (chave <= 699999997) {
			int indice = hashCodeCPF(p.getCpf(), chave);
			if (pessoas[indice] == null) {
				pessoas[indice] = p;
			} else {
				addData(p, chave + 1);
			}
		} else {
			System.out.println("Cheio já meu querido.");
		}
	}
	
	public void printAll() {
		for(int i=0; i<699999997; i++) {
			if (pessoas[i] != null)
				System.out.println("Posição: "+ i + pessoas[i].getNome());
			//else
				//System.out.println("Vazio na posição "+ i);
		}
	}

	public int hashCode(String dado) {
		return dado.toUpperCase().charAt(0) - 65;
	}
	
	public int hashCodeCPF(String dado, int chave) {
		double cpf = Double.parseDouble(dado.substring(0, 9));
		//System.out.println(cpf);
	    return (int)cpf % 699999997 + chave;
		//return dado.toUpperCase().charAt(0) - 65;
	}
	
	public Pessoa buscaPessoa(String dado, int chave) {
		System.out.println("Buscando "+ chave);
		double cpf = Double.parseDouble(dado.substring(0, 9));
		if (chave <= 699999997) {
			int indice = hashCodeCPF(dado, chave);
			//System.out.println(indice);
			if (pessoas[indice] == null) {
				System.out.println("Pessoa não Encontrada!");
				return null;
			} else {
				
				if (pessoas[indice].getCpf().equals(dado)) {
					System.out.println("Encontrado!\n");
					System.out.println(pessoas[indice].getCpf());
					System.out.println(pessoas[indice].getNome());
					System.out.println(pessoas[indice].getIdade());
					return pessoas[indice];
				}
					
				else
					buscaPessoa(dado, chave + 1);
			}
		} else {
			System.out.println("Pessoa não encontrada.");
			return null;
		}
		return null;
	}
	
}
