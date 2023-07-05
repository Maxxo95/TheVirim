
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author maxim
 */
public class main {

    public static void main(String[] args) {

        System.out.println("WELCOME TO THE VIRIMS -Animal Kindomg edition- prepare to fight");
        System.out.println("Select your class number");
        System.out.println("-----------------------------------------\n"
                + "|           1- D.Kong                   |\n"
                + "|           2- Panther                   |\n"
                + "|           3- CrazyBird                 |\n"
                + "|           4- Elephant                  |\n"
                + "|           5- Human                     |\n"
                + "-----------------------------------------");

        int number;
        int number2 = 0;
        int number3;
        Scanner fighterscanner = new Scanner(System.in);
        // try catch for numbers only 
        number = fighterscanner.nextInt();

        Dkong kong = new Dkong();
        Panther panther = new Panther();
        CrazyBird bird = new CrazyBird();
        Elephant eleph = new Elephant();
        Human human = new Human();

        switch (number) {
            case 1:
                kong.getName();
                kong.getColor();
                System.out.println("Welcome to the virims " + kong.name);
                System.out.println("Your initial stats are ");
                System.out.println("\n *Color  -" + kong.color + "\n *ATK    -" + kong.atk + "\n *HP     -" + kong.hp + "\n *Speed  -" + kong.speed + "\n *xp     -" + kong.xp);

                break;
            case 2:
                panther.getName();
                panther.getColor();
                System.out.println("Welcome to the virims " + panther.name);
                System.out.println("Your initial stats are ");
                System.out.println("\n *Color  -" + panther.color + "\n *ATK    -" + panther.atk + "\n *HP     -" + panther.hp + "\n *Speed  -" + panther.speed + "\n *xp     -" + panther.xp);
                break;
            case 3:
                bird.getName();
                bird.getColor();
                System.out.println("Welcome to the virims " + bird.name);
                System.out.println("Your initial stats are ");
                System.out.println("\n *Color  -" + bird.color + "\n *ATK    -" + bird.atk + "\n *HP     -" + bird.hp + "\n *Speed  -" + bird.speed + "\n *xp     -" + bird.xp);
                break;
            case 4:
                eleph.getName();
                eleph.getColor();
                System.out.println("Welcome to the virims " + eleph.name);
                System.out.println("Your initial stats are ");
                System.out.println("\n *Color  -" + eleph.color + "\n *ATK    -" + eleph.atk + "\n *HP     -" + eleph.hp + "\n *Speed  -" + eleph.speed + "\n *xp     -" + eleph.xp);
                break;
            case 5:
                human.getName();
                human.getColor();
                System.out.println("Welcome to the virims " + human.name);
                System.out.println("Your initial stats are ");
                System.out.println("\n *Color  -" + human.color + "\n *ATK    -" + human.atk + "\n *HP     -" + human.hp + "\n *Speed  -" + human.speed + "\n *xp     -" + human.xp);
                System.out.println("convert hero 1 or magician 2 , keep as human 3");
                number2 = fighterscanner.nextInt();   //scanner 
                switch (number2) {
                    case 1:
                        superhero hero = new superhero(human.name, human.color);
                        System.out.println("\n *Color  -" + hero.color + "\n *ATK    -" + hero.atk + "\n *HP     -" + hero.hp + "\n *Speed  -" + hero.speed + "\n *xp     -" + hero.xp);
                        break;
                    case 2:
                        Magician magic = new Magician(human.name, human.color);
                        System.out.println("\n *Color  -" + magic.color + "\n *ATK    -" + magic.atk + "\n *HP     -" + magic.hp + "\n *Speed  -" + magic.speed + "\n *xp     -" + magic.xp);
                        break;
                    case 3:
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

        //// MAYBE WE CAN MOVE ALL THIS DOWN INSIDE THE MAIN SWITCH INSIDE OR ABOIVE THIS  
        System.out.println("Welcome to the Arena  we introduce our fighters: \n" + kong.name + "\n" + panther.name + "\n" + bird.name + "\n" + eleph.name + "\n" + human.name);

        
        
        if (number == 1) {
            System.out.println("1");
            System.out.println("pick oponent");
            // call print list of fighters 
            Scanner fighterscanners = new Scanner(System.in);
            number3 = fighterscanners.nextInt();
            System.out.println(number3);
            switch (number3) {
                case 1:
                    superhero hero = new superhero(human.name, human.color);

                    while  (kong.hp > 0 && hero.hp != 0) {
                        kong.turn(hero.speed, hero, kong, hero.atk, hero.hp);
                    }
                   if (kong.hp == 0){
                       System.out.println("Hero WINS");
                   }
                   else{
                       System.out.println("you win");
                   }
                    break;
                case 2:
                    Magician magic = new Magician(human.name, human.color);

                    break;
                case 3:
                    break;
                default:
                    System.out.print("invalid");
                    break;
            }

        } else if (number == 2) {
            System.out.println("2");
        } else if (number == 3) {
            System.out.println("3");
        } else if (number == 4) {
            System.out.println("4");
        } else {
            if (number2 == 1) {

            } else if (number2 == 2) {

            } else {

            }
        }

    }
}
