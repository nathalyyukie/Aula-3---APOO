package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("Meu nome é Nathaly");
		// TODO Auto-generated method stub
		
		Carro carro1 = new Carro("Fusca", "verde", 1980);
		carro1.setMarca("audi");
		System.out.println("o nome do carro é " + carro1.getMarca());
		
		Trator trator = new Trator("John Deere", "amarelo", 1980);
		System.out.println("A marca do trator é " + trator.getMarca());
		
		System.out.println(carro1.buzina());

	}

}
