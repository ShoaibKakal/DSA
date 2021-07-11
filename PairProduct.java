import java.util.*;

public class PairProduct {

  public static void main(String[] args) {
    Random rn = new Random();

    while (true) {
      int size = rn.nextInt((200000 - 2) + 1) + 2;
      int ar[] = new int[size];

      System.out.println(size);

      for (int i = 0; i < size; i++) {
        ar[i] = rn.nextInt((100000 - 0) + 1) + 0;
        
      }

      long res1 = product(ar);
      long res2 = productBySort(ar);
      if(res1!=res2){
        System.out.println("Wrong Answer: "+ res1 + " "+ res2);
        break;
      }
      else{
        System.out.println("Ok");
      }
    }

    
  }

  static long product(int ar[]) {
    long temp = 0;
    long temp2 = 0;
    for (int i = 0; i < ar.length; i++) {
      if (ar[i] >= temp) {
        temp2 = temp;
        temp = ar[i];
      } else if (ar[i] >= temp2 && ar[i] != temp) {
        temp2 = ar[i];
      }
    }

    return temp * temp2;
  }

  static long productBySort(int ar[]) {
    Arrays.sort(ar);

    return (long) ar[ar.length - 1] * (long) ar[ar.length - 2];
  }
}
