import java.util.ArrayList;
import java.util.Scanner;

public class Random {
	public static void main(String[] args) {
		int limite = 100;
		ArrayList<Integer> sorteados = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		boolean sair = false;
		do {
			System.out.println("Digite 1 para sortear novamente e 2 para sair:");
			int res = scan.nextInt();
			switch (res) {
			case 1: 

				while (1==1) {
					int sorteado = (int)(Math.random()*limite);
					if (sorteados.contains(new Integer(sorteado))) {
						
					}  else {
						System.out.println("O Número sorteado foi: "+ sorteado);
						sorteados.add(new Integer(sorteado));
						break;
					}
				}
				
				break;
			case 2:
				sair = true;
				break;
			}
			
			
		} while (!sair);
			System.out.println("Tchau!");
	}
}
