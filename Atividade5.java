import java.util.Scanner;
public class Atividade5 {
	public static void main(String[] args) {
		int idade, dias;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a idade em anos: ");
		idade = entrada.nextInt();
		
		dias = idade*365;
		System.out.println("Idade convertida em dias do ano: " + dias);
	}
}
