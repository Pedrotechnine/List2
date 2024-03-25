import java.util.Scanner;

public class Exercicio05 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Cria o vetor para armazenar os números
        int[] vetor = new int[5];

        // Lê os números digitados pelo usuário para preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Lê o número n
        System.out.print("Digite um número para buscar no vetor: ");
        int n = scanner.nextInt();

        // Conta a quantidade de vezes que o número n aparece no vetor
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == n) {
                contador++;
            }
        }

        // Apresenta na tela a quantidade de vezes que o número n aparece no vetor
        System.out.println("O número " + n + " aparece " + contador + " vez(es) no vetor.");

        scanner.close();
    }
}

