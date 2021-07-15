public class GreaterCombination {


    public static void main(String[] args)
    {

        StringBuilder result;

        int ar[] = {5,7,3,9,8,5};
        int temp = 0;
        for(int i=0; i<ar.length; i++)
        {

            for(int j=0; j<ar.length; j++)
            {
                if(ar[i]>ar[j])
                {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }

            }
                
        }


        for(int i=0; i<ar.length; i++)
        {
            System.out.print(ar[i] +" ");
        }
    }


    
}
