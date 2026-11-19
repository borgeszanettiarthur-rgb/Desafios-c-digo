import java.util.Scanner;
public class AtividadeSE_5 {
	public static void main(String[] args) {
		int turno, disciplina;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro para selecionar um turno: ");
		turno = entrada.nextInt();
		System.out.print("Digite um valor inteiro para selecionar uma disciplina: ");
		disciplina = entrada.nextInt();
		
		switch (turno) {
			case 1:
				switch (disciplina) {
					case 1:
						System.out.print("Matemática");
					break;
					case 2:
						System.out.print("Português");
					break;
					default:
						System.out.print("Disciplina não disponível no período da manhã");
				}
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