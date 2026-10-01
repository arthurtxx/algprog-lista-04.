import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o numero 1: ");
    double maior = sc.nextDouble();

    for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = sc.nextDouble();
    }

    double soma = maior + numero;

    System.out.println("A soma dos numeros é: " + soma);

    sc.close();
    }
}

