import java.util.Scanner;

public class Informações {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    String nome;
    int idade;
    double salario;
    char sexo, estadoCivil;

    do {
      System.out.println("Digite seu nome:");
      nome = leitura.nextLine();

      if (nome.length() <= 3) {
        System.out.println("Nome inválido! Seu nome precisa ter mais que 3 caracteres.\n");
      }
    } while (nome.length() <= 3);
    System.out.println("Nome cadastrado com sucesso.\n");

    do {
      System.out.println("Digite sua idade:");
      idade = leitura.nextInt();

      if (idade < 0 || idade > 150) {
        System.out.println("Idade inválida! Sua idade precisa ser entre 0 a 150 anos.\n");
      }

    } while (idade < 0 || idade > 150);
    System.out.println("Idade cadastrada com sucesso.\n");

    do {
      System.out.println("Informe o seu salário:");
      System.out.print("R$ ");
      salario = leitura.nextDouble();

      if (salario <= 0) {
        System.out.println("Valor inválido! Seu salário precisa ser maior que R$0,00.\n");
      }
    } while (salario <= 0);
    System.out.println("Salário cadastrado com sucesso.\n");

    do {
      System.out.println("Informe o seu sexo (Digite 'f' para o sexo FEMININO ou 'm' para o sexo MASCULINO)");
      sexo = leitura.next().charAt(0);

      if (sexo != 'f' && sexo != 'm') {
        System.out.println("Opção inválida! Você precisa digitar F ou M.\n");
      }
    } while (sexo != 'f' && sexo != 'm');
    System.out.println("Sexo cadastrado com sucesso.\n");

    do {
      System.out.println(
          "Informe o seu Estado Civil (Digite 's' para SOLTEIRO, 'c' para CASADO, 'v' para VIÚVO ou 'd' para DIVORCIADO)");
      estadoCivil = leitura.next().charAt(0);

      if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
        System.out.println("Opção inválida! Você precisa digitar uma das opções informadas.\n");
      }
    } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
    System.out.println("Estado Civil cadastrado com sucesso.\n");

    System.out.println("Cadastro completo. Obrigado!");

    leitura.close();
  }
}