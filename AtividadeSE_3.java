import java.util.Scanner;
public class AtividadeSE_3 {
	public static void main(String[] args) {
		int idade;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = entrada.nextInt();
		
		if (idade <= 12) {
			System.out.print("Atendimento infantil");
		} else if (idade >= 60) {
			System.out.print("Atendimento preferencial");
		} else {
			System.out.print("Atendimento adulto");
		}
	}
}
