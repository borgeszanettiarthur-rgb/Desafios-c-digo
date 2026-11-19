import java.util.Scanner;
public class AtividadeSE_6 {
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
			switch (disciplina) {
					case 1:
						System.out.print("História");
					break;
					default:
						System.out.print("Disciplina não disponível no período da tarde");
				}
			break;
			default:
				System.out.print("Turno inválido");
		}
	}
}