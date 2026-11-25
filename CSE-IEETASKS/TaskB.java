
import java.util.Scanner;

public class Tasks {
       public static void main(String[] args) {
           Scanner s = new Scanner(System.in);
           int totalprob = 0;
           int n =s.nextInt();
           for( int i=0 ; i<n ; i++){
               int count = 0 ;
               for( int j=0 ; j<3 ; j++){
                   int x =s.nextInt();
                   count+=x;
                 
                                  }
           if(count>1){
               totalprob++;
           }
           
           }
           System.out.println(totalprob);
    }
    
}
