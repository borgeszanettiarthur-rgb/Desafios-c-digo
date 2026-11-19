import java.util.Scanner;
public class AtividadeSE_5 {
	public static void main(String[] args) {
		int codigo, quantidade;
		double valor;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("1 - Boné R$50,00");
		System.out.println("2 - Calça R$80,00");
		System.out.println("3 - Tênis R$150,00");
		System.out.print("Digite o código do produto: ");
		codigo = entrada.nextInt();
		System.out.print("Digite a quantidade do produto: ");
		quantidade = entrada.nextInt();
		
		switch (codigo) {
			case 1:
				valor = 50.00 * quantidade;
				System.out.println("Boné - Quantidade: " + quantidade);
				System.out.println("Calça - Valor: " + valor);
			break;
			case 2:
				valor = 80.00 * quantidade;
				System.out.println("Calça - Quantidade: " + quantidade);
				System.out.println("Calça - Valor: " + valor);
			break;
			case 3:
				valor = 150.00 * quantidade;
				System.out.println("Tênis - Quantidade: " + quantidade);
				System.out.println("Tênis - Valor: " + valor);
			break;
			default:
				System.out.print("Produto não encontrado");
		}
	}
}