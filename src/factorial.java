import java.util.Scanner;

/**
 * Created by ~_RipTor_~ on 11.01.2018.
 */
public class factorial {

   public static void main(String args[]){
       Scanner str = new Scanner(System.in);
       System.out.println("Please input string");
       int n = Integer.parseInt(str.next());
       long f = 1;
       for(long i=1;i<=n;i++){
           f = f*i;
       }
       System.out.print("Factorial value is "+ f);
   }
}
