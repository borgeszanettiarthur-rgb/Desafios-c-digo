import java.util.Scanner;
public class AtividadeSE_1 {
	public static void main(String[] args) {
		int idade;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = entrada.nextInt();
		if (idade <= 12 || idade >= 65) {
			System.out.print("Entrada Gratuita");
		} else {
			System.out.print("Entrada Paga");
		}
	}
}
