
import java.util.Scanner;

public class prob_10_binary_to_decimal {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num_1 = 0;
    int cord = 0;
    System.out.println("Enter your integer : ");
    int number = scan.nextInt();
    
    for (int i = 0; i < 10; i++) {
      num_1 = (number) % (10);
      cord += num_1 * Math.pow(2, (i));
      number = number / (10);
      
      System.out.println(cord);
      System.out.println("num_1 : " + num_1);
      System.out.println("number : " + number);

      if (num_1 == 0 && number == 0) {
        break;
      }
    }
    
   
    
    scan.close();
  }
}
