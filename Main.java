import java.util.Scanner;
/**
 *Prints multiple lines of starts based on the number inputed
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for input
    Scanner input = new Scanner(System.in);

    //get the number from the user
    System.out.println("Please enter a number between 1 and 10");
    int num = input.nextInt();

    //For loop to calculate star output
    for(int count = 1; count <= num; count++){
      for(int count2 = 1; count2 <= num; count2++){
        System.out.print("*");
     
    }
     System.out.println();
    }
    
  }
}
