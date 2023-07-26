
import java.util.Scanner;
import Fighters.Fighters;
import Fighters.Panther;
import Fighters.CrazyBird;
import Fighters.Dkong;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author maxim
 */
public class Menu {             //menu is a classs that i create to manage the main and organaize my code better 
  int lvl;  
    void firstStep() {
        System.out.println("WELCOME TO THE VIRIMS -Animal Kindomg edition- prepare to fight");

        System.out.println("-----------------------------------------\n"
                + "|           1- D.Kong                   |\n"
                + "|           2- Panther                   |\n"
                + "|           3- CrazyBird                 |\n"
                + "|           4- Human                     |\n"
                + "|                                        |\n"   
                + "|  D.kong, Panther & Magician            |\n"
                + "|  Fully functional                      |\n"                
                + "|                                        |\n"  
                + "| Human only works vs hero               |\n"  
                + "| Crazy B & Hero future develop          |\n"  
                + "-----------------------------------------");

        System.out.println("Enter the number of the class you would like to be ");
    }

    void getfighterinfo(Fighters userfighter) { 
        userfighter.setName(userfighter.getName());
        userfighter.setColor(userfighter.getColor());
        System.out.println("\nWelcome to THE VIRIMS " + userfighter.getname());
        System.out.println("Your initial stats are ");
        System.out.println(" \n *Color  -" + userfighter.getcolor() + "\n *ATK    -" + userfighter.getatk() + "\n *HP     -" + userfighter.gethp() + "\n *Speed  -" + userfighter.getspeed() + "\n *xp     -" );
    }

    void jump() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }

    void fig(Fighters fig, Fighters riv) {  //recreate a fight within the cvharacters picked 

        fig.start(fig, riv);
        riv.start(riv, fig);
        while (fig.isAlive() && riv.isAlive()) {

            fig.turn(riv.speed, riv, fig, riv.atk, riv.hp);
        }
        if (fig.gethp() < 0) {
            System.out.println("Rival WINS");
        } else {
            System.out.println("YOU WIN \n");
        }

        // call print list of fighters 
    }
    

     int number5;
        void bossfight(Fighters myfig, Panther panther, CrazyBird bird, Dkong kong2) {    
             
            Scanner fighterscanners2 = new Scanner(System.in);
            
               while (true) {
            System.out.print("Enter a number (1-3): ");

            if (fighterscanners2.hasNextInt()) { // if is an integer 
                
   number5 = fighterscanners2.nextInt(); //oponent scanner

                if (number5 >= 1 && number5 <= 3) {
                    break;  // Valid number, exit the loop
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 3.");
                }
            } else { // else is not a int so will make it string
                String invalidInput = fighterscanners2.next();
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
            }
        }



            
           
                            
                        switch (number5) {
                            case 1:
                           
                                myfig.start(myfig, panther);
                                panther.start(panther, myfig);
                                panther.bossconvertion(panther , lvl);
                                while (myfig.isAlive() && panther.isAlive()) {

                                    myfig.turn(panther.speed, panther, myfig, panther.getatk(), panther.hp);
                                }

                                if (myfig.isAlive() == false) {
                                    System.out.println("BossPanther WINS");
                                } else {
                                    System.out.println("YOU WIN");

                                }
                                break;
                            case 2:
                            
                                myfig.start(myfig, bird);
                                bird.start(bird, myfig);
                                bird.bossconvertion(bird , lvl);
                                while (myfig.isAlive() && bird.isAlive()) {

                                    myfig.turn(bird.speed, bird, myfig, bird.getatk(), bird.hp);

                                }

                                if (myfig.isAlive() == false) {
                                    System.out.println("BossCrazyBird WINS");
                                } else {
                                    System.out.println("YOU WIN");
                                }
                                break;
                            case 3:
                                 
                                myfig.start(myfig, kong2);
                                kong2.start(kong2, myfig);
                                kong2.bossconvertion(kong2 , lvl);
                                while (myfig.isAlive() && kong2.isAlive()) {

                                    myfig.turn(kong2.speed, kong2, myfig, kong2.getatk(), kong2.hp);

                                }

                                if (myfig.isAlive() == false) {
                                    System.out.println("Boss DKong WINS");
                                } else {
                                    System.out.println("YOU WIN");
                                }
                                break;
                            default:
                                System.out.print("invalid");
                                break;
}
        }
}