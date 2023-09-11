/1172 - Array Replacement I
  import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
    
       int[] X=new int[10];
       Scanner sc=new Scanner(System.in);

    for(int i=0;i<10;i++){
       int n=sc.nextInt();
        if(n<=0){
            System.out.println("X["+i+"] = 1");
        }else {
           System.out.println("X["+i+"]"+" = "+n);
        }
    }

       
       
    }
    
}
