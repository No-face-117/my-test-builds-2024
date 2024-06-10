// My First java Program
import java.util.Random;
import java.util.Scanner;

public class New_project_test_1_Rock_paper_sissor {
    public static void main(String[] args) {
        String player_wish;
        String player_move;
        
    
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Would you like to play(y/n)");
            player_wish = scanner.nextLine();
            if (player_wish.equals("n")){break;}
            
            
            while (true) {
                String[] rps = {"r", "p", "s"};
                String computer_move = rps[new Random().nextInt(rps.length)];

                while(true){

                    System.out.println("Please enter your move (r, p, or s)");
                    player_move = scanner.nextLine();
                    if (player_move.equals("r") || player_move.equals("p") || player_move.equals("s")) {
                      break;
                    }
                    System.out.println(player_move + " is not a valid move.");

                }

                System.out.println("Computer played: " + computer_move);

                if (player_move.equals(computer_move)) {
                    System.out.println("The game was a tie!");
                  }

                else if (player_move.equals("p"))
                {
                    if (computer_move.equals("s")){System.out.println("You_lose_computer_played : " + computer_move);}

                    else if(computer_move.equals("r")){System.out.println("You_win_computer_played : " + computer_move);}
                }

                else if (player_move.equals("s"))
                {
                    if (computer_move.equals("r")){System.out.println("You_lose_computer_plated : " + computer_move);}

                    else if (computer_move.equals("p")){System.out.println("You_win_computer_played : " + computer_move);}
                }

                else if (player_move.equals("r"))
                {
                    if (computer_move.equals("p")){System.out.println("You_lose_computer_plated : " + computer_move);}

                    else if (computer_move.equals("s")){System.out.println("You_win_computer_played : " + computer_move);}
                }

                System.out.println("Play again? (y/n)");
                String playAgain = scanner.nextLine();
                
                if (!playAgain.equals("y")) {
                  break;
                }
            }
        
        scanner.close();

        }
    }
}
;    

    

       
