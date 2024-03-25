import java.util.Scanner;

public class Exercicio10 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Vetor A
        int[] vetorA = new int[5];
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        // Vetor B (invertido)
        int[] vetorB = new int[5];
        for (int i = 0; i < 5; i++) {
            vetorB[i] = vetorA[4 - i];
        }

        // Exibir vetor B
        System.out.println("\nVetor B (invertido):");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + i + ": " + vetorB[i]);
        }

        scanner.close();
    }
}

