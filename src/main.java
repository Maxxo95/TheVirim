
import Weapon.Shield;
import Weapon.Sword;
import java.util.Scanner;
import Fighters.Dkong;
import Fighters.CrazyBird;
import Fighters.Human;
import Fighters.Panther;
import Fighters.Magician;
import Fighters.superhero;

/**
 *
 * @author maxim
 */
public class main {

    public static void main(String[] args) {

        Menu menu = new Menu();  //create a menu object to help organaize the main code
        menu.firstStep(); // //Take from menu the print for the welcome message in the console

        int number;  //use for scanners
        int number2;
        int number3;
        int number4;
        int number6;

        Scanner fighterscanner = new Scanner(System.in);

        while (true) {     //Loop to pick a main fighter 
            System.out.print("Enter a number (1-4): ");    

            if (fighterscanner.hasNextInt()) { // if is an integer 
                number = fighterscanner.nextInt();

                if (number >= 1 && number <= 4) {
                    break;  // Valid number, exit the loop
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 4.");
                }
            } else { // else is not a int so will make it string
                String invalidInput = fighterscanner.next();
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
            }
        }

        String name; 
        ////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////
 ///Create characters to emulate the fights 
        Dkong kong = new Dkong(60, 60, 20);
        Panther panther = new Panther(30, 20, 50);
        CrazyBird bird = new CrazyBird(10, 8, 140);
        Human human = new Human(20, 10, 15);
        Magician magic = new Magician(35, 80, 20);
        superhero hero = new superhero(80, 40, 30);

/////////////////////////////////////////////////////////////////////////////////////////////////////
//CHARACTER SELECTION switch
        String username = "";   

        switch (number) {  //Swittch for each fighter depend which is picked in the first loop
            case 1:
                menu.getfighterinfo(kong);  //menu get info print and collect name and color info 
                break;
            case 2:
                menu.getfighterinfo(panther);
                break;
            case 3:
                menu.getfighterinfo(bird);
                break;

            case 4:       //Human has 2 subclasses of fighters Super hero & MAgician so here is the loop to pick within inside HUman character
                System.out.println("Welcome to the virims ");  
                System.out.println("To convert to a Supehero press -1, to be a  Magician -2 , Keep been Human 3");
                while (true) {
                    System.out.print("Enter a number (1-3): "); //notice the character where given certain number to match the user choice

                    if (fighterscanner.hasNextInt()) { // if is an integer  
                        number2 = fighterscanner.nextInt(); 

                        if (number2 >= 1 && number2 <= 3) {
                            break;  // Valid number, exit the loop
                        } else {
                            System.out.println("Invalid input. Please enter a number between 1 and 3.");
                        }
                    } else { // else is not a int so will make it string
                        String invalidInput = fighterscanner.next();
                        System.out.println("Invalid input. Please enter a number between 1 and 3.");
                    }
                }

                switch (number2) {  //once the human subclass is picked here is the  info getter for each
                    case 1:
                        menu.getfighterinfo(hero);
                        number = 4;
                        break;
                    case 2:
                        menu.getfighterinfo(magic);
                        number = 5;
                        break;
                    case 3:
                        number = 6;            //FInally Human has a special hability to fight with wepons 
                        
                        menu.getfighterinfo(human); 

                        System.out.println("Would you like to add a weapon?");
                        System.out.println("1 - Yes , 2 - No");

                        while (true) {             //error handler fo user input
                            System.out.print("Enter a number (1-2): ");

                            if (fighterscanner.hasNextInt()) { // if is an integer 
                                number4 = fighterscanner.nextInt();

                                if (number4 >= 1 && number4 <= 2) {
                                    break;  // Valid number, exit the loop
                                } else {
                                    System.out.println("Invalid input. Please enter a number between 1 and 2.");
                                }
                            } else { // else is not a int so will make it string
                                String invalidInput = fighterscanner.next();
                                System.out.println("Invalid input. Please enter a number between 1 and 2.");
                            }
                        }

                        switch (number4) {    // Loop to chek if add weapon goes here if not gopes to else 
                            case 1: // in case a weapon was added
                                System.out.println("Choose your set \n 1- Iron SET \n 2- BlackDragonCrystal SET ");

                                while (true) {
                                    System.out.print("Enter a number (1-2): ");

                                    if (fighterscanner.hasNextInt()) { // if is an integer 
                                        number6 = fighterscanner.nextInt();

                                        if (number6 >= 1 && number6 <= 2) {
                                            break;  // Valid number, exit the loop
                                        } else {
                                            System.out.println("Invalid input. Please enter a number between 1 and 2.");
                                        }
                                    } else { // else is not a int so will make it string
                                        String invalidInput = fighterscanner.next();
                                        System.out.println("Invalid input. Please enter a number between 1 and 2.");
                                    }
                                }

                                switch (number6) {
                                    case 1:
                                        Sword sword = new Sword("IronSword", 30, 0);
                                        Shield shield = new Shield("IronShield", 0, 15);
                                        human.addweapon(sword, human);
                                        human.addweapon(shield, human);

                                        break;

                                    case 2:
                                        Sword dragonsword = new Sword("BlackDragonCrystal Sword", 130, 0);
                                        Shield dragonshield = new Shield("BlackDragonCrystal Shield", 0, 150);
                                        human.addweapon(dragonsword, human);
                                        human.addweapon(dragonshield, human);

                                        break;
                                    default:
                                        System.out.print("\n incorrect no weapon was added");
                                        break;
                                }

                                System.out.println("Your initial stats are ");
                                System.out.println("\n *Color  -" + human.getcolor() + "\n *ATK    -" + human.getatk() + "\n *HP     -" + human.gethp() + "\n *Speed  -" + human.getspeed() + "\n *xp     -");
                                break;
                            case 2:  // didnt add any weapon
                                System.out.println("\n *Color  -" + human.getcolor() + "\n *ATK    -" + human.getatk() + "\n *HP     -" + human.gethp() + "\n *Speed  -" + human.getspeed() + "\n *xp     -");
                                break;
                            default:
                                break;
                        }

                        break;
                    default:
                        System.out.print("invalid");
                        break;
                }
                break; // HUMAN OPTIONS END HERE < HUMAN< MAGICIAN & HERO
            default:     //Character selection end of the character selection switch
                System.out.println("Invalid");
                break;
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        menu.jump(); 
        System.out.println("Welcome to the Arena ");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//OPONENT SELECTION AND FIGHT CASE SCENARIO
        System.out.println(" -" + username + "\npick an oponent and press enter");
        System.out.println(" 1- SuperHero \n 2- Magician \n 3- Panther \n 4- CrazyBird \n 5- Human \n 6- Dkong \n");

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
///
        while (true) {
            System.out.print("Enter a number (1-6): ");

            if (fighterscanner.hasNextInt()) { // if is an integer 

                number3 = fighterscanner.nextInt(); //oponent scanner

                if (number >= 1 && number <= 6) {
                    break;  // Valid number, exit the loop
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 6.");
                }
            } else { // else is not a int so will make it string
                String invalidInput = fighterscanner.next();
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
            }
        }
CrazyBird bird2 = new CrazyBird(10, 8, 140);
        switch (number) { ///// switch for your character vs choosen oponent

            case 1:                                //First case DKong                                  // KING KONG
                Dkong kong2 = new Dkong(60, 60, 20);     // IF PICK King Kong in the pass charac selection switch 
  Panther panther2 = new Panther(30, 20, 50);
      
      
                switch (number3) {
                    case 1:

                        menu.fig(kong, hero);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (kong.isAlive() == true) { // if the fighter is alive allow the change for a bossfight
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            kong = new Dkong(60, 60, 20); //restarting Fighter to fight the boss
                            menu.bossfight(kong, panther2, bird2, kong2);
                        } else {
                        }
                        break;

                    case 2:

                        menu.fig(kong, magic);

/////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (kong.isAlive() == true) {
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            kong = new Dkong(60, 60, 20);
                            menu.bossfight(kong, panther2, bird2, kong2);
                        } else {
                        }
                        break;

                    case 3:

                        menu.fig(kong, panther);

                        /////////////////////////////////////////////               //////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (kong.isAlive() == true) {
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            kong = new Dkong(60, 60, 20);
                            panther = new Panther(30, 20, 50);
                            menu.bossfight(kong, panther2, bird2, kong2);
                        } else {
                        }
                        break;
                    case 4:

                        menu.fig(kong, bird);

                        /////////////////////////////////////////////               //////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (kong.isAlive() == true) {
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            kong = new Dkong(60, 60, 20);
                            bird2 = new CrazyBird(10, 8, 140);
                            menu.bossfight(kong, panther2, bird2, kong2);
                        } else {
                        }
                        break;

                    case 5:

                        menu.fig(kong, human);

                        /////////////////////////////////////////////               //////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (kong.isAlive() == true) {
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            kong = new Dkong(60, 60, 20);
                            menu.bossfight(kong, panther2, bird2, kong2);
                        } else {
                        }
                        break;
                    case 6:

                        menu.fig(kong, kong2);

                        /////////////////////////////////////////////               //////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (kong.isAlive() == true) {
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            kong = new Dkong(60, 60, 20);
                            kong2 = new Dkong(60, 60, 20);
                            menu.bossfight(kong, panther2, bird2, kong2);
                        } else {
                        }
                        break;
                    default:
                        System.out.println("not a valid input");
                }
                break;

            case 2:
              
         panther2 = new Panther(30, 20, 50);     // IF PICK King Kong in the pass charac selection switch 

                // call print list of fighters 
                switch (number3) {
                    case 1:

                        menu.fig(panther, hero);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (panther.isAlive() == true) {
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            panther = new Panther(30, 20, 50);
                            
                            menu.bossfight(panther, panther2, bird2, kong);
                        } else {
                        }
                        break;

                    case 2:

                        menu.fig(panther, magic);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (panther.isAlive() == true) {
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            panther = new Panther(30, 20, 50);
                            menu.bossfight(panther, panther2, bird2, kong);
                        } else {
                        }
                        break;

                    case 3:

                        menu.fig(panther, panther2);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (panther.isAlive() == true) {
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            panther = new Panther(30, 20, 50);
                            panther2 = new Panther(30, 20, 50);
                            menu.bossfight(panther, panther2, bird2, kong);
                        } else {
                        }
                        break;
                    case 4:
                        menu.fig(panther, bird);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (panther.isAlive() == true) {
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            panther = new Panther(30, 20, 50);
                            menu.bossfight(panther, panther2, bird2, kong);
                        } else {
                        }
                        break;

                    case 5:

                        menu.fig(panther, human);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (panther.isAlive() == true) {
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            panther = new Panther(30, 20, 50);
                            menu.bossfight(panther, panther2, bird2, kong);
                        } else {
                        }
                        break;
                    case 6:

                        menu.fig(panther, kong);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (panther.isAlive() == true) {
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            panther = new Panther(30, 20, 50);
                            menu.bossfight(panther, panther2, bird2, kong);
                        } else {
                        }
                        break;
                    default:
                        System.out.println("not a valid input");
                }
                break;
            case 3:
                System.out.println("Crazy Bird");

                break;

            case 4:
                System.out.println("Hero");

                break;

            case 5: // Magician first 3 numbers work 
                switch (number3) {
                    case 1:

                        menu.fig(magic, hero);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (magic.isAlive() == false) {
                            magic.heal(magic, 0);
                            menu.fig(magic, hero);
                        } else {
                        }
                        if (magic.isAlive() == true) {
                            magic = new Magician(35, 80, 20);
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            menu.bossfight(magic, panther, bird2, kong);
                        } else {
                        }
                        break;
                    case 2:
                        Magician magic2 = new Magician(35, 80, 20);
                        menu.fig(magic, magic2);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (magic.isAlive() == false) {
                            magic.heal(magic, 0);
                            menu.fig(magic, magic2);
                        } else {
                        }

                        if (magic.isAlive() == true) {
                            magic = new Magician(35, 80, 20);

                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");

                            menu.bossfight(magic, panther, bird2, kong); // chek
                        } else {
                        }
                        break;
                    case 3:

                        menu.fig(magic, panther);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (magic.isAlive() == false) {
                            magic.heal(magic, 0);
                            menu.fig(magic, panther);
                        } else {
                        }

                        if (magic.isAlive() == true) {
                            magic = new Magician(35, 80, 20);
                            panther = new Panther(30, 20, 50);
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");

                            menu.bossfight(magic, panther, bird2, kong); // chek
                        } else {
                        }
                        break;
                    case 4:

                        menu.fig(magic, bird);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (magic.isAlive() == false) {
                            magic.heal(magic, 0);
                            menu.fig(magic, bird);
                        } else {
                        }

                        if (magic.isAlive() == true) {
                            magic = new Magician(35, 80, 20);
                            bird = new CrazyBird(10, 8, 140);
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");

                            menu.bossfight(magic, panther, bird2, kong); // chek
                        } else {
                        }
                        break;
                    case 5:

                        menu.fig(magic, human);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (magic.isAlive() == false) {
                            magic.heal(magic, 0);
                            menu.fig(magic, human);
                        } else {
                        }

                        if (magic.isAlive() == true) {
                            magic = new Magician(35, 80, 20);
                            human = new Human(20, 10, 15);
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");

                            menu.bossfight(magic, panther, bird2, kong); // chek
                        } else {
                        }
                        break;
                    case 6:

                        menu.fig(magic, kong);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (magic.isAlive() == false) {
                            magic.heal(magic, 0);
                            menu.fig(magic, kong);
                        } else {
                        }

                        if (magic.isAlive() == true) {
                            magic = new Magician(35, 80, 20);
                            kong = new Dkong(60, 60, 20);
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");

                            menu.bossfight(magic, panther, bird2, kong); // chek
                        } else {
                        }
                        break;

                    default:
                        System.out.println("not a valid input");
                }
                break;

            case 6: //HUMAN ONLY HERO WORKS

                Human human2 = new Human(human.gethp(), human.getatk(), human.getspeed());
                switch (number3) {
                    case 1:

                        menu.fig(human, hero);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (human.isAlive() == true) {

                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");

                            menu.bossfight(human2, panther, bird2, kong); // human 2 call another human created depending of what weapon choice 
                            //was made with the same stats , as human get changed after performing the battle 1
                        } else {
                        }
                        break;
                    default:
                        System.out.println("Only hero test for human");
                        break;
                }
        }
    }
}
