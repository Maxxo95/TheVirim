
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
public class Panther extends Fighters implements Fight {

    String name = "Panther";
    String color = "Black";
    int atk ;
    int hp ;
    int speed ;
    int xp = 0;
    int gold = 0;

    String getName() {
        try {
            Scanner scanners = new Scanner(System.in);
            System.out.println("Enter the name of your Panther");
            name = scanners.nextLine();

            ///// still have to know for what errors   
        } catch (Exception e) {
            System.out.println("You disoveid the rules");
        }

        return name;
    }

    public void setName(String name) { //it takes the value from somwhere else

        this.name = name;
    }

    String getColor() {
        try {
            Scanner scanners = new Scanner(System.in);
            System.out.println("Enter the color of " + name);
            color = scanners.nextLine();

        } catch (Exception e) {
            System.out.println("You disoveid the rules");
        }

        return color;
    }

    public void setColor(String color) { //it takes the value from somwhere else

        this.color = color;
    }

/*
    public Integer getatk() {
        return atk;
    }

    public void setatk(int atk) {
        this.atk = atk;
    }

    public Integer gethp() {
        return hp;
    }

    public void sethp(int hp) {
        this.hp = hp;
    }

    public Integer getspeed() {
        return speed;
    }

    public void setspeed(int speed) {
        this.speed = speed;
    }
*/
    public Integer getxp() {
        return xp;
    }

    public void setxp(int xp) {
        this.xp = xp;
    }

    public Integer getgold() {
        return gold;
    }

    public void setgold(int xp) {
        this.xp = xp;
    }

  public Panther(int hp, int atk, int speed) {
        super(hp, atk, speed);
        // other initialization code for Dkong
   
  
  this.setName(name);
  this.setColor(color);
  }  





 
    int hptemp;
    private int vsturn ;
   private int turn  ;
    int playerhp  ;
    int rivalhp;
    int rivalspeed;
    int speedtemp;
    int playeratk  ;
    int rivalatk;

        @Override
    public void start(Fighters player, Fighters oponent) {
    playerhp = player.gethp() ;
    rivalhp = oponent.gethp();
     speedtemp = player.getspeed() ;
    rivalspeed = oponent.getspeed();  
    playeratk = player.getatk() ;
    rivalatk = oponent.getatk();
  
    if(vsturn == 0 && turn ==0){
    turn = speedtemp;
    vsturn = rivalspeed;
     
    
    }
    else{}
    }
    
  
    
    @Override
    public void turn(int speed, Fighters oponent, Fighters myfig, int atk, int hp) {

        if (vsturn > turn) {           
            System.out.println(this.name + " is taking damage");
            myfig.takeDamage(myfig, oponent.getatk());
            turn += speedtemp;
           
             System.out.println(" Your turn count is: " + (turn) + " riv turn count is " + vsturn);
        } else {
            System.out.println(" The Rival is taking damage");
            oponent.takeDamage(oponent, playeratk);
            vsturn += oponent.getspeed();
            
             System.out.println(" Your turn count is: " + (turn) + " riv turn count is " + vsturn);
        }
    }
   
    @Override
    public void takeDamage(Fighters target, int atk) {

        System.out.println(this.name + " has " + target.gethp() + " life points");
        playerhp = target.gethp();
        playerhp -= atk;        
        target.sethp(playerhp);
        System.out.println("   After the atack you have left " + playerhp + " points");
       
        
        
        }
        
    
   
 /*       @Override
    public void rivtakeDamage(int atk, int hp, int speed) {

        System.out.println(this.name + " has " + hp + " life points");
        rivalhp -= atk;
        System.out.println("   After the atack you have left " + rivalhp + " points");
       vsturn += rivalspeed;
        System.out.println(" Your turn count is: " + (turn) + " \n Rivals turn count is: " + vsturn);

            if (rivalhp <= 0) {
           rivalhp=(0);
        } else {
        }
    } */

    @Override
    public boolean isAlive() {
        // Implement the logic to check if Dkong is alive
        return playerhp > 0;
    }
    
  /*   @Override
    public boolean opAlive() {
        // Implement the logic to check if Dkong is alive
        return rivalhp > 0;
    }
*/

    @Override
    public void heal(Fighters target, int amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
