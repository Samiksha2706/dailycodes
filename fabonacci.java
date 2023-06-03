import java.util.*;
public class fabonacci{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int ft =0;
        int st= 1;
        int ne =0;
        for(int i=0;i<10;i++){
            System.out.println(ft);
            ne = ft+st;
            ft=st;
            st=ne;

        }

    }
}