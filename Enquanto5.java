import java.util.Scanner;
public class Enquanto5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nomeProduto;
		int quantEstoque, quantVendas, quantVendida, varControle;
		
		System.out.print("Digite o nome do produto: ");
		nomeProduto = entrada.nextLine();
		System.out.print("Digite a quantidade em estoque: ");
		quantEstoque = entrada.nextInt();
		System.out.print("Quantas vendas quer registrar?: ");
		quantVendas = entrada.nextInt();
		
		for (varControle = 1; varControle <= quantVendas; varControle = varControle + 1) {
			System.out.println("========== VENDA " + varControle + " ==========");
			System.out.print("Digite a quantidade que deseja vender: ");
			quantVendida = entrada.nextInt();
			if (quantVendida > 0 && quantEstoque >= quantVendida) {
				quantEstoque = quantEstoque - quantVendida;
				System.out.println("Produto vendido: " + nomeProduto);
				System.out.println("Estoque restante: " + quantEstoque);
			} else {
				System.out.println("Não é possível realizar a venda!");
				System.out.println("Falta de estoque!");
				System.out.println("Estoque disponível: " + quantEstoque);
			}
		}
		System.out.print("Registro de vendas realizado com sucesso!");
	}
}		