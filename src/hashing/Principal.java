package hashing;


public class Principal {
	public static void main(String [] args) {

		
		Hashing hash = new Hashing();
		
		hash.addData(new Pessoa("45654646564","Lucas", 54), 0);
		hash.addData(new Pessoa("42677420347","Julio", 20), 0);
		hash.addData(new Pessoa("42677420389","Julio 2", 20), 0);
		hash.addData(new Pessoa("03540548005","Ana Maria", 19), 0);
		hash.addData(new Pessoa("15144151515","Cristina", 57), 0);
		hash.addData(new Pessoa("97479394797","José da sila", 57), 0);
		hash.addData(new Pessoa("97479394798","José da sila 2", 57), 0);
		hash.addData(new Pessoa("97479394718","José da sila 3", 57), 0);
		hash.addData(new Pessoa("45654646569","Lucas 2", 54), 0);
		


		
		
		hash.printAll();
		
		hash.buscaPessoa("45654646564", 0);
		hash.buscaPessoa("03540548005", 0);
		hash.buscaPessoa("45654646569", 0);
		hash.buscaPessoa("97479394798", 0);
		hash.buscaPessoa("97479394718", 0);
		
		/*System.out.println(hash.hashCodeCPF("03540534008"));
		System.out.println(hash.hashCodeCPF("42672520097"));
		System.out.println(hash.hashCodeCPF("34510994949"));
		System.out.println(hash.hashCodeCPF("03540548050"));*/

	}
}
