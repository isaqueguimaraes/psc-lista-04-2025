import java.util.Scanner;

public class SomaMedia {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.print("Digite o 1° número: ");
    int numeroUm = leitura.nextInt();

    System.out.print("Digite o 2° número: ");
    int numeroDois = leitura.nextInt();

    System.out.print("Digite o 3° número: ");
    int numeroTres = leitura.nextInt();

    System.out.print("Digite o 4° número: ");
    int numeroQuatro = leitura.nextInt();

    System.out.print("Digite o 5° número: ");
    int numeroCinco = leitura.nextInt();

    int soma = numeroUm + numeroDois + numeroTres + numeroQuatro + numeroCinco;
    int media = (numeroUm + numeroDois + numeroTres + numeroQuatro + numeroCinco) / 5;

    System.out.println("A soma dos número é: " + soma);
    System.out.println("E a média dos números é: " + media);

    leitura.close();
  }
}
