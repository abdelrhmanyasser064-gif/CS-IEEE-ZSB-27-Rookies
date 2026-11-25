
import java.util.Scanner;
public class TaskC {
    public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int t =s.nextInt();
    for( int i=0 ; i < t ; i++){
               int r = s.nextInt();
            if (r >= 1900) {
                System.out.println("Division 1");
            } else if (r >= 1600) {
                System.out.println("Division 2");
            } else if (r >= 1400) {
                System.out.println("Division 3");
            } else {
                System.out.println("Division 4");
            }
        }
        s.close();
    }
}
    
    
    

    
    
    


    
