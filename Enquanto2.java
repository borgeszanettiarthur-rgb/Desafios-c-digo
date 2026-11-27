import java.util.Scanner;

public class Enquanto2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double quantPessoas, consumo, media;
		int contador, quantSetores;
		String nomeSetor;

		System.out.print("Informe o número de setores: ");
		quantSetores = entrada.nextInt();

		contador = 0;

		while (contador < quantSetores) {
			entrada.nextLine(); // Limpa o "Enter" deixado pelo nextInt() ou nextDouble()
			System.out.print("Digite o nome do setor: ");
			nomeSetor = entrada.nextLine();
			System.out.print("Informe a quantidade de pessoas: ");
			quantPessoas = entrada.nextDouble();
			System.out.print("Informe o consumo de água em litros: ");
			consumo = entrada.nextDouble();
			media = consumo / quantPessoas;

			System.out.println("Nome do setor: " + nomeSetor);
			System.out.println("Quantidade de pessoas: " + quantPessoas);
			System.out.println("Consumo: " + consumo + " Litros");
			System.out.println("Consumo médio por pessoa: " + media + " Litros");

			if (media >= 50) {
				System.out.println("Consumo adequado");
			} else {
				System.out.println("Atenção: consumo elevado");
			}

			contador = contador + 1; // Incrementa o contador para o loop encerrar
		}

		entrada.close();
	}
}
