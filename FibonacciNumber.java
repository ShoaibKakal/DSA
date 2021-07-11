public class FibonacciNumber {

  public static void main(String[] args) {
    FibonacciNumber fb = new FibonacciNumber();
    fb.calculate(10);
  }

  void calculate(int x) {
    int prev = 0;
    int sum = 1;
    for (int i = 1; i <= x; i++) {
      if (i == 1) {
        System.out.print("0 ");
      } else if (i == 2 || i == 3) {
        System.out.print("1 ");
      } else {
        prev = sum - prev;
        sum = sum + prev;
        System.out.print(sum + " ");
      }
    }
  }
}
