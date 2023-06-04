import java.net.SocketPermission;
import java.util.*;
import javax.lang.model.util.ElementScanner14;

// refer - https://www.geeksforgeeks.org/java-program-to-rotate-digits-of-a-given-number-by-k/?ref=rp

public class rotate_number2{
   
    public static void clock(int temp,int k){
  
        int count=0;
        while(temp!=0){
           temp = temp/10;
            count++;
        }
        int nod = count;
        int kt = (int)Math.pow(10,k);
        int back = temp/kt;
        int front = temp%kt * (int)Math.pow(10,nod-k);
        
        System.out.print(front+back);
    }
    /**
     * @param temp
     * @param k
     * @param back
     * @return
     */
    public static void aclock(int temp,int k){
        int count=0;
        while(temp!=0){
           temp = temp/10;
            count++;
        }
        k=-k;
        int nod = count;
        int kt = (int)Math.pow(10,nod-k);
        int front = temp/kt;
        int back = temp%kt * (int)Math.pow(10,k);
        System.out.print(front+back);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if(k>1){
            clock(n,k);
            
        }
        else if(k<1){
            aclock(n,k);
        }
        else{
            System.out.println("no rotation");
        }
        }   
    }

