public class primefactorization {
    public static void main(String[] args) {
        int num = 140;
        int i=2;
        int count = 0;
        int ori=num;
        while(num >=0){
  
            if(num%i==0){
                num = num/i;
                
                System.out.println(i);
                
                continue;
                
            }
            else{  
                i++;
            }
            

        }
        System.out.print(count);
    }
    
}
