import java.util.Scanner;
public class Atividade3 {
	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = entrada.nextInt();
		System.out.print("Digite a segunda nota: ");
		nota2 = entrada.nextInt();
		System.out.print("Digite a terceira nota: ");
		nota3 = entrada.nextInt();
		
		media = (nota1+nota2+nota3)/3;
		System.out.println("Média aritmética: " + media);
		
		
	}
}
