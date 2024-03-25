import java.util.Scanner;

public class Exercicio13 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        int[] fibonacci = new int[n];

        // Inicializando os primeiros termos da sequência de Fibonacci
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        // Calculando os próximos termos da sequência de Fibonacci
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Exibindo o vetor com os n primeiros termos da sequência de Fibonacci
        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }

        scanner.close();
    }
}
