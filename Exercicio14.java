import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int maxElement = vetor[0];
        int maxIndex = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maxElement) {
                maxElement = vetor[i];
                maxIndex = i;
            }
        }

        int temp = vetor[vetor.length - 1];
        vetor[vetor.length - 1] = vetor[maxIndex];
        vetor[maxIndex] = temp;

        System.out.println("\nVetor atualizado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
