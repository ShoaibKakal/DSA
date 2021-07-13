public class FibonacciNumber {

  public static void main(String[] args) {
    FibonacciNumber fb = new FibonacciNumber();
    fb.calculate(10);
  }

  void calculate(int x) {
    long prev = 0;
    long sum = 1;
    for (int i = 1; i <= x; i++) {
      if (x == 1) {
        System.out.print("0 ");
      } else if (x == 2 || x == 3) {
        System.out.print("1 ");
      } 
      if(i!=1 && i!=2) {
        prev = sum - prev;
        sum = sum + prev;
      }
    }
    System.out.print(sum + " ");

    
  }
}
