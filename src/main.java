
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
        int number2;
        int number3;
        int number4;
        int number5;
        int number6;
        Scanner fighterscanner = new Scanner(System.in);
        Scanner fighterscanner1 = new Scanner(System.in);
        Scanner fighterscanners2 = new Scanner(System.in);
        // try catch for numbers only 
        number = fighterscanner.nextInt();

        Dkong kong = new Dkong(60, 60, 20);
        Panther panther = new Panther(30, 20, 50);
        CrazyBird bird = new CrazyBird(10, 8, 140);
        Human human = new Human(20, 10, 15);
        Magician magic = new Magician(35, 80, 20);
        superhero hero = new superhero(80, 40, 30);

/////////////////////////////////////////////////////////////////////////////////////////////////////
//CHARACTER SELECTION
        String username = "";

        switch (number) {
            case 1:
                menu.getfighterinfo(kong);
                break;
            case 2:
                menu.getfighterinfo(panther);
                break;
            case 3:
                menu.getfighterinfo(bird);
                break;

            case 4:

                System.out.println("Welcome to the virims ");
                System.out.println("To convert hero press 1 to  magician 2 , keep as human 3");
                number2 = fighterscanner1.nextInt();   //scanner 

                switch (number2) {
                    case 1:
                        menu.getfighterinfo(hero);
                        number = 4;
                        break;
                    case 2:
                        menu.getfighterinfo(magic);
                        number = 5;
                        break;
                    case 3:
                        number = 6;
                        menu.getfighterinfo(human);

                        System.out.println("Would you like to add a weapon?");
                        System.out.println("1 - Yes , 2 - No");
                        number4 = fighterscanner1.nextInt();

                        if (number4 == 1) {

                            System.out.println("Choose your set \n 1- Iron SET \n 2- BlackDragonCrystal SET ");
                            number6 = fighterscanner1.nextInt();
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
                                    System.out.print("\n incorrect");
                                    break;
                            }

                            System.out.println("Your initial stats are ");
                            System.out.println("\n *Color  -" + human.color + "\n *ATK    -" + human.getatk() + "\n *HP     -" + human.gethp() + "\n *Speed  -" + human.getspeed() + "\n *xp     -");
                        } else if (number4 == 2) {
                            System.out.println("\n *Color  -" + human.color + "\n *ATK    -" + human.getatk() + "\n *HP     -" + human.gethp() + "\n *Speed  -" + human.getspeed() + "\n *xp     -");
                        } else {
                        }

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

        number3 = fighterscanners2.nextInt();   //oponent scanner

        switch (number) { ///// switch for your character vs choosen oponent

            case 1:                                //First case DKong                                  // KING KONG
                Dkong kong2 = new Dkong(60, 60, 20);     // IF PICK King Kong in the pass charac selection switch 

                // call print list of fighters 
                switch (number3) {
                    case 1:

                        menu.fig(kong, hero);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (kong.isAlive() == true) {
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            kong = new Dkong(60, 60, 20);
                            menu.bossfight(kong, panther, bird, kong2);
                        } else {
                        }
                        break;

                    case 2:

                        menu.fig(kong, magic);

                        /////////////////////////////////////////////               //////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (kong.isAlive() == true) {
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            kong = new Dkong(60, 60, 20);
                            menu.bossfight(kong, panther, bird, kong2);
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
                            menu.bossfight(kong, panther, bird, kong2);
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
                            bird = new CrazyBird(10, 8, 140);
                            menu.bossfight(kong, panther, bird, kong2);
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
                            menu.bossfight(kong, panther, bird, kong2);
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
                            menu.bossfight(kong, panther, bird, kong2);
                        } else {
                        }
                        break;
                    default:
                        System.out.println("not a valid input");
                }
                break;

            case 2:

                Panther panther2 = new Panther(30, 20, 50);     // IF PICK King Kong in the pass charac selection switch 

                // call print list of fighters 
                switch (number3) {
                    case 1:

                        menu.fig(panther, hero);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (panther.isAlive() == true) {
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");
                            panther = new Panther(30, 20, 50);
                            menu.bossfight(panther, panther2, bird, kong);
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
                            menu.bossfight(panther, panther2, bird, kong);
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
                            menu.bossfight(panther, panther2, bird, kong);
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
                            menu.bossfight(panther, panther2, bird, kong);
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
                            menu.bossfight(panther, panther2, bird, kong);
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
                            menu.bossfight(panther, panther2, bird, kong);
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

            case 5:
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

                            menu.bossfight(magic, panther, bird, kong);
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

                            menu.bossfight(magic, panther, bird, kong); // chek
                        } else {
                        }
                        break;
                    default:
                        System.out.println("not a valid input");
                }
                break;

            case 6:
                System.out.println("Human");
                Human human2 = new Human(human.gethp(), human.getatk(), human.getspeed());
                switch (number3) {
                    case 1:

                        menu.fig(human, hero);

//////////////////////////////////////////////////////////////////////////////////////////////////                       
                        if (human.isAlive() == true) {

                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong");

                            menu.bossfight(human2, panther, bird, kong);
                        } else {
                        }
                        break;

                }
        }
    }
}
