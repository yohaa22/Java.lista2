import java.util.Scanner;


public class Exercicio05 {
    



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite um número n: ");
        int n = scanner.nextInt();

        int quantidade = 0;
        for (int numero : numeros) {
            if (numero == n) {
                quantidade++;
            }
        }

        System.out.println("\nO número " + n + " aparece " + quantidade + " vezes no vetor.");

        scanner.close();
    }
}


