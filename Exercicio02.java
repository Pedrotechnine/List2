import java.util.Scanner;

public class Exercicio02 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        // Cria um vetor com o tamanho especificado
        int[] vetor = new int[tamanho];

        // Lê os números digitados pelo usuário e armazena no vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Exibe o número e sua classificação (positivo, negativo ou zero)
        for (int i = 0; i < tamanho; i++) {
            int numero = vetor[i];
            String classificacao;

            if (numero > 0) {
                classificacao = "positivo";
            } else if (numero < 0) {
                classificacao = "negativo";
            } else {
                classificacao = "zero";
            }

            System.out.println("Número na posição " + i + ": " + numero + " - " + classificacao);
        }

        scanner.close();
    }
}
