import java.io.*;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for(int i= low;i <=high;i++){
            int div=2;
            
            for(int d=div;d*d<high;d++){
                if(i%d==0){
                    System.out.println(i +"is not prime");
                }
                else{
                    System.out.println(i+"is prime");
                }

            }
        }
    }
}
