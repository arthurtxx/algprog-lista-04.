import java.util.Scanner;

public class Mensagem0a10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma nota de 0 a 10: ");
        double nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Erro: número inválido! Digite uma nota entre 0 e 10.");
        } else {
            System.out.println("Nota válida: " + nota);
        }

        sc.close();
    }
}