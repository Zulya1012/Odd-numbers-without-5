public class oddnumbers5 {
  public static void main(String[] arg) {
    int a = 0;
    while (a <= 9) {
      a++;
      if ((a % 2 != 0 && a != 5) && (a % 2 != 0 || a == 5))
        System.out.println(a);
    }

  }
}
