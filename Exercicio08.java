import java.util.Arrays;

public class Exercicio08 {
    public static void Executar() {
        // Vetores A e B com 5 elementos cada
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {6, 7, 8, 9, 10};

        // Vetor C para armazenar a concatenação de A e B
        int[] C = new int[A.length + B.length];

        // Copia os elementos de A para o vetor C
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }

        // Copia os elementos de B para o vetor C, começando após os elementos de A
        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }

        // Exibe o vetor C
        System.out.println("Vetor C (concatenação de A e B): " + Arrays.toString(C));
    }
}
