/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author maxim
 */                                                      // AS many implements as you want only one extend
public class Dkong extends Fighters implements  BossInterface {

    String name = "Dkong";
    String color = "grey";
    int atk ;
    int hp ;
    int speed ;
    int xp = 0;
    int gold = 0;

   

    @Override
   public String getName() {
        try {
            Scanner scanners = new Scanner(System.in);
            System.out.println("Enter the name of your D.kong");
            name = scanners.nextLine();

            ///// still have to know for what errors   
        } catch (Exception e) {
            System.out.println("You disoveid the rules");
        }

        return name;
    }
    @Override
    public String getname(){
    return name;
}
    
   @Override
    public String getcolor(){
    return color;
}

    @Override
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

  public Dkong(int hp, int atk, int speed) {
        super(hp, atk, speed);
        // other initialization code for Dkong
   
  this.setName(name);
  this.setColor(color);
  }  

  int lvl;
  


 
    int hptemp;
    private int vsturn = 0 ;
   private int turn  = 0 ;
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
