package model;

public class Cliente {
	
	public String cpf;
	public String nome;
	public int idade;
	public double limiteCredito;

	@Override
	public String toString() {
		return cpf + ";" + nome + ";" + idade + ";" + limiteCredito;
	}
}