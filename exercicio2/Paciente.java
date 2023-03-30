package exercicio2;

public class Paciente {
	String nome;
	int idade;
	double peso;
	double altura;
	double quadril;

	public Paciente(String nome, int idade, double peso, double altura, double quadril) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.quadril = quadril;
	}

	// método para calcular e retornar a frequência máxima
	public int frequenciaMaxima() {
		return 220 - idade;
	}
	
	// método para calcular e retornar a frequência alvo
	public double[] frequenciaAlvo() {
		double[] alvo = new double[2];
		int fm = frequenciaMaxima();
		alvo[0] = fm * 0.50;
		alvo[1] = fm * 0.85;
		return alvo;
	}
	
	// método para calcular e retornar o valor do IMC
	public double calcularIMC() {
		return peso / (altura * altura);
	}
	
	// método para calcular e retornar o valor do BAI
	public double calcularBAI() {
		return quadril / (altura * Math.sqrt(altura)) - 18;
	}
	
	// método para retornar os dados 
	public String getDados() {
		String aux = "";
		double[] alvo = frequenciaAlvo();
		
		aux += "Nome: " + nome + "\n";
		aux += "Frequência máxima: " + frequenciaMaxima() + "\n";
		aux += "Frequência alvo: " + alvo[0] + " --> " + alvo[1] + "\n";
		aux += "IMC: " + String.format("%.2f", calcularIMC()) + "\n";
		aux += "BAI: " + String.format("%.2f", calcularBAI()) + "\n";
		return aux;
	}
}
