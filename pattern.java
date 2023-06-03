public class pattern {
    public static void main(String[] args) {
        int st=1;  
        for(int i=0;i<=4;i++){
            for(int j=2;j>i;j--){
                
                System.out.print(" | ");

            }
            for (int j=0;j<st;j++){
                System.out.print(" * ");
            }
        st++;     
        System.out.println();    
            
        }
    }
    
}
