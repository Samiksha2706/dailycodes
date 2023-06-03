import java.util.*;
public class num{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        
        int d=0;
        // to string , 
        while(c!=0){
           d = c%10;
           System.out.println(d);
           c=c/10;
        }
        
    }
    
}
