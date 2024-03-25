import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[12];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        
        int produto = 1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0 && vetor[i] > 0) { 
                produto *= vetor[i];
            }
        }

        if (produto != 1) {
            System.out.println("O produto dos elementos pares positivos é: " + produto);
        } else {
            System.out.println("Não há elementos pares positivos no vetor.");
        }

        scanner.close();
    }
}
