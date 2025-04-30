import java.util.Scanner;

public class NumMaior {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    int numeroDigitado, maior = 0;

    for (int i = 1; i <= 5; i++) {
      System.out.print("Digite o " + i + "° número: ");
      numeroDigitado = leitura.nextInt();

      if (i == 1) {
        maior = numeroDigitado;
      }

      if (numeroDigitado > maior) {
        maior = numeroDigitado;
      }
    }

    System.out.println("O maior número digitado foi: " + maior);

    leitura.close();
  }
}