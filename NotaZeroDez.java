import java.util.Scanner;

public class NotaZeroDez {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    int notaDigitada;

    do {
      System.out.println("\nDigite uma nota entre 0 e 10:");
      notaDigitada = leitura.nextInt();

      if (notaDigitada < 0 || notaDigitada > 10) {
        System.out.println("Nota inválida! Tente novamente.");
      }
    } while (notaDigitada < 0 || notaDigitada > 10);
    System.out.println("Nota válida. Obrigado.");

    leitura.close();
  }
}