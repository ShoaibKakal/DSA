import java.util.Random;

public class GCD {

    public static void main(String [] args)
    {

        Random rn = new Random();
        System.out.println(gcd(357,234));
        // while (true) {
      
        //     long num1 = rn.nextInt((100000 - 1) + 1) + 1;
        //     long num2 = rn.nextInt((100000 - 1) + 1) + 1;
        //     long res1 = gcd(num1, num2);
        //     long res2 = fun2(num1, num2);
        //     if(res1!=res2){
        //       System.out.println("Wrong Answer: "+ res1 + " "+ res2);
        //       break;
        //     }
        //     else{
        //         System.out.print(res1 + " " + res2);
        //       System.out.println("Ok");
        //     }
        //   }
    }

    static long gcd(long a, long b)
    {
        long temp;
        if(a>b)
        {
            temp = a;
        }
            
        else
        {
            temp = b;
        }
           
    
        for(long i=temp; i>=0; i++)
        {
            if(a%temp==0 && b%temp==0)
            {
                break;
            }
            temp--;
        }

        return temp;
    }


    static long fun2(long num1, long num2)
    {
        long gcd = 1;
        for(long i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }


        return gcd;
    }
    
}
