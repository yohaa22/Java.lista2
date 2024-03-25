import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        int[] numeros = new int[5];

     
        System.out.println("Digite 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

  
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        int media = soma / numeros.length;

        System.out.println("a media é: " + media);

       
        System.out.println("\nValores menores que a média:");
        for (int numero : numeros) {
            if (numero < media) {
                System.out.println(numero);
            }
        }

        System.out.println("\nValores iguais à média:");
        for (int numero : numeros) {
            if (numero == media) {
                System.out.println(numero);
            }
        }

        System.out.println("\nValores superiores à média:");
        for (int numero : numeros) {
            if (numero > media) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}
