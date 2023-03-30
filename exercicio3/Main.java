package exercicio3;

public class Main {
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.id = 123;
		f.nome = "Selmini";
		f.salarioBruto = 1000;
		
		System.out.println(f.getDados());
		System.out.println();
		
		System.out.println(f.aumentarSalario(20));
		System.out.println();
		
		System.out.println(f.getDados());
		System.out.println();
		
		System.out.println(f.calcularSalarioLiquido(15));
		
		
	}
}
