import java.util.Scanner;

public class Exercicio12 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Criar um vetor de 12 elementos
        int[] vetor = new int[12];

        // Ler os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Calcular o produto dos elementos pares positivos (desconsiderando zero)
        int produto = 1;
        for (int i = 0; i < 12; i++) {
            if (vetor[i] > 0 && vetor[i] % 2 == 0) {
                produto *= vetor[i];
            }
        }

        // Exibir o resultado
        System.out.println("O produto dos elementos pares positivos é: " + produto);

        scanner.close();
    }
}

