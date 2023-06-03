import java.util.Scanner; 
import java.io.*;
import java.util.*; 
import java.lang.*;


public class inverse{
    public static void main(String[] args) {
    /*int n;  
    Scanner sc=new Scanner(System.in);  
    System.out.print("Enter the number of elements you want to store: ");  

    n=sc.nextInt();  

    int[] arr1 = new int[n];  
    System.out.println("Enter the elements of the array: ");  
    for(int i=0; i<n; i++)  
    {  
  
    arr1[i]=sc.nextInt();  
    }  */
    Scanner sc=new Scanner(System.in); 
    int num = sc.nextInt();

    int inv=0;
    int op=1;
    while(num!=0){
        int od = num%10;
        int id = op;
        int ip = od;

        inv = inv + id*(int)Math.pow(10,ip-1);

        num=num/10;
        op++;

    }
    System.out.println(inv);
    }
}