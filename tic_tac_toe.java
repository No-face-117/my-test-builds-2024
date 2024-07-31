
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class tic_tac_toe {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    
    // who gets what
    System.out.println("Select your move type !!");
    System.out.println("|  X   OR   O  |");
    String plm_11 = scan.nextLine();
    String plm_1 = "";
    String cm_1 = "";

    if (plm_11.equalsIgnoreCase("x")) {
      cm_1 = "O ";
      plm_1 = "X ";
    }else if (plm_11.equalsIgnoreCase("o")) {
      cm_1 = "X ";
      plm_1 = "O ";
    }else{}

    System.out.println();
 
    // coin toss
    int ct = rand.nextInt(1,3);
    int wg = 0;

    // who goes first
    System.out.println("Lets see who goes first.");
    System.out.println("Heads   or  Tails");
    String wgf = scan.nextLine();

    System.out.println();
    
    if ((wgf.equalsIgnoreCase("heads") && ct == 1) || (wgf.equalsIgnoreCase("tails") && ct == 2)) {
      System.out.println("Congrats you go first.");
      wg = 1;
    } 
    else if ((wgf.equalsIgnoreCase("heads") && ct != 1) || (wgf.equalsIgnoreCase("tails") && ct != 2)) {
      System.out.println("Congrats you go second.");
      System.out.println("!!!!!!!!!!! THERE IS NO TIE !!!!!!!!!!");
      wg = 2;
    }
    
    String plm = "";
    
    //alc
    String tc = "";
    int tcc = rand.nextInt(0,8);

    
    // String computerMove = rps[new Random().nextInt(rps.length)];
    
    String x11 = "x1";
    String x22 = "x2";
    String x33 = "x3";

    String y11 = "y1";
    String y22 = "y2";
    String y33 = "y3";

    String z11 = "z1";
    String z22 = "z2";
    String z33 = "z3";

    
    // the everything
    ArrayList <String> rpp = new ArrayList<>();
    
    rpp.add(x11);rpp.add(x22);rpp.add(x33);
    rpp.add(y11);rpp.add(y22);rpp.add(y33);
    rpp.add(z11);rpp.add(z22);rpp.add(z33);

    System.out.println("Computer move type : cm_1 : " + cm_1);
    
    //the stage 
    String sk = "+----------+----------+----------+";
    String gk = "|          |          |          |";
    String pk1 = "|    " + rpp.get(0) + "    |" + "    " + rpp.get(1) + "    |" + "    " + rpp.get(2) + "    |";
    String pk2 = "|    " + rpp.get(3) + "    |" + "    " + rpp.get(4) + "    |" + "    " + rpp.get(5) + "    |";
    String pk3 = "|    " + rpp.get(6) + "    |" + "    " + rpp.get(7) + "    |" + "    " + rpp.get(8) + "    |";

    System.out.println(sk);
    System.out.println(gk);
    System.out.println(pk1);
    System.out.println(gk);
    
    System.out.println(sk);
    System.out.println(gk);
    System.out.println(pk2);
    System.out.println(gk);
    
    System.out.println(sk);
    System.out.println(gk);
    System.out.println(pk3);
    System.out.println(gk);
    System.out.println(sk);

   // who has played

   int php = 0;
   int chp = 0;
   int hp = 0;

   // you go first
   //int p = 1;
   while (wg == 1 && hp<= 9) { //yg 
      if (hp == 0 || hp % 2 == 0) {
        System.out.println();
        System.out.println("Enter your move : ");
        System.out.println("Your move type : " + plm_1);
        plm = scan.nextLine();
        System.out.println();
      
        if (plm.equalsIgnoreCase("x1") && !x11.equalsIgnoreCase(cm_1)) {
          rpp.remove(0);rpp.add(0,plm_1);
          System.out.println("You played : x1 : " + rpp.get(0));
          hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("x2") && !x22.equalsIgnoreCase(cm_1)) {
          rpp.remove(1);rpp.add(1,plm_1);
          System.out.println("You played : x2 : " + rpp.get(1));
          hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("x3") && !x33.equalsIgnoreCase(cm_1)) {
          rpp.remove(2);rpp.add(2,plm_1);
          System.out.println("You played : x3 : " + rpp.get(2));
          hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("y1") && !y11.equalsIgnoreCase(cm_1)) {
          rpp.remove(3);rpp.add(3,plm_1);
          System.out.println("You played : y1 : " + rpp.get(3));
          hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("y2") && !y22.equalsIgnoreCase(cm_1)) {
          rpp.remove(4);rpp.add(4,plm_1);
          System.out.println("You played : y2 : " + rpp.get(4));hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("y3") && !y33.equalsIgnoreCase(cm_1)) {
          rpp.remove(5);rpp.add(5,plm_1);
          System.out.println("You played : y3 : " + rpp.get(5));
          hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("z1") && !z11.equalsIgnoreCase(cm_1)) {
          rpp.remove(6);rpp.add(6,plm_1);
          System.out.println("You played : z1 : " + rpp.get(6));
          hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("z2") && !z22.equalsIgnoreCase(cm_1)) {
          rpp.remove(7);rpp.add(7,plm_1);
          System.out.println("You played : 2z : " + rpp.get(7));
          hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("z3") && !z33.equalsIgnoreCase(cm_1)) {
          rpp.remove(8);rpp.add(8,plm_1);
          System.out.println("You played : z3 : " + rpp.get(8));
          hp++;
          php++;
        }else{}

        pk1 = "|    " + rpp.get(0) + "    |" + "    " + rpp.get(1) + "    |" + "    " + rpp.get(2) + "    |";
        pk2 = "|    " + rpp.get(3) + "    |" + "    " + rpp.get(4) + "    |" + "    " + rpp.get(5) + "    |";
        pk3 = "|    " + rpp.get(6) + "    |" + "    " + rpp.get(7) + "    |" + "    " + rpp.get(8) + "    |";

        System.out.println(sk);
        System.out.println(gk);
        System.out.println(pk1);
        System.out.println(gk);
    
        System.out.println(sk);
        System.out.println(gk);
        System.out.println(pk2);
        System.out.println(gk);
    
        System.out.println(sk);
        System.out.println(gk);
        System.out.println(pk3);
        System.out.println(gk);
        System.out.println(sk);

        System.out.println();
        System.out.println("PHP : " + php);

        // victory conditions for player.
        //Row
        if (rpp.get(0).equals(plm_1) && rpp.get(1).equals(plm_1) && rpp.get(2).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
          break;
        }
        else if (rpp.get(3).equals(plm_1) && rpp.get(4).equals(plm_1) && rpp.get(5).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
          break;
        }
        else if (rpp.get(5).equals(plm_1) && rpp.get(7).equals(plm_1) && rpp.get(8).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
          break;
        }
        //Colum
        else if (rpp.get(0).equals(plm_1) && rpp.get(3).equals(plm_1) && rpp.get(6).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
          break;
        }
        else if (rpp.get(1).equals(plm_1) && rpp.get(4).equals(plm_1) && rpp.get(7).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
          break;
        }
        else if (rpp.get(2).equals(plm_1) && rpp.get(5).equals(plm_1) && rpp.get(8).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
        }
        //cross
        else if (rpp.get(0).equals(plm_1) && rpp.get(4).equals(plm_1) && rpp.get(8).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
        }
        else if (rpp.get(2).equals(plm_1) && rpp.get(4).equals(plm_1) && rpp.get(6).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
        }
        else{}
      }
      

      if (hp != 0 || hp % 2 != 0) { //cg
        tcc = rand.nextInt(0,8);
        tc = rpp.get(tcc);
        System.out.println();

        if (tc.equalsIgnoreCase("x1") && !x11.equalsIgnoreCase(plm_1)) {
          rpp.remove(0);rpp.add(0,cm_1);
          System.out.println("Computer played : x1 : " + rpp.get(0));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("x2") && !x22.equalsIgnoreCase(plm_1)) {
          rpp.remove(1);rpp.add(1,cm_1);
          System.out.println("Computer played : x2 : " + rpp.get(1));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("x3") && !x33.equalsIgnoreCase(plm_1)) {
          rpp.remove(2);rpp.add(2,cm_1);
          System.out.println("Computer played : x3 : " + rpp.get(2));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("y1") && !y11.equalsIgnoreCase(plm_1)) {
          rpp.remove(3);rpp.add(3,cm_1);
          System.out.println("Computer played : y1 : " + rpp.get(3));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("y2") && !y22.equalsIgnoreCase(plm_1)) {
          rpp.remove(4);rpp.add(4,cm_1);
          System.out.println("Computer played : y2 : " + rpp.get(4));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("y3") && !y33.equalsIgnoreCase(plm_1)) {
          rpp.remove(5);rpp.add(5,cm_1);
          System.out.println("Computer played : y3 : " + rpp.get(5));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("z1") && !z11.equalsIgnoreCase(plm_1)) {
          rpp.remove(6);rpp.add(6,cm_1);
          System.out.println("Computer played : z1 : " + rpp.get(6));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("z2") && !z22.equalsIgnoreCase(plm_1)) {
          rpp.remove(7);rpp.add(7,cm_1);
          System.out.println("Computer played : z2 : " + rpp.get(7));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("z3") && !z33.equalsIgnoreCase(plm_1)) {
          rpp.remove(8);rpp.add(8,cm_1);
          System.out.println("Computer played : z3 : " + rpp.get(8));
          hp++;
          chp++;
        }else{
            tcc = rand.nextInt(0,8);
            tc = rpp.get(tcc);
        }

        pk1 = "|    " + rpp.get(0) + "    |" + "    " + rpp.get(1) + "    |" + "    " + rpp.get(2) + "    |";
        pk2 = "|    " + rpp.get(3) + "    |" + "    " + rpp.get(4) + "    |" + "    " + rpp.get(5) + "    |";
        pk3 = "|    " + rpp.get(6) + "    |" + "    " + rpp.get(7) + "    |" + "    " + rpp.get(8) + "    |";

        System.out.println(sk);
        System.out.println(gk);
        System.out.println(pk1);
        System.out.println(gk);
    
        System.out.println(sk);
        System.out.println(gk);
        System.out.println(pk2);
        System.out.println(gk);
    
        System.out.println(sk);
        System.out.println(gk);
        System.out.println(pk3);
        System.out.println(gk);
        System.out.println(sk);

        System.out.println();
        System.out.println("CHP : " + chp);

        // victory conditions for computer.
        //Row
        if (rpp.get(0).equals(cm_1) && rpp.get(1).equals(cm_1) && rpp.get(2).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        else if (rpp.get(3).equals(cm_1) && rpp.get(4).equals(cm_1) && rpp.get(5).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        else if (rpp.get(5).equals(cm_1) && rpp.get(7).equals(cm_1) && rpp.get(8).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        //Colum
        else if (rpp.get(0).equals(cm_1) && rpp.get(3).equals(cm_1) && rpp.get(6).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        else if (rpp.get(1).equals(cm_1) && rpp.get(4).equals(cm_1) && rpp.get(7).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        else if (rpp.get(2).equals(cm_1) && rpp.get(5).equals(cm_1) && rpp.get(8).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        //cross
        else if (rpp.get(0).equals(cm_1) && rpp.get(4).equals(cm_1) && rpp.get(8).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        else if (rpp.get(2).equals(cm_1) && rpp.get(4).equals(cm_1) && rpp.get(6).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        else{}
      }
    } 

   // computer goes first
   //int k = 1;
   while (wg == 2 && hp<= 9) { //cg
      if (hp == 0 || hp % 2 == 0) {
        tcc = rand.nextInt(0,8);
        tc = rpp.get(tcc);
        System.out.println();

        if (tc.equalsIgnoreCase("x1") && !x11.equalsIgnoreCase(plm_1)) {
          rpp.remove(0);rpp.add(0,cm_1);
          System.out.println("Computer played : x1 : " + rpp.get(0));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("x2") && !x22.equalsIgnoreCase(plm_1)) {
          rpp.remove(1);rpp.add(1,cm_1);
          System.out.println("Computer played : x2 : " + rpp.get(1));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("x3") && !x33.equalsIgnoreCase(plm_1)) {
          rpp.remove(2);rpp.add(2,cm_1);
          System.out.println("Computer played : x3 : " + rpp.get(2));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("y1") && !y11.equalsIgnoreCase(plm_1)) {
          rpp.remove(3);rpp.add(3,cm_1);
          System.out.println("Computer played : y1 : " + rpp.get(3));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("y2") && !y22.equalsIgnoreCase(plm_1)) {
          rpp.remove(4);rpp.add(4,cm_1);
          System.out.println("Computer played : y2 : " + rpp.get(4));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("y3") && !y33.equalsIgnoreCase(plm_1)) {
          rpp.remove(5);rpp.add(5,cm_1);
          System.out.println("Computer played : y3 : " + rpp.get(5));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("z1") && !z11.equalsIgnoreCase(plm_1)) {
          rpp.remove(6);rpp.add(6,cm_1);
          System.out.println("Computer played : z1 : " + rpp.get(6));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("z2") && !z22.equalsIgnoreCase(plm_1)) {
          rpp.remove(7);rpp.add(7,cm_1);
          System.out.println("Computer played : z2 : " + rpp.get(7));
          hp++;
          chp++;
        }
        else if (tc.equalsIgnoreCase("z3") && !z33.equalsIgnoreCase(plm_1)) {
          rpp.remove(8);rpp.add(8,cm_1);
          System.out.println("Computer played : z3 : " + rpp.get(8));
          hp++;
          chp++;
        }else{
            tcc = rand.nextInt(0,8);
            tc = rpp.get(tcc);
        }

        pk1 = "|    " + rpp.get(0) + "    |" + "    " + rpp.get(1) + "    |" + "    " + rpp.get(2) + "    |";
        pk2 = "|    " + rpp.get(3) + "    |" + "    " + rpp.get(4) + "    |" + "    " + rpp.get(5) + "    |";
        pk3 = "|    " + rpp.get(6) + "    |" + "    " + rpp.get(7) + "    |" + "    " + rpp.get(8) + "    |";

        System.out.println(sk);
        System.out.println(gk);
        System.out.println(pk1);
        System.out.println(gk);
    
        System.out.println(sk);
        System.out.println(gk);
        System.out.println(pk2);
        System.out.println(gk);
    
        System.out.println(sk);
        System.out.println(gk);
        System.out.println(pk3);
        System.out.println(gk);
        System.out.println(sk);

        System.out.println();
        System.out.println("CHP : " + chp);

        // victory conditions for computer.
        //Row
        if (rpp.get(0).equals(cm_1) && rpp.get(1).equals(cm_1) && rpp.get(2).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        else if (rpp.get(3).equals(cm_1) && rpp.get(4).equals(cm_1) && rpp.get(5).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        else if (rpp.get(5).equals(cm_1) && rpp.get(7).equals(cm_1) && rpp.get(8).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        //Colum
        else if (rpp.get(0).equals(cm_1) && rpp.get(3).equals(cm_1) && rpp.get(6).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        else if (rpp.get(1).equals(cm_1) && rpp.get(4).equals(cm_1) && rpp.get(7).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        else if (rpp.get(2).equals(cm_1) && rpp.get(5).equals(cm_1) && rpp.get(8).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        //cross
        else if (rpp.get(0).equals(cm_1) && rpp.get(4).equals(cm_1) && rpp.get(8).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        else if (rpp.get(2).equals(cm_1) && rpp.get(4).equals(cm_1) && rpp.get(6).equals(cm_1)) {
          System.out.println("Computer wines !!!!");
        }
        else{}
      }

      if (hp != 0 || hp % 2 != 0) {
        System.out.println();
        System.out.println("Enter your move : ");
        System.out.println("Your move type : " + plm_1);
        plm = scan.nextLine();
        System.out.println();
      
        if (plm.equalsIgnoreCase("x1") && !x11.equalsIgnoreCase(cm_1)) {
          rpp.remove(0);rpp.add(0,plm_1);
          System.out.println("You played : x1 : " + rpp.get(0));
          hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("x2") && !x22.equalsIgnoreCase(cm_1)) {
          rpp.remove(1);rpp.add(1,plm_1);
          System.out.println("You played : x2 : " + rpp.get(1));
          hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("x3") && !x33.equalsIgnoreCase(cm_1)) {
          rpp.remove(2);rpp.add(2,plm_1);
          System.out.println("You played : x3 : " + rpp.get(2));
          hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("y1") && !y11.equalsIgnoreCase(cm_1)) {
          rpp.remove(3);rpp.add(3,plm_1);
          System.out.println("You played : y1 : " + rpp.get(3));
          hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("y2") && !y22.equalsIgnoreCase(cm_1)) {
          rpp.remove(4);rpp.add(4,plm_1);
          System.out.println("You played : y2 : " + rpp.get(4));
          hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("y3") && !y33.equalsIgnoreCase(cm_1)) {
          rpp.remove(5);rpp.add(5,plm_1);
          System.out.println("You played : y3 : " + rpp.get(5));
          hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("z1") && !z11.equalsIgnoreCase(cm_1)) {
          rpp.remove(6);rpp.add(6,plm_1);
          System.out.println("You played : z1 : " + rpp.get(6));
          hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("z2") && !z22.equalsIgnoreCase(cm_1)) {
          rpp.remove(7);rpp.add(7,plm_1);
          System.out.println("You played : 2z : " + rpp.get(7));
          hp++;
          php++;
        }
        else if (plm.equalsIgnoreCase("z3") && !z33.equalsIgnoreCase(cm_1)) {
          rpp.remove(8);rpp.add(8,plm_1);
          System.out.println("You played : z3 : " + rpp.get(8));
          hp++;
          php++;
        }else{}

        pk1 = "|    " + rpp.get(0) + "    |" + "    " + rpp.get(1) + "    |" + "    " + rpp.get(2) + "    |";
        pk2 = "|    " + rpp.get(3) + "    |" + "    " + rpp.get(4) + "    |" + "    " + rpp.get(5) + "    |";
        pk3 = "|    " + rpp.get(6) + "    |" + "    " + rpp.get(7) + "    |" + "    " + rpp.get(8) + "    |";

        System.out.println(sk);
        System.out.println(gk);
        System.out.println(pk1);
        System.out.println(gk);
    
        System.out.println(sk);
        System.out.println(gk);
        System.out.println(pk2);
        System.out.println(gk);
    
        System.out.println(sk);
        System.out.println(gk);
        System.out.println(pk3);
        System.out.println(gk);
        System.out.println(sk);

        System.out.println();
        System.out.println("PHP : " + php);

        // victory conditions for player.
        //Row
        if (rpp.get(0).equals(plm_1) && rpp.get(1).equals(plm_1) && rpp.get(2).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
        }
        else if (rpp.get(3).equals(plm_1) && rpp.get(4).equals(plm_1) && rpp.get(5).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
        }
        else if (rpp.get(5).equals(plm_1) && rpp.get(7).equals(plm_1) && rpp.get(8).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
        }
        //Colum
        else if (rpp.get(0).equals(plm_1) && rpp.get(3).equals(plm_1) && rpp.get(6).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
        }
        else if (rpp.get(1).equals(plm_1) && rpp.get(4).equals(plm_1) && rpp.get(7).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
        }
        else if (rpp.get(2).equals(plm_1) && rpp.get(5).equals(plm_1) && rpp.get(8).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
        }
        //cross
        else if (rpp.get(0).equals(plm_1) && rpp.get(4).equals(plm_1) && rpp.get(8).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
        }
        else if (rpp.get(2).equals(plm_1) && rpp.get(4).equals(plm_1) && rpp.get(6).equals(plm_1)) {
          System.out.println("Congrats you win !!!!");
        }
        else{}
      }
    }
    
    pk1 = "|    " + rpp.get(0) + "    |" + "    " + rpp.get(1) + "    |" + "    " + rpp.get(2) + "    |";
    pk2 = "|    " + rpp.get(3) + "    |" + "    " + rpp.get(4) + "    |" + "    " + rpp.get(5) + "    |";
    pk3 = "|    " + rpp.get(6) + "    |" + "    " + rpp.get(7) + "    |" + "    " + rpp.get(8) + "    |";
    
    System.out.println(sk);
    System.out.println(gk);
    System.out.println(pk1);
    System.out.println(gk);
    
    System.out.println(sk);
    System.out.println(gk);
    System.out.println(pk2);
    System.out.println(gk);
    
    System.out.println(sk);
    System.out.println(gk);
    System.out.println(pk3);
    System.out.println(gk);
    System.out.println(sk);
    

    System.out.println(tcc);
    
    scan.close();
  }
}
// index index check check put put

