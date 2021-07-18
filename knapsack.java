public class knapsack {

  public static void main(String[] args) {
    int w[] = { 4, 3, 2 };
    int v[] = { 20, 18, 14 };
    int capacity = 7;

    calcKnapsack(w, v, capacity);
  }

  static void calcKnapsack(int w[], int v[], int capacity) {
    int knapsack = 0;
    int visited[] = new int[3];
    int maxIndex = -1;
    int totalSum = 0;

    while (knapsack < capacity) {
      int max = 0;
      for (int i = 0; i < w.length; i++) {
        if (visited[i] == 0 && v[i] / w[i] > max) {
          max = v[i] / w[i];
          maxIndex = i;
        }
      }

      visited[maxIndex] = 1;

      if (knapsack < capacity) {
        int temp = knapsack + w[maxIndex];
        if (temp > capacity) {
          int temp2 = capacity - knapsack;
          knapsack += temp2;
          totalSum+= v[maxIndex]/temp2;

        } else {
        
          knapsack += w[maxIndex];
          totalSum+= v[maxIndex];
        }
      }
    }

    System.out.println("KnapSack value: " + knapsack);
    System.out.println("Max Sum: " + totalSum);
  }
}
