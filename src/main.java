
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

        Scanner fighterscanner = new Scanner(System.in);

        // try catch for numbers only 
        number = fighterscanner.nextInt();

        Dkong kong = new Dkong();
        switch (number) {
            case 1:
                kong.getName();
                kong.getColor();
                System.out.println("Welcome to the virims " + kong.name);
                System.out.println("Your initial stats are ");
                System.out.println("\n *Color  -" + kong.color + "\n *ATK    -" + kong.atk + "\n *HP     -" + kong.hp + "\n *Speed  -" + kong.speed + "\n *xp     -"+ kong.xp);
                break;
            case 2:

                break;
            case 3:

                break;
            default:

                break;
        }

    }
}


