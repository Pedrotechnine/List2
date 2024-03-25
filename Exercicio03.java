import java.util.Scanner;

public class Exercicio03{
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        // Cria os vetores
        int[] vetorOriginal = new int[tamanho];
        int[] vetorDobro = new int[tamanho];

        // Lê os números digitados pelo usuário e armazena no vetor original
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            vetorOriginal[i] = scanner.nextInt();
        }

        // Calcula o dobro de cada número do vetor original e armazena no vetor dobro
        for (int i = 0; i < tamanho; i++) {
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        // Apresenta os valores do vetor dobro
        System.out.println("Valores do vetor dobro:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Posição " + i + ": " + vetorDobro[i]);
        }

        scanner.close();
    }
}
