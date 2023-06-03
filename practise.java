import java.util.*;

public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int count=0;
        int temp = n;
        while(temp!=0){
           temp = temp/10;
            count++;
        }
        int nod = count;
        int kt = (int)Math.pow(10,nod-k);
        int back = temp/kt;
        int front = temp%kt * (int)Math.pow(10,k);
        int sum = front +back;
        System.out.println(sum);
        
    }
    
}
