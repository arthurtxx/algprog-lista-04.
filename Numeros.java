import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número 1: ");
        double maior = sc.nextDouble();

        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = sc.nextDouble();

            if (numero > maior) {
                maior = numero;
            }
        }

        
        System.out.println("O maior número é: " + maior);

        sc.close();
    }
}