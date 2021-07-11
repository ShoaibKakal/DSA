import java.util.*;

public class PairProduct {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int ar[] = new int[size];

    for (int i = 0; i < size; i++) {
      ar[i] = scanner.nextInt();
    }

    System.out.println(product(ar));
  }

  static int product(int ar[]) {
    int temp = 0;
    int temp2 = 0;
    for (int i = 0; i < ar.length; i++) {
      if (ar[i] >= temp) {
        temp2 = temp;
        temp = ar[i];
      }
      else if(ar[i] >= temp2 && ar[i] != temp)
      {
          temp2 = ar[i];
      }
    }
    
    return temp * temp2;
  }
}
