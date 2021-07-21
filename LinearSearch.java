public class LinearSearch {



    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 10;
        int res = search(array, 9, 0,100);
        System.out.println(res);
    }
    
    static int  search(int[] array,int high, int low, int target) {

       
        if(high < low)
        {
            return 0;
        }
        else if(array[low] == target)
        {
            return target;
        }

        return search(array, high, ++low, target);
        
        
    }
}

