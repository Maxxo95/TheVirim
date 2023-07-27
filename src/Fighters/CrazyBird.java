/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fighters;


import Interfaces.BossInterface;
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
public class CrazyBird extends Fighters implements  BossInterface {
  public    String name = "CrazyBird";
 public String color = "Yellow";
 public int atk ;
 public int hp ;
 public int speed;
 public int xp = 0; 
 public int gold = 0; 



    
   @Override
    public String getcolor(){
    return color;
}

    @Override
     public String getColor() {
        try {
            Scanner scanners = new Scanner(System.in);
            System.out.println("Enter the color of " + name);
            color = scanners.nextLine();

        } catch (Exception e) {
            System.out.println("You disoveid the rules");
        }

        return color;
    }
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

  public CrazyBird(int hp, int atk, int speed) {
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
            
            System.out.println("\n"+myfig.getname() + " is taking damage");
            myfig.takeDamage(myfig, oponent.getatk());
            turn += speedtemp;
           
             System.out.println("Your turn count is: " + (turn) + " rival turn count is " + vsturn);
        } else {
            System.out.println("\n"+oponent.getname() +" is taking damage");
            oponent.takeDamage(oponent, playeratk);
            vsturn += oponent.getspeed();
            
             System.out.println("Your turn count is: " + (turn) + " rival turn count is " + vsturn);
        }
    }
   
    @Override
    public void takeDamage(Fighters target, int atk) {

        System.out.println(this.name + " has " + target.gethp() + " life points");
        playerhp = target.gethp();
        playerhp -= atk;        
        target.sethp(playerhp);
        System.out.println("  After the atack you have left " + playerhp + " points");
       
        
        
        }
        
        
    
  

    @Override
    public boolean isAlive() {
        // Implement the logic to check if Dkong is alive
        return playerhp > 0;
    }

    
int bosslvl= 1;
    @Override
    public void bossconvertion(Fighters target, int lvl) {
      
      bosslvl++;
      target.sethp(target.gethp()*bosslvl);
          target.setatk(target.getatk()*bosslvl);
            target.setspeed(target.getspeed()*bosslvl);
    }
    

}
