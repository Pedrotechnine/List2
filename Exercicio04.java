import java.util.Scanner;

public class Exercicio04 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Cria o vetor e a variável n
        int[] vetor = new int[5];
        int n;

        // Lê os números digitados pelo usuário para preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Lê o número n
        System.out.print("Digite o número n: ");
        n = scanner.nextInt();

        // Verifica e imprime os índices dos elementos inferiores a n
        System.out.println("Índices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < n) {
                System.out.println("Índice: " + i);
            }
        }

        scanner.close();
    }
}
