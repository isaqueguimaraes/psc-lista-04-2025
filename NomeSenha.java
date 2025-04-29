import java.util.Scanner;

public class NomeSenha {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    String nome, senha;

    do {
      System.out.println("Digite seu nome de usuário:");
      nome = leitura.nextLine();

      System.out.println("\nDigite sua senha:");
      senha = leitura.nextLine();

      if (nome.equals(senha)) {
        System.out.println("Erro! A sua senha não pode ser o seu nome de usuário!");
        System.out.println("Tente novamente.\n");
      }

    } while (nome.equals(senha));
    System.out.println("Usuário e senha cadastrados com sucesso.");

    leitura.close();
  }
}