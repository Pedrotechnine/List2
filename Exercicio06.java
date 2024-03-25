import java.util.Scanner;

public class Exercicio06 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Vetor para armazenar as notas do aluno
        double[] notas = new double[5];
        
        // Vetor para armazenar os pesos correspondentes
        double[] pesos = new double[5];

        // Lê as notas do aluno
        System.out.println("Digite as 5 notas do aluno:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Lê os pesos correspondentes
        System.out.println("Digite os 5 pesos correspondentes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Peso " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
        }

        // Calcula a média ponderada
        double somaNotasPesadas = 0;
        double somaPesos = 0;
        for (int i = 0; i < 5; i++) {
            somaNotasPesadas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        double mediaPonderada = somaNotasPesadas / somaPesos;

        // Exibe a média ponderada
        System.out.println("A média ponderada do aluno é: " + mediaPonderada);

        scanner.close();
    }
}

