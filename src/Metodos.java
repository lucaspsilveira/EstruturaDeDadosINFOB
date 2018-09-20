
public class Metodos {
	
	public static void bubbleSortParaInt(int [] v){     // m�todo recebe um vetor de inteiros por par�metros
        for(int i=0; i<v.length; i++){ // controla a quantidade de vezes que passa no vetor e serve para controlar o quanto dever� ser diminu�do no while abaixo
            boolean troca = false; // vari�vel boolean para controlar quando houve uma troca ou n�o ao passar pelo vetor fazendo a verifica��o de maior ou menor
            int j = 0;
            while(j<v.length -1 -i){ // la�o de repeti��o para percorrer o vetor at� a �ltima posi��o, tendo a vari�vel i para ir fixando aqueles maiores valores como �ltimos, 
            						//n�o sendo necess�rios a verifica��o deles novamente ele serve para diminuir e n�o ser preciso verifica-los
                if(v[j] > v[j+1]){ // condi��o que verifica caso o valor na posi��o atual � maior que a posi��o seguinte, caso for verdadeiro realiza as opera��es abaixo
                    int aux = v[j]; //cria uma vari�vel para armazenar temporariamente o valor da posi��o atual visto que ela ir� ser trocada
                    v[j] = v[j+1]; // torna o valor atual no valor menor, que � o pr�ximo da sua posi��o
                    v[j+1] = aux;  // faz com que o vetor na pr�xima posi��o receba o maior valor, atrav�s da vari�vel auxiliar, assim vai jogando os maiores para o fim do vetor\
                    troca = true; // marca que houve uma troca armazenanado na vari�vel troca 
                } // fim da condi��o
                j++; // incrementa o contador em + 1 para seguir a verifica��o at� o final do vetor
            } // fim do while
            if(!troca){ break; } // se n�o houuve troca, ent�o o vetor est� ordenado e para a execu��o do m�todo
        } // fim do primeiro for que percorre o vetor
    }
	
	public static void insertionSort(int[] array) // m�todo recebe um vetor de inteiros por par�metros
    {
           for (int i = 0; i < array.length; i++)  // la�o de repeti��o para percorrer o vetor at� o seu final
           {
                   int a = array[i]; // armazena na vari�vel A o valor na posi��o que est� sendo percorrida
                   for (int j = i - 1; j >= 0 && array[j] > a; j--) //realiza o la�o de repeti��o caso a vari�vel j for maior que 0 e o valor nessa posi��o seja maior que o valor na posi��o do vetor nessa vari�vel j que vai diminuindo, como se fosse verificando todos os elementos da direita pra esquerda
                   {
                           array[j + 1] = array[j]; // realiza a troca na qual o valor do vetor na posi��o j + uma posi��o a frente se torna o valor que � maior
                           array[j] = a; // recebe o valor que � menor que a posi��o do vetor na posi��o j, ordenando assim o vetor, deixando os mais baixos para a esquerda e levando os maiores para direita
                   }         // fim do 2� for              
           }            // fim do 1� for   
   } // fim do m�todo
	
	 public static void selectionSort(int[] array) {  // m�todo recebe um vetor de inteiros por par�metros
		  for (int fixo = 0; fixo < array.length - 1; fixo++) { // la�o de repeti��o para percorrer todo o vetor, a cada intera��o � definido o seu menor valor e � fizado ele ali
		    int menor = fixo; // define o menor valor com ma sua posi��o da intera��o
		   
		    for (int i = menor + 1; i < array.length; i++) { // la�o de repeti��o para verificar cada posi��o do vetor se � menor ou n�o que o valor do vetor na posi��o menor definida na intera��o
		       if (array[i] < array[menor]) { // testa se for menor que o valor na posi��o do menor definido na intera��o
		          menor = i; // define a posi��o onde realmente est� o menor valor do vetor naquela intera��o
		       } // fim da condi��o que guardou a posi��o do menor
		    }// fim do segundo for que verificou todos os elementos a partir daquele ponto definido pela intera��o
		    if (menor != fixo) { // verifica caso a posi��o do menor for diferente que aquele que foi colocado na intera��po 
		      int t = array[fixo]; // vari�vel auxiliar para armazenar o valor e n�o perde-lo durante a troca
		      array[fixo] = array[menor]; // faz com o que a posi��o definida como menor receba realmente o menor valor daquela intera��o testada
		      array[menor] = t; // faz com que o valor que n�o era o menor, trocar com a posi��o do valor que foi colocado na posi��o de menor
		    } // fim do if
		  } // fim do perimeiro for, fim da intera��o, assim � setado o menor valor e ele n�o � mais testado
		} // fim do m�todo
}
