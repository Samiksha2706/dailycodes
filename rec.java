public class rec {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    //printing N to 1 and 1 to N
    /*static void recboth(int n){
        
        if(n==0){
            return;
        }

        //System.out.println(n);
        recboth(n-1);
        System.out.println(n);
    }*/


    
    //factorial
    static int factorial(int n){
        if(n<=1){
            return 1;
        }        
        int a= n * factorial(n-1);
        return a;
        
    }





    
}
