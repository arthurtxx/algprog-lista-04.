import java.util.Scanner;

public class Populaçao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repetir;

        do {
            System.out.print("População do país A: ");
            double paisA = sc.nextDouble();
            while (paisA <= 0) {
                System.out.println("Erro: a população deve ser maior que zero.");
                System.out.print("População do país A: ");
                paisA = sc.nextDouble();
            }

            System.out.print("Taxa de crescimento de A (% ao ano): ");
            double taxaA = sc.nextDouble();
            while (taxaA < 0) {
                System.out.println("Erro: a taxa não pode ser negativa.");
                System.out.print("Taxa de crescimento de A (% ao ano): ");
                taxaA = sc.nextDouble();
            }

            System.out.print("População do país B: ");
            double paisB = sc.nextDouble();
            while (paisB <= 0) {
                System.out.println("Erro: a população deve ser maior que zero.");
                System.out.print("População do país B: ");
                paisB = sc.nextDouble();
            }

            System.out.print("Taxa de crescimento de B (% ao ano): ");
            double taxaB = sc.nextDouble();
            while (taxaB < 0) {
                System.out.println("Erro: a taxa não pode ser negativa.");
                System.out.print("Taxa de crescimento de B (% ao ano): ");
                taxaB = sc.nextDouble();
            }

            if (paisA < paisB && taxaA <= taxaB) {
                System.out.println("A nunca alcançará B: a taxa de A precisa ser maior que a de B.");
            } else {
                int anos = 0;
                while (paisA < paisB) {
                    paisA = paisA * (1 + taxaA / 100);
                    paisB = paisB * (1 + taxaB / 100);
                    anos++;
                }
                System.out.println("Anos necessários: " + anos);
            }

            System.out.print("Deseja repetir? (s/n): ");
            repetir = sc.next().toLowerCase();
            while (!repetir.equals("s") && !repetir.equals("n")) {
                System.out.println("Erro: digite 's' ou 'n'.");
                System.out.print("Deseja repetir? (s/n): ");
                repetir = sc.next().toLowerCase();
            }
        } while (repetir.equals("s"));

        sc.close();
    }
}