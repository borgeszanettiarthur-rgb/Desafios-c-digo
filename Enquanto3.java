import java.util.Scanner;
public class Enquanto3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nomeProduto, respostaUsuario;
		int quantEstoque, quantVendidos, quantRestante;
		do {
			System.out.print("Informe o nome do produto: ");
			nomeProduto = entrada.nextLine();
			System.out.print("Informe a quantidade em estoque: ");
			quantEstoque = entrada.nextInt();
			System.out.print("Informe a quantidade de produtos vendidos: ");
			quantVendidos = entrada.nextInt();
			if (quantEstoque >= quantVendidos && quantVendidos > 0) {
				quantRestante = quantEstoque - quantVendidos;
				System.out.println("=========== RESUMO DAS OPERAÇÕES ============");
				System.out.println("Produto: " + nomeProduto);
				System.out.println("Quantidade restante em estoque: " + quantRestante);
			} else {
				System.out.println("Estoque insuficiente ou quantidade inválida!");
			}
			entrada.nextLine();
			System.out.print("Deseja registrar outra venda? (S/N): ");
			respostaUsuario = entrada.nextLine();	
		} while (!respostaUsuario.equalsIgnoreCase("N"));
		System.out.print("Programa encerrado com sucesso!");
	}
}