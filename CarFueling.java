public class CarFueling{

    public static void main(String[] args)
    {

        int x[] = {1,2,3,4,5,6};
        minRefils(x, 4, 2);
    }

    static void minRefils(int x[], int n, int L)
    {
        int numRefills = 0, currentRefill = 0;

        while(currentRefill <= n)
        {
            int lastRefill = currentRefill;

            while(currentRefill<=n &&  x[currentRefill+1]-x[lastRefill]<=L)
            {
                currentRefill++;
            }
            if(currentRefill == lastRefill)
            {
                System.out.println("IMPOSSIBLE");
            }
            else if(currentRefill <= n)
            {
                numRefills++;
            }
        }

        System.out.println(numRefills);
    }
}