import java.util.Scanner;
public class Enquanto4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nomeAluno, disciplina, respostaUsuario;
		double nota1, nota2, nota3, nota4, media;
		do {
			System.out.print("Informe o nome do aluno: ");
			nomeAluno = entrada.nextLine();
			System.out.print("Informe a disciplina: ");
			disciplina = entrada.nextLine();
			System.out.print("Informe as 4 notas do aluno: ");
			nota1 = entrada.nextInt();
			nota2 = entrada.nextInt();
			nota3 = entrada.nextInt();
			nota4 = entrada.nextInt();
			media = (nota1 + nota2 + nota3 + nota4)/4;
			System.out.println("=========== RESUMO DAS OPERAÇÕES ============");
			System.out.println("Aluno: " + nomeAluno);
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Media: " + media);
			if (media > 6) {
				System.out.println("Aluno aprovado");
			} else {
				System.out.println("Aluno reprovado");
			}
			respostaUsuario = entrada.nextLine();
			System.out.print("Deseja cadastrar outro aluno? (S/N): ");
			
		} while (respostaUsuario != "N");
		System.out.print("Programa encerrado com sucesso!");
	}
}