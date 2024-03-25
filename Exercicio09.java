import java.util.Scanner;

public class Exercicio09{
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Vetor A
        int[] vetorA = new int[5];
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        // Vetor B
        int[] vetorB = new int[5];
        System.out.println("\nDigite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetorB[i] = scanner.nextInt();
        }

        // Vetor C
        int[] vetorC = new int[5];
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                // Elemento par: copiar elemento de A
                vetorC[i] = vetorA[i];
            } else {
                // Elemento ímpar: copiar elemento de B
                vetorC[i] = vetorB[i];
            }
        }

        // Exibir vetor C
        System.out.println("\nVetor C gerado:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + i + ": " + vetorC[i]);
        }

        scanner.close();
    }
}
