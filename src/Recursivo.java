
public class Recursivo {
	public static void main(String[] args) {
		String[] vetA = { "Ana", "Beatriz", "José" , "clodo" , "jadu" , "paulo" };
		String[] vetb = { "1", "2", "3", "8" };

		combinacoes(vetA, vetb, 0, 0);
	}

	public static String combinacoes(String[] vetorA, String[] vetorB, int a, int b) {
		if (a < vetorA.length) {
			System.out.println(vetorA[a] + "   " + vetorB[b] + "\n");
			if (b == vetorB.length - 1) {
				b = 0;
				a = a +1;
				combinacoes(vetorA, vetorB, a, b);
			} else {
				b = b+ 1;
				combinacoes(vetorA, vetorB, a, b);
			}	
		}
		return "";
	}
}
