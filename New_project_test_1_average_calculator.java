// My second java Program

import java.util.Scanner;

public class New_project_test_1_average_calculator {
    public static void main(String[] args) {

      try (Scanner scanner = new Scanner(System.in)) 
      {
        System.out.println("Enter_the_numbers_separated_by_space");
        String line = scanner.nextLine();
        String[] parts = line.split(" ");

        int[] numbers = new int[parts.length];
        for (int i = 0 ; i< parts.length; i++)
        {
            try{ numbers [i] = Integer.parseInt(parts[i]);}
            catch (NumberFormatException e)
            {
                System.out.println("Invalid_input.Please_enter_Integers_only");
                return;
            }
        }

        double average = calculateAverage(numbers);
        System.out.println("The_average_is : " + average);
        
      }
    }



 public static double calculateAverage (int[] numbers)
 {
    int sum = 0;
    for (int number : numbers)
    {
        sum += number;
    }
    return (double) sum / numbers.length;
 }

}
    
      
    

       
