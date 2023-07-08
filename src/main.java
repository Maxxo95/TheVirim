
import java.util.Scanner;

/**
 *
 * @author maxim
 */
public class main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.firstStep();

        int number;
        int number2 = 0;
        int number3;

        Scanner fighterscanner = new Scanner(System.in);
        Scanner fighterscanner1 = new Scanner(System.in);
        Scanner fighterscanners2 = new Scanner(System.in);
        // try catch for numbers only 
        number = fighterscanner.nextInt();

        Dkong kong = new Dkong(160, 60, 20);
        Panther panther = new Panther(30, 20, 50);
        CrazyBird bird = new CrazyBird(10, 8, 180);
        Human human = new Human(20, 10, 15);
        Magician magic = new Magician(35, 80, 20);
        superhero hero = new superhero(80, 40, 30);

/////////////////////////////////////////////////////////////////////////////////////////////////////
//CHARACTER SELECTION
        String username = "";
        String color = "";

        switch (number) {
            case 1:
                kong.getName();
                kong.getColor();
                username = kong.name;
                color = kong.color;
                System.out.println("Welcome to THE VIRIMS " + kong.name);
                System.out.println("Your initial stats are ");
                System.out.println("\n *Class - Dkong" + " \n *Color  -" + kong.color + "\n *ATK    -" + kong.getatk() + "\n *HP     -" + kong.gethp() + "\n *Speed  -" + kong.getspeed() + "\n *xp     -" + kong.xp);

                break;
            case 2:
                panther.getName();
                panther.getColor();
                username = panther.name;
                color = panther.color;
                System.out.println("Welcome to the virims " + panther.name);
                System.out.println("Your initial stats are ");
                System.out.println("\n *Class - Panther" + "\n *Color  -" + panther.color + "\n *ATK    -" + panther.atk + "\n *HP     -" + panther.hp + "\n *Speed  -" + panther.speed + "\n *xp     -" + panther.xp);
                break;
            case 3:
                bird.getName();
                bird.getColor();
                username = bird.name;
                color = bird.color;
                System.out.println("Welcome to the virims " + bird.name);
                System.out.println("Your initial stats are ");
                System.out.println("\n *Color  -" + bird.color + "\n *ATK    -" + bird.atk + "\n *HP     -" + bird.hp + "\n *Speed  -" + bird.speed + "\n *xp     -" + bird.xp);
                break;

            case 4:
                
                human.setName(username);
                color = human.color;
                System.out.println("Welcome to the virims " );
             //   System.out.println("Your initial stats are ");
              //  System.out.println("\n *Color  -" + human.color + "\n *ATK    -" + human.getatk() + "\n *HP     -" + human.gethp() + "\n *Speed  -" + human.getspeed() + "\n *xp     -" );
                System.out.println("To convert hero press 1 to  magician 2 , keep as human 3");
                number2 = fighterscanner1.nextInt();   //scanner 
                switch (number2) {
                    case 1:
// NMAYBE THE ERROR ON THE FIGHT IS HERE BUT HAVE TO FIX HERO PART OF HUMAN CAUSE HP KEEPS BEEN STATIC FOR HERO AND MAGIC 
//BUT  WORKS WITH OTHERS
                        
                       hero.getName();
                       System.out.println("Your initial stats are ");
                        System.out.println("\n *Color  -" + hero.getColor() + "\n *ATK    -" + hero.getatk() + "\n *HP     -" + hero.gethp() + "\n *Speed  -" + hero.getspeed() + "\n *xp     ");
                        break;
                    case 2:
                           magic.getName();
                         System.out.println("Your initial stats are ");  
 System.out.println("\n *Color  -" + magic.getColor() + "\n *ATK    -" + magic.getatk() + "\n *HP     -" + magic.gethp() + "\n *Speed  -" + magic.getspeed() + "\n *xp     ");
                        break;
                    case 3:
                        human.getName();
                         human.setName(username);
                         System.out.println("Your initial stats are ");
               System.out.println("\n *Color  -" + human.color + "\n *ATK    -" + human.getatk() + "\n *HP     -" + human.gethp() + "\n *Speed  -" + human.getspeed() + "\n *xp     -" );
                        break;
                    default:
                        System.out.print("invalid");
                        break;
                }
                break;
            default:
                System.out.println("Invalid");
                break;
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //// MAYBE WE CAN MOVE ALL THIS DOWN INSIDE THE MAIN SWITCH INSIDE OR ABOIVE THIS  

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
        System.out.println("Welcome to the Arena ");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//OPONENT SELECTION AND FIGHT CASE SCENARIO
        switch (number) {
            case 1:
                // IF PICK King Kong in the pass charac selection switch

                System.out.println(" -" + username + "\npick an oponent and press enter");
                System.out.println(" 1- SuperHero \n 2- Magician \n 3- Panther \n 4- CrazyBird \n 5- Human \n \n");
                for (int i = 0; i < 10; i++) {
                    System.out.println();
                }
                // call print list of fighters 
                number3 = fighterscanners2.nextInt();

                switch (number3) {
                    case 1:
                        kong.start(kong, hero);
                        hero.start(hero, kong);
                        while (kong.isAlive() && hero.isAlive()) {

                            kong.turn(hero.speed, hero, kong, hero.atk, hero.hp);
                        }
                       if (kong.gethp() < 0) {
                            System.out.println("Hero WINS");
                        } else {
                            System.out.println("you win");

                        }
                        break;
                    case 2:
                        kong.start(kong, magic);
                        magic.start(magic, kong);
                       

       System.out.println(" Your turn count is: " + (kong.getspeed()) + " riv turn count is " + magic.getspeed());
                        while (kong.isAlive() && magic.isAlive()) {

                            kong.turn(magic.speed, magic, kong, magic.getatk(), magic.hp);
                            magic.heal(magic, 0);
                            
                        }
   
                        
                        if (kong.gethp() < 0) {
                            System.out.println("Magician WINS");
                        } else {
                            System.out.println("YOU WIN");

                        }
                        break;
                    case 3:
                        kong.start(kong, panther);
                        panther.start(panther, kong);
                        while (kong.isAlive() && panther.isAlive()) {

                            kong.turn(panther.speed, panther, kong, panther.getatk(), panther.hp);
                        }

                        if (kong.gethp() < 0) {
                            System.out.println("Panther WINS");
                        } else {
                            System.out.println("YOU WIN");

                        }
                        break;
                    case 4:
                        kong.start(kong, bird);
                        bird.start(bird, kong);
                        while (kong.isAlive() && bird.isAlive()) {

                            kong.turn(bird.speed, bird, kong, bird.getatk(), bird.hp);
                        }

                        if (kong.gethp() < 0) {
                            System.out.println("CrazyBird WINS");
                        } else {
                            System.out.println("YOU WIN");

                        }
                        break;
                    case 5:
                        kong.start(kong, human);
                        human.start(human, kong);
                        while (kong.isAlive() && human.isAlive()) {

                            kong.turn(human.speed, human, kong, human.getatk(), human.hp);
                        }

                        if (kong.gethp() < 0) {
                            System.out.println("Human WINS");
                        } else {
                            System.out.println("YOU WIN");

                        }
                        break;
                    default:
                        System.out.print("invalid");
                        break;
                }
                break;
/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////

            case 2:
                // IF PICK King Kong in the pass charac selection switch

                System.out.println(" -" + username + "\npick an oponent and press enter");
                System.out.println(" 1- SuperHero \n 2- Magician \n 3- Dkong \n 4- CrazyBird \n 5- Human \n \n");
                for (int i = 0; i < 10; i++) {
                    System.out.println();
                }
                // call print list of fighters 
                number3 = fighterscanners2.nextInt();

                switch (number3) {
                    case 1:
                        panther.start(panther, hero);
                        hero.start(hero, panther);
                        while (panther.isAlive() && hero.isAlive()) {

                            panther.turn(hero.speed, hero, panther, hero.atk, hero.hp);
                        }
                                      if (panther.gethp() < 0) {
                            System.out.println("Hero WINS");
                        } else {
                            System.out.println("You win");

                        }
                        break;
                    case 2:
                        panther.start(panther, magic);
                        magic.start(magic, panther);
                         System.out.println(" Your turn count is: " + (panther.getspeed()) + " riv turn count is " + magic.getspeed());
                        while (panther.isAlive() && magic.isAlive()) {

                           
                            panther.turn(magic.speed, magic, panther, magic.atk, magic.hp);
                            
                            if(magic.gethp()<0){
                               magic.heal(magic, 0);}
                            else{}
                        }
                                     if (panther.gethp() < 0) {
                            System.out.println("MAGICIAN WINS");
                        } else {
                            System.out.println("You win");

                        }
                        break;
                    case 3:
                        panther.start(panther, kong);
                        kong.start(kong, panther);
                        while (panther.isAlive() && kong.isAlive()) {

                            panther.turn(kong.speed, kong, panther, kong.atk, kong.hp);
                        }
                        if (panther.gethp() < 0) {
                            System.out.println("DKong WINS");
                        } else {
                            System.out.println("You win");

                        }
                        break;
                    case 4:
                          panther.start(panther, bird);
                        bird.start(bird, panther);
                        while (panther.isAlive() && bird.isAlive()) {

                            panther.turn(bird.speed, bird, panther, bird.atk, bird.hp);
                        }
                                     if (panther.gethp() < 0) {
                            System.out.println("CrazyBird WINS");
                        } else {
                            System.out.println("You win");

                        }
                        break;
                    case 5:
                         panther.start(panther, human);
                        human.start(human, panther);
                        while (panther.isAlive() && human.isAlive()) {

                            panther.turn(human.speed, human, panther, human.atk, human.hp);
                        }
                                      if (panther.gethp() < 0) {
                            System.out.println("HUMAN WINS");
                        } else {
                            System.out.println("You win");

                        }
                    default:
                        System.out.print("invalid");
                        break;
                }
                break;
            ////////////////////////////////////////////////////////////////////////////////

            case 3:
                // IF PICK CrazyBird in the pass charac selection switch

                System.out.println(" -" + username + "\npick an oponent and press enter");
                System.out.println(" 1- Dkong \n 2- Magician \n 3- Panther \n 4- CrazyBird \n 5- Human \n \n");
                for (int i = 0; i < 10; i++) {
                    System.out.println();
                }       // call print list of fighters 
                Scanner fighterscanners = new Scanner(System.in);
                number3 = fighterscanners.nextInt();
                switch (number3) {
                    case 1:

                        while (kong.isAlive() && hero.isAlive()) {

                            kong.turn(hero.speed, hero, kong, hero.atk, hero.hp);
                        }
                        if (kong.hp == 0) {
                            System.out.println("Hero WINS");
                        } else {
                            System.out.println("you win");

                        }
                        break;
                    case 2:

                        while (kong.isAlive() && magic.isAlive()) {

                            kong.turn(magic.speed, magic, kong, magic.atk, magic.hp);
                        }
                        if (kong.hp == 0) {
                            System.out.println("Magician WINS");
                        } else {
                            System.out.println("you win");

                        }
                        break;
                    case 3:
                        while (kong.isAlive() && panther.isAlive()) {

                            kong.turn(panther.speed, panther, kong, panther.atk, panther.hp);
                        }
                        if (kong.hp == 0) {
                            System.out.println("Panther WINS");
                        } else {
                            System.out.println("YOU WIN");

                        }
                        break;
                    case 4:
                        while (kong.isAlive() && bird.isAlive()) {

                            kong.turn(bird.speed, bird, kong, bird.atk, bird.hp);
                            //bird.turn(kong.speed, kong, bird, kong.atk, kong.hp);
                        }
                        if (kong.hp == 0) {
                            System.out.println("Crazy Bird WINS");
                        } else {
                            System.out.println("YOU WIN");

                        }
                        break;
                    case 5:
                        while (kong.isAlive() && human.isAlive()) {

                            kong.turn(human.speed, human, kong, human.atk, human.hp);
                        }
                        if (kong.hp == 0) {
                            System.out.println("Crazy Bird WINS");
                        } else {
                            System.out.println("YOU WIN");

                        }
                        break;

                    default:
                        System.out.print("invalid");
                        break;
                }
                break;
            default:
                System.out.println("developing");
                break;
        }
    }
}
