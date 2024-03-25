import java.util.Scanner;

public class Exercicio14 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Definindo o tamanho do vetor
        int tamanho = 5;
        int[] vetor = new int[tamanho];

        // Lendo os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Encontrando o índice do maior elemento do vetor
        int indiceMaior = 0;
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        // Trocando o maior elemento de posição com o último elemento
        int temp = vetor[tamanho - 1];
        vetor[tamanho - 1] = vetor[indiceMaior];
        vetor[indiceMaior] = temp;

        // Exibindo o vetor atualizado
        System.out.println("Vetor atualizado:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}

