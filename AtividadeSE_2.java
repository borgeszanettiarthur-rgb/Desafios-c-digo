import java.util.Scanner;
public class AtividadeSE_2 {
	public static void main(String[] args) {
		double nota;
		int frequencia;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua nota: ");
		nota = entrada.nextInt();
		System.out.print("Digite sua frequencia: ");
		frequencia = entrada.nextInt();
		
		if (nota >= 7.0 && frequencia >= 75) {
			System.out.print("Aluno Aprovado");
		} else {
			System.out.print("Aluno Reprovado");
		}
	}
}
