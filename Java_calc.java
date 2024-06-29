import java.util.Scanner;

public class Java_calc {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        String new_thing;
        String something;
        int nothing_i = 0;
        double nothing_d = 0.0;
        String div_i = "";
        String div_d = "";

        System.out.println("What do you want to work with?");
        System.out.println("Integer / double");
        new_thing = scan.nextLine(); // new thing decides

        // what they want to do
        System.out.println("What do you want to do?");
        System.out.println("add / subtract / multiply / divide");
        something = scan.nextLine(); // something plus

        if (new_thing.equalsIgnoreCase("Integer")) {
            System.out.println("Enter num 1: ");
            int num_1 = scan.nextInt();

            System.out.println("Enter num 2: ");
            int num_2 = scan.nextInt();

            if (something.equalsIgnoreCase("divide")) {
                System.out.println("Who by who?");
                System.out.println("num_1 / num_2 or num_2 / num_1");
                System.out.println("Pick your choice: c-1 or c-2");
                scan.nextLine(); // Consume newline
                div_i = scan.nextLine();
            }

            switch (something.toLowerCase()) {
                case "add":
                    nothing_i = num_1 + num_2;
                    break;
                case "subtract":
                    nothing_i = Math.abs(num_1 - num_2);
                    break;
                case "multiply":
                    nothing_i = num_1 * num_2;
                    break;
                case "divide":
                    if (div_i.equals("c-1") && num_2 != 0) {
                        nothing_i = num_1 / num_2;
                    } else if (div_i.equals("c-2") && num_1 != 0) {
                        nothing_i = num_2 / num_1;
                    } else {
                        System.out.println("Illegal move");
                        System.out.println("Your desired output is : Infinity");
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }

            System.out.println("Your desired output is: " + nothing_i);
        } else if (new_thing.equalsIgnoreCase("Double")) {
            System.out.println("Enter num 1: ");
            double num_1 = scan.nextDouble();

            System.out.println("Enter num 2: ");
            double num_2 = scan.nextDouble();

            if (something.equalsIgnoreCase("divide")) {
                System.out.println("Who by who?");
                System.out.println("num_1 / num_2 or num_2 / num_1");
                System.out.println("Pick your choice: c-1 or c-2");
                scan.nextLine(); // Consume newline
                div_d = scan.nextLine();
            }

            switch (something.toLowerCase()) {
                case "add":
                    nothing_d = num_1 + num_2;
                    break;
                case "subtract":
                    nothing_d = Math.abs(num_1 - num_2);
                    break;
                case "multiply":
                    nothing_d = num_1 * num_2;
                    break;
                case "divide":
                    if (div_d.equals("c-1") && num_2 != 0) {
                        nothing_d = num_1 / num_2;
                    } else if (div_d.equals("c-2") && num_1 != 0) {
                        nothing_d = num_2 / num_1;
                    } else {
                        System.out.println("Illegal move");
                        System.out.println("Your desired output is : Infinity");
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }

            System.out.println("Your desired output is: " + nothing_d);
        } else {
            System.out.println("Invalid type");
        }

        scan.close();
    }
}
