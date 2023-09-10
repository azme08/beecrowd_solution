
//1165 - Prime Number
  import java.util.Scanner;


public class JavaApplication3 {

    
    public static void main(String[] args) {
        
        
       int x;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        while(n!=0){
            x=sc.nextInt();
            int res=0;
           if(x<=1){
               System.out.println(x+" nao eh primo");
               return;
           }
           for(int i=1;i<=x/2;i++){
               
               if(x%i==0){
                   res++;
               }
           }
           if(res>1){
               System.out.println(x+" nao eh primo");
           }else{
               System.out.println(x+" eh primo");
           }
            
            
         n-=1;   
        }
        
        
      
        
    }
    
}
