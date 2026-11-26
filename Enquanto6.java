import java.util.Scanner;
public class Enquanto6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nomeLivro;
		int quantExemplares, quantEmprestimos, quantSolicitada, varCn;
		
		System.out.print("Digite o nome do livro: ");
		nomeLivro = entrada.nextLine();
		System.out.print("Digite a quantidade de exemplares a registrar: ");
		quantExemplares = entrada.nextInt();
		System.out.print("Quantos empréstimos quer registrar?: ");
		quantEmprestimos = entrada.nextInt();
		
		for (varCn = 1; varCn <= quantEmprestimos; varCn = varCn + 1) {
			System.out.println("========= Empréstimo " + varCn + " ==========");
			System.out.print("Quantos exemplares você quer?: ");
			quantSolicitada = entrada.nextInt();
			if (quantSolicitada > 0 && quantExemplares >= quantSolicitada) {
				quantExemplares = quantExemplares - quantSolicitada;
				System.out.println("Livro emprestado: " + nomeLivro);
				System.out.println("Quantidade de exemplares restantes: " + quantExemplares);
			} else {
				System.out.println("Não é possível realizar o empréstimo!");
				System.out.println("Falta de exemplares");
				System.out.println("Exemplares disponível: " + quantExemplares);
			}
		}
		System.out.println("Registro de empréstimos finalizado com sucesso!");
		System.out.println("Total de exemplares restantes: " + quantExemplares);
	}
}		