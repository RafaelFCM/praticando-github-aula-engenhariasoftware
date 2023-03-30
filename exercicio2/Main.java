package exercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		double peso, altura, quadril;
		
		System.out.print("Nome --> ");
		nome = sc.nextLine();
		System.out.print("Idade --> ");
		idade = sc.nextInt();
		System.out.print("Peso (em kgs) --> ");
		peso = sc.nextDouble();
		System.out.print("Altura (em metros) --> ");
		altura = sc.nextDouble();
		System.out.print("Quadril (em centímetros) --> ");
		quadril = sc.nextDouble();
		
		Paciente paciente = new Paciente(nome, idade, peso, altura, quadril);
		
		System.out.println(paciente.getDados());

	}
}
