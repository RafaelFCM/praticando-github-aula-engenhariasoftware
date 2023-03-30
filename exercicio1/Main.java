package exercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		int rm;
		double nota1, nota2;
		
		// entrada de dados para o primeiro aluno
		System.out.print("Nome: ");
		nome = scanner.nextLine();
		System.out.print("RM: ");
		rm = scanner.nextInt();
		System.out.print("Nota 1: ");
		nota1 = scanner.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = scanner.nextDouble();
		Aluno aluno1 = new Aluno(rm, nome, nota1, nota2);
		
		// entrada de dados para o segundo aluno
		System.out.println();
		scanner.nextLine(); // tira o enter que sobrou da última leitura numérica
		System.out.print("Nome: ");
		nome = scanner.nextLine();
		System.out.print("RM: ");
		rm = scanner.nextInt();
		System.out.print("Nota 1: ");
		nota1 = scanner.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = scanner.nextDouble();
		Aluno aluno2 = new Aluno(rm, nome, nota1, nota2);
		
		// impressão dos dados
		System.out.println("Aluno: " + aluno1.nome);
		System.out.println("Média: " + aluno1.calcularMedia());
		System.out.println("Situação: " + aluno1.verificarSituacao());
		
		System.out.println();
		System.out.println("Aluno: " + aluno2.nome);
		System.out.println("Média: " + aluno2.calcularMedia());
		System.out.println("Situação: " + aluno2.verificarSituacao());

	}
}
