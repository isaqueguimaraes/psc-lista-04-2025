import java.util.Scanner;

public class Inteiros {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.print("Digite o 1° número inteiro: ");
    int numeroUm = leitura.nextInt();

    System.out.print("Digite o 2° número inteiro: ");
    int numeroDois = leitura.nextInt();

    for (int i = numeroUm + 1; i < numeroDois; i++) {
      System.out.println(i);
    }

    leitura.close();
  }
}