
import java.util.Scanner;

public class prob_11_to_find_something {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num_1 = 0;
    int num_c_max = 0;
    int num_c_min = 0;
    int num_av = 0;

    int cord_1 = 0;
    int c_1 = 0;
    int cord_2 = 0;
    int c_2 = 0;

    int cord_11 = 0;
    int c_11 = 0;
    int cord_22 = 0;
    int c_22 = 0;

    int c_0 = 0;
    
    System.out.println("how many numbers : ");
    int number_n = scan.nextInt();


    for (int i = 1; i <= number_n; i++) {
      System.out.println("Enter number : ");
      num_1 = scan.nextInt();
      
      
      if (num_1 > 0 ) {
        if (num_1%2 == 0) {      // pos even
          cord_1 = num_1 + cord_1;
          c_1 ++;  // counter for pos even
        }
        else if (num_1%2 != 0) { // pos odd
          cord_2 = num_1 + cord_2;
          c_2 ++;  // counter for pos odd
        }else{}
      }
      else if (num_1 < 0 ) {
        if (num_1%2 == 0) {     // neg even
          cord_11 += num_1 + cord_11;
          c_11 ++;  // counter for neg even
        }
        else if (num_1%2 != 0) { // neg odd
          cord_22 = num_1 + cord_22;
          c_22 ++;  // counter for neg odd 
        }else{}
      }else{c_0 ++;}
      
      if (num_1 > num_c_max) {
        num_c_max = num_1;
      }
      if (num_1 < num_c_min ) {
        num_c_min = num_1;
      }


    }
    
    System.out.println();
    System.out.println("num_c_max : " + num_c_max);
    System.out.println("num_c_min : " + num_c_min);

    System.out.println();
    System.out.println();
    System.out.println("cord_1 : " + cord_1);
    System.out.println("c_1 : " + c_1);

    System.out.println();
    System.out.println("cord_2 : " + cord_2);
    System.out.println("c_2 : " + c_2);
    
    System.out.println();
    System.out.println();
    System.out.println("cord_11 : " + cord_11);
    System.out.println("c_11 : " + c_11);

    System.out.println();
    System.out.println("cord_22 : " + cord_22);
    System.out.println("c_22 : " + c_22);

    System.out.println();
    System.out.println();
    System.out.println("Avg cord_1 : " + (double)(cord_1 / c_1));

    System.out.println();
    System.out.println("Avg cord_2 : " + (double)(cord_2 / c_2));

    System.out.println();
    System.out.println("Avg cord_11 : " + (double)(cord_11 / c_11));
    
    System.out.println();
    System.out.println("Avg cord_22 : " + (double)(cord_22 / c_22));
    
    scan.close();
  }
}
