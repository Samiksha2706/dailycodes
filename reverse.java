import java.util.Scanner; 
class reverse {
    public int rev(int x) {
        int inv=0;
        int sum =0;
        
        while(x!=0){
            inv=x%10;
            sum = sum *10 + inv;
            x=x/10;
           
            
        }
        return sum;
    }
    public static void main(String[] args) 

    {   
        int num = 123 ;
        reverse so = new reverse();
        so.rev(num);
    }
}