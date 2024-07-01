// java game_2

import java.util.Scanner;
import java.util.Random;

public class Java_luck_game {

    public static void main(String[] args) {
        int player_1 = 0;
        int turn_player_1 = 0;
        int score_player_1_t = 0;
        String want_to_play_1 =" ";

        int player_2 = 0;
        int turn_player_2 = 0;
        int score_player_2_t = 0;
        String want_to_play_2 =" ";

        int turns = 1;
        String want_to_play =" ";

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Although I'm not a big fan of gambling .I did this project to get a good idea of the method's used.");
        System.out.println("Don't you dare to use this for Russian Rillet, ya hear me.");

        System.out.println();

        while (turns <= 10) {
           if (turns == 1) {
            System.out.println("Are the both of you ready to play (yes/no)?");
            want_to_play = scan.nextLine();
           } 
           else if (turns > 1) {
            System.out.println("Are the both of you ready to play round " + turns + " ,(yes/no)?" );
            want_to_play = scan.nextLine();
           }

           System.out.println();

           int dice_1 = rand.nextInt(1, 7);
           //System.out.println(dice_1);
           int dice_2 = rand.nextInt(1, 7);
           //System.out.println(dice_2);

           System.out.println();

           if (want_to_play.equals("yes")) {
            
              
                System.out.println("Ready player 1 (y/n)");
                want_to_play_1 = scan.nextLine();

                System.out.println();

                if (want_to_play_1.equals("y")) {
                    if (turns == 1) {
                        score_player_1_t = player_1 + dice_1;
                        System.out.println("Your previews score = " + player_1);
                        System.out.println("Your new score is = " + score_player_1_t);   
                    }
                    else if (turns > 1 && turns <= 10) {
                        System.out.println("Your previews score = " + score_player_1_t);
                        score_player_1_t = score_player_1_t + dice_1;
                        System.out.println("Your new score is = " + score_player_1_t);
                    }
                }else{break;}

                System.out.println();

                System.out.println("Ready player 2 (y/n)");
                want_to_play_2 = scan.nextLine();

                System.out.println();

                if (want_to_play_2.equals("y")) {
                    if (turns == 1) {
                        score_player_2_t = player_2 + dice_2; 
                        System.out.println("Your previews score = " + player_2);
                        System.out.println("Your new score is = " + score_player_2_t);  
                    }
                    else if (turns > 1 && turns <= 10) {
                        System.out.println("Your previews score = " + score_player_2_t);
                        score_player_2_t = score_player_2_t + dice_2;
                        System.out.println("Your new score is = " + score_player_1_t);
                    }
                }else{break;}
            
           }else{break;}



            System.out.println();            

            if (score_player_1_t == 40 ) {
                System.out.println("congrats's player - 1 you win!");
                break;
            }
            else if (score_player_2_t == 40 ){
                System.out.println("congrats's player - 2 you win!");
                break;
            }

            turns ++;

        }

        scan.close();
    }
}
