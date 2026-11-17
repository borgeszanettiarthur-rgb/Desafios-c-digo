import java.util.Scanner;
public class Atividade6 {
	public static void main(String[] args) {
		String nome;
		int idade;
		boolean conta;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome de usuário: ");
		nome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		idade = entrada.nextInt();
		
		System.out.print("Digite 'true' se a conta está ativa, ou 'false' se está desativada: ");
		conta = entrada.nextBoolean();
		
		System.out.println("Nome de usuário: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Conta Ativada: " + conta);
	}
}
