
package hellogit;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class HelloGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Input your name: ");
       String name = input.nextLine();
        System.out.println("Hello" + name);
        
    }
    
}
