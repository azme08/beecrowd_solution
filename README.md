# beecrowd_solution
//1164 - Perfect Number
import java.util.Scanner;

/**
 *
 * @author abdulah al azme
 */
public class JavaApplication3 {

    
    public static void main(String[] args) {
        
        
       int x;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        while(n!=0){
            x=sc.nextInt();
            int res=0;
            for(int i=1;i<=x;i++){
                
                if(x%i==0 && x/i!=1){
                    
                   res +=i;
                    
                }
                
            }
            if(x==res){
                System.out.println(x+" eh perfeito");
            }else{
                System.out.println(x+" nao eh perfeito");
            }
            
            
         n-=1;   
        }
        
        
      
        
    }
    
}
