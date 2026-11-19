import java.util.Scanner;
public class AtividadeSE_4 {
	public static void main(String[] args) {
		double nota;
		int frequencia;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua nota final: ");
		nota = entrada.nextInt();
		System.out.print("Digite seu percentual de frequência do aluno: ");
		frequencia = entrada.nextInt();
		
		if (nota < 0 || nota > 10) {
			System.out.print("Nota inválida");
		} else if (nota >= 6 && frequencia >= 75) {
			if (nota >= 9 && frequencia >= 90) {
				System.out.print("Aluno destacado");
			} else {
				System.out.print("Aluno aprovado");
			}
		} else if (frequencia >= 75) {
			System.out.print("Aluno em reavaliação");
		} else {
			System.out.print("Aluno reprovado por frequência");
		}
	}
}