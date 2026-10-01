import java.util.Scanner;

public class UsuarioSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario;
        String senha;

        do {
            System.out.print("Digite seu nome de usuário: ");
            usuario = sc.nextLine();

            System.out.print("Digite uma senha: ");
            senha = sc.nextLine();

            if (senha.equals(usuario)) {
                System.out.println("Erro: a senha não pode ser igual ao nome de usuário! Tente novamente.\n");
            }
        } while (senha.equals(usuario));

        System.out.println("Cadastro realizado com sucesso!");

        sc.close();
    }
}