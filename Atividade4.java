import java.util.Scanner;
public class Atividade4 {
	public static void main(String[] args) {
		int metros, centimetros;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a medida em metros: ");
		metros = entrada.nextInt();
		
		centimetros = metros*100;
		System.out.println("Metros convertidos em centímetros: " + centimetros + "cm");
	}
}
