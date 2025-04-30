import java.util.Scanner;

public class PopulaçãoPt2 {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    String repetir;

    do {
      int paisA, paisB;
      double taxaPaisA, taxaPaisB;

      do {
        System.out.print("Informe a população do país A: ");
        paisA = leitura.nextInt();

        if (paisA <= 0) {
          System.out.println("Valor inválido! A população deve ser maior que 0.");
        }
      } while (paisA <= 0);

      do {
        System.out.print("Informe a população do país B: ");
        paisB = leitura.nextInt();

        if (paisB <= 0) {
          System.out.println("Valor inválido! A população deve ser maior que 0.");
        }
      } while (paisB <= 0);

      do {
        System.out.print("\nInforme a taxa anual de crescimento do país A: % ");
        taxaPaisA = leitura.nextDouble();

        if (taxaPaisA <= 0) {
          System.out.println("Valor inválido! A taxa anual de crescimento precisa ser maior que 0.");
        }
      } while (taxaPaisA <= 0);

      do {
        System.out.print("Informe a taxa anual de crescimento do país B: %");
        taxaPaisB = leitura.nextDouble();

        if (taxaPaisB <= 0) {
          System.out.println("Valor inválido! A taxa anual de crescimento precisa ser maior que 0.");
        }
      } while (taxaPaisB <= 0);

      int anos = 0;
      int a = paisA;
      int b = paisB;

      while (a < b) {
        a *= 1 + (taxaPaisA / 100);
        b *= 1 + (taxaPaisB / 100);
        anos++;
      }

      System.out.println(
          "\nO número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, é de: "
              + anos + " anos.");

      System.out.println("\nDeseja repetir a operação? (Digite 's' para SIM ou 'n' para NÃO)");
      leitura.nextLine();
      repetir = leitura.nextLine();

    } while (repetir.equalsIgnoreCase("s"));
    System.out.println("Programa finalizado.");

    leitura.close();
  }
}