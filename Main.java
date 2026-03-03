package main.java;

public class Main {

	public static void main(String[] args) {
		System.out.println("Meu nome é Nathaly");

		
		Carro carro1 = new Carro("Fusca", "verde", 1980);
		carro1.setMarca("audi");
		System.out.println("o nome do carro é " + carro1.getMarca());
		
		Trator trator = new Trator("John Deere", "amarelo", 1980, "arar", "diesel");
		System.out.println("A marca do trator é " + trator.getMarca());
		trator.buzina();
		System.out.println(trator.buzina());
		
		System.out.println(carro1.buzina());
		
		Carro car1 = new Carro("Ferrari", "Vermelho", 1963);
		System.out.println(car1.getMarca());
		System.out.println(car1.getCor());
		System.out.println(car1.getAno());

	}

}
