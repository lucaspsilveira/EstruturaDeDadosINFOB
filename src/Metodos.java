
public class Metodos {
	
	public static void bubbleSortParaInt(int [] v){     // método recebe um vetor de inteiros por parâmetros
        for(int i=0; i<v.length; i++){ // controla a quantidade de vezes que passa no vetor e serve para controlar o quanto deverá ser diminuído no while abaixo
            boolean troca = false; // variável boolean para controlar quando houve uma troca ou não ao passar pelo vetor fazendo a verificação de maior ou menor
            int j = 0;
            while(j<v.length -1 -i){ // laço de repetição para percorrer o vetor até a última posição, tendo a variável i para ir fixando aqueles maiores valores como últimos, 
            						//não sendo necessários a verificação deles novamente ele serve para diminuir e não ser preciso verifica-los
                if(v[j] > v[j+1]){ // condição que verifica caso o valor na posição atual é maior que a posição seguinte, caso for verdadeiro realiza as operações abaixo
                    int aux = v[j]; //cria uma variável para armazenar temporariamente o valor da posição atual visto que ela irá ser trocada
                    v[j] = v[j+1]; // torna o valor atual no valor menor, que é o próximo da sua posição
                    v[j+1] = aux;  // faz com que o vetor na próxima posição receba o maior valor, através da variável auxiliar, assim vai jogando os maiores para o fim do vetor\
                    troca = true; // marca que houve uma troca armazenanado na variável troca 
                } // fim da condição
                j++; // incrementa o contador em + 1 para seguir a verificação até o final do vetor
            } // fim do while
            if(!troca){ break; } // se não houuve troca, então o vetor está ordenado e para a execução do método
        } // fim do primeiro for que percorre o vetor
    }
	
	public static void insertionSort(int[] array) // método recebe um vetor de inteiros por parâmetros
    {
           for (int i = 0; i < array.length; i++)  // laço de repetição para percorrer o vetor até o seu final
           {
                   int a = array[i]; // armazena na variável A o valor na posição que está sendo percorrida
                   for (int j = i - 1; j >= 0 && array[j] > a; j--) //realiza o laço de repetição caso a variável j for maior que 0 e o valor nessa posição seja maior que o valor na posição do vetor nessa variável j que vai diminuindo, como se fosse verificando todos os elementos da direita pra esquerda
                   {
                           array[j + 1] = array[j]; // realiza a troca na qual o valor do vetor na posição j + uma posição a frente se torna o valor que é maior
                           array[j] = a; // recebe o valor que é menor que a posição do vetor na posição j, ordenando assim o vetor, deixando os mais baixos para a esquerda e levando os maiores para direita
                   }         // fim do 2º for              
           }            // fim do 1º for   
   } // fim do método
	
	 public static void selectionSort(int[] array) {  // método recebe um vetor de inteiros por parâmetros
		  for (int fixo = 0; fixo < array.length - 1; fixo++) { // laço de repetição para percorrer todo o vetor, a cada interação é definido o seu menor valor e é fizado ele ali
		    int menor = fixo; // define o menor valor com ma sua posição da interação
		   
		    for (int i = menor + 1; i < array.length; i++) { // laço de repetição para verificar cada posição do vetor se é menor ou não que o valor do vetor na posição menor definida na interação
		       if (array[i] < array[menor]) { // testa se for menor que o valor na posição do menor definido na interação
		          menor = i; // define a posição onde realmente está o menor valor do vetor naquela interação
		       } // fim da condição que guardou a posição do menor
		    }// fim do segundo for que verificou todos os elementos a partir daquele ponto definido pela interação
		    if (menor != fixo) { // verifica caso a posição do menor for diferente que aquele que foi colocado na interaçãpo 
		      int t = array[fixo]; // variável auxiliar para armazenar o valor e não perde-lo durante a troca
		      array[fixo] = array[menor]; // faz com o que a posição definida como menor receba realmente o menor valor daquela interação testada
		      array[menor] = t; // faz com que o valor que não era o menor, trocar com a posição do valor que foi colocado na posição de menor
		    } // fim do if
		  } // fim do perimeiro for, fim da interação, assim é setado o menor valor e ele não é mais testado
		} // fim do método
}
