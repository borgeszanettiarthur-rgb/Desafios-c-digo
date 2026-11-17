import java.util.Scanner;
public class Atividade2 {
	public static void main(String[] args) {
		int numero1, numero2;
		int soma, subtracao, divisao, multiplicacao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		
		soma = numero1 + numero2;
		System.out.println("Soma entre eles: " + soma);
		
		subtracao = numero1 - numero2;
		System.out.println("Subtração entre eles: " + subtracao);
		
		divisao = numero1 / numero2;
		System.out.println("Divisão entre eles: " + divisao);
		
		multiplicacao = numero1 * numero2;
		System.out.println("Multiplicação entre eles: " + multiplicacao);
		
	}
}
