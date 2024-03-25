import java.util.Scanner;

public class Exercicio01 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);
        final int NUMERO_DE_ELEMENTOS = 5;
        double soma = 0;

        // Leitura dos números e cálculo da soma
        System.out.println("Digite " + NUMERO_DE_ELEMENTOS + " números:");
        for (int i = 0; i < NUMERO_DE_ELEMENTOS; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        // Calculando a média
        double media = soma / NUMERO_DE_ELEMENTOS;

        // Verificando os números em relação à média
        System.out.println("\nA média é: " + media);
        System.out.println("Números menores que a média:");
        for (int i = 0; i < NUMERO_DE_ELEMENTOS; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            if (numero < media) {
                System.out.println(numero);
            }
        }
        
        scanner.close();
    }
}
