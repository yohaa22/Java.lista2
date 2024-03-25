import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetorOriginal = new int[tamanho];
        int[] vetorDobro = new int[tamanho];

        System.out.println("Digite os números:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetorOriginal[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        System.out.println("\nValores do segundo vetor: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Número " + (i + 1) + ": " + vetorDobro[i]);
        }

        scanner.close();
    }
}
