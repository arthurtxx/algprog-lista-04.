import java.util.Scanner;

public class ValidaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        while (nome.length() <= 3) {
            System.out.println("Erro: o nome deve ter mais de 3 caracteres.");
            System.out.print("Nome: ");
            nome = sc.nextLine();
        }

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Erro: a idade deve estar entre 0 e 150.");
            System.out.print("Idade: ");
            idade = sc.nextInt();
        }

        System.out.print("Salário: ");
        double salario = sc.nextDouble();
        while (salario <= 0) {
            System.out.println("Erro: o salário deve ser maior que zero.");
            System.out.print("Salário: ");
            salario = sc.nextDouble();
        }
        sc.nextLine(); 
        System.out.print("Sexo (f/m): ");
        String sexo = sc.nextLine().toLowerCase();
        while (!sexo.equals("f") && !sexo.equals("m")) {
            System.out.println("Erro: digite apenas 'f' ou 'm'.");
            System.out.print("Sexo (f/m): ");
            sexo = sc.nextLine().toLowerCase();
        }

        System.out.print("Estado civil (s/c/v/d): ");
        String estadoCivil = sc.nextLine().toLowerCase();
        while (!estadoCivil.equals("s") && !estadoCivil.equals("c")
                && !estadoCivil.equals("v") && !estadoCivil.equals("d")) {
            System.out.println("Erro: digite 's', 'c', 'v' ou 'd'.");
            System.out.print("Estado civil (s/c/v/d): ");
            estadoCivil = sc.nextLine().toLowerCase();
        }

        System.out.println("\nDados cadastrados com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);

        sc.close();
    }
} 
