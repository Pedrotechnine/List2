import java.util.Scanner;

public class Exercicio11 {
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
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetorB[i] = scanner.nextInt();
        }

        // Calcular o produto escalar
        int produtoEscalar = 0;
        for (int i = 0; i < 5; i++) {
            produtoEscalar += vetorA[i] * vetorB[i];
        }

        // Exibir o resultado
        System.out.println("\nProduto Escalar: " + produtoEscalar);

        scanner.close();
    }
}

