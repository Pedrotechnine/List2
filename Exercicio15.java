import java.util.Scanner;

public class Exercicio15{
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Inicialização do vetor com tamanho 5
        int[] vetor = new int[5];

        // Leitura do primeiro número
        System.out.print("Digite o primeiro número: ");
        vetor[0] = scanner.nextInt();

        // Leitura dos próximos números e verificação das regras
        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o próximo número: ");
            int numero = scanner.nextInt();

            // Verifica se o número é maior que o anterior
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("Número inválido. Digite um número maior que o anterior.");
                i--; // Volta para a posição anterior do vetor para permitir nova entrada
            }
        }

        // Exibição do vetor preenchido
        System.out.println("Vetor preenchido:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}

