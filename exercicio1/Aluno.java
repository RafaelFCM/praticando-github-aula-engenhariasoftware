package exercicio1;

public class Aluno {
	// variáveis de instância
	int rm;
	String nome;
	double nota1;
	double nota2;
	
	// construtor
	public Aluno(int rm, String nome, double nota1, double nota2) {
		this.rm = rm;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	// método para calcular e retornar a média
	public double calcularMedia() {
		return (nota1 + nota2) / 2;
	}
	
	// método para retornar a situação
	public String verificarSituacao() {
		double media = calcularMedia();
		if(media >= 6) {
			return "APROVADO";
		}
		return "REPROVADO";
	}
	
}
