import java.util.Scanner;
public class Atividade1 {
	public static void main(String[] args) {
		int numero;
		int ant;
		int suc;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		numero = entrada.nextInt();
		
		suc = numero + 1;
		ant = numero - 1;
		
		System.out.println("Antecessor: " + ant);
		System.out.print("Sucessor: " + suc);
	}
}