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
    
  String name = "Magician";
    String color = "Purple";
    int atk ;
    int hp ;
    int speed ;
    int xp = 0;
    int gold = 0;

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

  public Magician(int hp, int atk, int speed) {
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
     //  System.out.println(" Your turn count is: " + (turn) + " riv turn count is " + vsturn);
    
    }}
    
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
        return this.gethp() > 0;
    }
    
  /*   @Override
    public boolean opAlive() {
        // Implement the logic to check if Dkong is alive
        return rivalhp > 0;
    }
*/
int healcount = 1;
    @Override
    public void heal(Fighters target, int amount) {
       if( healcount > 0) {
           System.out.println("Wait a second a SPECIAL Movement was casted, Magician has healed");
         
           target.sethp(35);
           healcount --;
           
           
       }
       else{
           
       }
    }
    

}
