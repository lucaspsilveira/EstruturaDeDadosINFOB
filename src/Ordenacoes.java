import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ordenacoes {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // Classe responsável pela leitura dos dados do usuário
		System.out.println("Quantos números você quer inserir?");  // pergunta a quantidade de números
		int tamanho = Integer.parseInt(bf.readLine()); // recebe o valor em string e converte para o tipo inteiro, armazenando na variável tamanho
		System.out.println("Deseja preencher eles automáticos ou não? 1 - Automático, 2 - Manualmente"); // oferece a possibilidade de preemncher os valores automaticamente
		int escolha = Integer.parseInt(bf.readLine()); //// recebe o valor em string e converte para o tipo inteiro, armazenando na variável resposta
		
		
		int[] vetorSelection = new int[tamanho];	// cria o vetor no tamanho escolhido pelo usuário
		if (escolha == 1) { // caso seja o inteiro 1 o programa preenche o vetor
			for (int i = 0; i < vetorSelection.length; i++) { // laço de repetição para percorrer o vetor
				vetorSelection[i] = (int)(Math.random() * 1000); // gera um número aleatório entre 0 e 999 para ser preenchido na posição I
			}
		} else { // caso seja diferente do inteiro 1 realiza a leitura dos dados em cada posição do vetor
			for (int i = 0; i < vetorSelection.length; i++) { // laço de repetição para percorrer o vetor
				System.out.println("Digite seu "+ (i+1) + "º número: "); // informa o usuário para inserir o número
				vetorSelection[i] = Integer.parseInt(bf.readLine()); // recebe o valor em string e converte para o tipo inteiro, armazenando na variável tamanho 
			}
		}
		
		int[] vetorBubble = vetorSelection.clone(); // clona o vetor primário para outro vetor
		int[] vetorInsertion = vetorSelection.clone(); // clona o vetor primário para outro vetor
		
		System.out.println("Vetor desordenado: "); // informa que a seguir será mostrado os números desordenados
		for	(int num : vetorSelection) { // laço de repetição para mostrar os dados do vetor desordenado
			System.out.print(num+ "; "); // mostra todos os valores concatenando-os
		}
		
		Metodos met = new Metodos(); // instancia um objeto Metodos para chamar os métodos de ordenação
		
		met.bubbleSortParaInt(vetorBubble); // chama o método para ordenar o vetor através do método bubblesort, passando o vetor por parâmetro
		System.out.println("\nVetor Ordenado pelo BubbleSort"); // Informa o tipo de método utilizado para ordenação
		for	(int num : vetorBubble) { // for para percorrer o vetor ordenado
			System.out.print(num+ "; "); // mostra todos os valores concatenando-os
		}
		met.bubbleSortParaInt(vetorSelection); // chama o método para ordenar o vetor através do método SelectionSort, passando o vetor por parâmetro
		
		System.out.println("\nVetor Ordenado pelo Selection");// Informa o tipo de método utilizado para ordenação
		for	(int num : vetorSelection) { // for para percorrer o vetor ordenado
			System.out.print(num+ "; "); // mostra todos os valores concatenando-os
		}
		met.bubbleSortParaInt(vetorInsertion); // chama o método para ordenar o vetor através do método InsertionSort, passando o vetor por parâmetro
		System.out.println("\nVetor Ordenado pelo InsertionSort"); // Informa o tipo de método utilizado para ordenação
		for	(int num : vetorInsertion) { // for para percorrer o vetor ordenado
			System.out.print(num+ "; "); // mostra todos os valores concatenando-os
		}
		
	}
}
