/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxim
 */


// classes can apply more thjan one interface, inheritance is limited to 1 super 
public interface Fight  {
    // Define the interface for a character
    void turn (int speed, Fighters oponent, Fighters myfig, int atk,int hp);
    void attack(Fighters opponent);
    void takeDamage(int damage);
    boolean isAlive();
}


/*
public class Panther implements Character {
    // Implement the methods defined in the Character interface
    // ...
}




        // Simulate a fight
        while (kong.isAlive() && panther.isAlive()) {
            kong.attack(panther);
            if (panther.isAlive()) {
                panther.attack(kong);
            }
        }

        // Determine the winner
        if (kong.isAlive()) {
            System.out.println("D.Kong wins!");
        } else if (panther.isAlive()) {
            System.out.println("Panther wins!");
        } else {
            System.out.println("It's a draw!");
        }






    }*/


