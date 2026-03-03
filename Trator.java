package main.java;

public class Trator extends Carro {
	String funcao;
	String motor;

	public Trator(String marca, String cor, int ano, String funcao, String motor) {
		super(marca, cor, ano);
		this.funcao = funcao;
		this.motor = motor;
		
		
	}
	@Override
	public String buzina() {
		return "bi bi bi bi bi";
	}

}


