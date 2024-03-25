import java.util.Scanner;

public class Exercicio07 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Vetores para armazenar os elementos
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        // Lê os elementos do primeiro vetor
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        // Lê os elementos do segundo vetor
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        // Verifica se os vetores são iguais
        boolean saoIguais = true;
        for (int i = 0; i < 5; i++) {
            if (vetor1[i] != vetor2[i]) {
                saoIguais = false;
                break;
            }
        }

        // Exibe o resultado
        if (saoIguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores não são iguais.");
        }

        scanner.close();
    }
}
