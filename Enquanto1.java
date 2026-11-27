import java.util.Scanner;
public class Enquanto1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;
        int quantAlunos, contador = 0;
        String nomeAluno, disciplina;
        System.out.print("Informe a quantidade de alunos: ");
        quantAlunos = entrada.nextInt();
        while (contador < quantAlunos) {
            entrada.nextLine();
            System.out.print("Digite o nome do aluno: ");
            nomeAluno = entrada.nextLine();
            System.out.print("Informe uma disciplina: ");
            disciplina = entrada.nextLine();
            System.out.print("Digite as notas do aluno: ");
            nota1 = entrada.nextInt();
            nota2 = entrada.nextInt();
            nota3 = entrada.nextInt();
            nota4 = entrada.nextInt();
            media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println("Nome do aluno: " + nomeAluno);
            System.out.println("Disciplina: " + disciplina);
            System.out.println("Média: " + media);
            if (media >= 6.0) {
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno reprovado");
            }
            contador = contador + 1;
        }
    }
}

// O código irá ver quantidade de alunos, para cada aluno ele vai pedir o NOME,
// a DISCIPLINA e as QUATRO NOTAS para fazer a média, no final o algoritmo irá
// exibir os dados de cada aluno!!!!