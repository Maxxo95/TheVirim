/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxim
 */

    public class Magician extends Human implements Fight {
    int atk;
    int hp;
    int speed;

    public Magician(String name, String color) {
        super(name, color);
        this.atk = 80;
        this.hp = 35;
        this.speed = 15;
    }
    

int rivturn = 1;
    int hptemp;
    int vsturn =0;
    int turn = 0;
    double hpcount = 0.5;
     int rivalhp ;
     int rivalspeed;
     int speedtemp;
     
    @Override
    public void takeDamage(int atk, int hp, int speed) {
        
            System.out.println(this.name + " has "+ hp + " life points");
            hp -= atk;
            System.out.println("   After the atack you have left " + hp + " points");
           hptemp = hp;
            turn += speedtemp;
            System.out.println(" Your turn count is: " + (turn) + " \n Rivals turn count is: " + vsturn);
            
            if (hptemp <= 0) {
                this.sethp(0);
            } else {
            }
        
    
    }
    @Override
    public boolean isAlive() {
        // Implement the logic to check if Dkong is alive
        return this.hp > 0;
    }

    @Override
    public void turn(int speed, Fighters oponent, Fighters myfig, int atk, int hp) {

    if (turn == 0 && vsturn == 0 ){
         hptemp = this.hp;
         rivalhp = hp;
         speedtemp = this.speed;
         rivalspeed = speed;
         turn = this.speed;
          vsturn = speed;
    }else{
        
    }
    
     if (vsturn > turn) {
            System.out.println(this.name + " is taking damage");
            myfig.takeDamage(atk, hptemp, rivalspeed);
     }
     else {
 System.out.println( " The Rival is taking damage");
            oponent.takeDamage(this.atk, rivalhp, this.speed);
     }
        
        
  /*      
        
        if (rivturn == 1 && turn == this.speed) {
            rivturn += speed;
        } else {
        }

        if (rivturn > turn) {
            System.out.println("Oponents Atack");
            myfig.takeDamage(atk, this.hp, speed);
            turn += this.speed;

        } else if (turn > rivturn) {
            System.out.println("My attack");
            oponent.takeDamage(this.atk, hp, this.speed);

            rivturn += speed;

        */
        }
    

    @Override
    public void start(int speed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
