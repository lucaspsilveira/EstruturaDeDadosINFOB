import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ordenacoes {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // Classe respons�vel pela leitura dos dados do usu�rio
		System.out.println("Quantos n�meros voc� quer inserir?");  // pergunta a quantidade de n�meros
		int tamanho = Integer.parseInt(bf.readLine()); // recebe o valor em string e converte para o tipo inteiro, armazenando na vari�vel tamanho
		System.out.println("Deseja preencher eles autom�ticos ou n�o? 1 - Autom�tico, 2 - Manualmente"); // oferece a possibilidade de preemncher os valores automaticamente
		int escolha = Integer.parseInt(bf.readLine()); //// recebe o valor em string e converte para o tipo inteiro, armazenando na vari�vel resposta
		
		
		int[] vetorSelection = new int[tamanho];	// cria o vetor no tamanho escolhido pelo usu�rio
		if (escolha == 1) { // caso seja o inteiro 1 o programa preenche o vetor
			for (int i = 0; i < vetorSelection.length; i++) { // la�o de repeti��o para percorrer o vetor
				vetorSelection[i] = (int)(Math.random() * 1000); // gera um n�mero aleat�rio entre 0 e 999 para ser preenchido na posi��o I
			}
		} else { // caso seja diferente do inteiro 1 realiza a leitura dos dados em cada posi��o do vetor
			for (int i = 0; i < vetorSelection.length; i++) { // la�o de repeti��o para percorrer o vetor
				System.out.println("Digite seu "+ (i+1) + "� n�mero: "); // informa o usu�rio para inserir o n�mero
				vetorSelection[i] = Integer.parseInt(bf.readLine()); // recebe o valor em string e converte para o tipo inteiro, armazenando na vari�vel tamanho 
			}
		}
		
		int[] vetorBubble = vetorSelection.clone(); // clona o vetor prim�rio para outro vetor
		int[] vetorInsertion = vetorSelection.clone(); // clona o vetor prim�rio para outro vetor
		
		System.out.println("Vetor desordenado: "); // informa que a seguir ser� mostrado os n�meros desordenados
		for	(int num : vetorSelection) { // la�o de repeti��o para mostrar os dados do vetor desordenado
			System.out.print(num+ "; "); // mostra todos os valores concatenando-os
		}
		
		Metodos met = new Metodos(); // instancia um objeto Metodos para chamar os m�todos de ordena��o
		
		met.bubbleSortParaInt(vetorBubble); // chama o m�todo para ordenar o vetor atrav�s do m�todo bubblesort, passando o vetor por par�metro
		System.out.println("\nVetor Ordenado pelo BubbleSort"); // Informa o tipo de m�todo utilizado para ordena��o
		for	(int num : vetorBubble) { // for para percorrer o vetor ordenado
			System.out.print(num+ "; "); // mostra todos os valores concatenando-os
		}
		met.bubbleSortParaInt(vetorSelection); // chama o m�todo para ordenar o vetor atrav�s do m�todo SelectionSort, passando o vetor por par�metro
		
		System.out.println("\nVetor Ordenado pelo Selection");// Informa o tipo de m�todo utilizado para ordena��o
		for	(int num : vetorSelection) { // for para percorrer o vetor ordenado
			System.out.print(num+ "; "); // mostra todos os valores concatenando-os
		}
		met.bubbleSortParaInt(vetorInsertion); // chama o m�todo para ordenar o vetor atrav�s do m�todo InsertionSort, passando o vetor por par�metro
		System.out.println("\nVetor Ordenado pelo InsertionSort"); // Informa o tipo de m�todo utilizado para ordena��o
		for	(int num : vetorInsertion) { // for para percorrer o vetor ordenado
			System.out.print(num+ "; "); // mostra todos os valores concatenando-os
		}
		
	}
}
