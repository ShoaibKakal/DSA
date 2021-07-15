public class Rough {
    
    public static void main(String args[])
    {
        int ar[] = {1,2,3,4,5,6,7,8};
        fun(4);
    }


    static int count =0;
    static void fun(int n)
    {
        
       

        count++;
        System.out.println(count);
        if(n==1)
            return;
           
        fun(n-1);
        fun(n-1);
    }
  
}
