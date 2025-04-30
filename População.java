public class População {
  public static void main(String[] args) {
    int paisA = 80000;
    int paisB = 200000;
    int anos = 0;

    while (paisA < paisB) {
      paisA *= 1.03;
      paisB *= 1.015;
      anos++;
    }

    System.out.println(
        "O número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, é de: "
            + anos + " anos.");
  }
}