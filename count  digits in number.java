public class digits in number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int ans =0;
        // to string , 
        while(c!=0){
            c=c/10;
            ans++;
        }
        System.out.println(ans);
    }
    
}
