
package Fighters;

import java.util.Scanner;

/**
 *
 * @author maxim
 */

    public class superhero extends Human {
    
  public String name = "Superman";
   public  String color = "Blue";
   public  int atk ;
  public   int hp ;
   public  int speed ;
   public  int xp = 0;
   public  int gold = 0;

   
     @Override
   public String getName() {
        try {
            Scanner scanners = new Scanner(System.in);
            System.out.println("Enter the name of your hero");
            name = scanners.nextLine();

            ///// still have to know for what errors   
        } catch (Exception e) {
            System.out.println("You disoveid the rules");
        }

        return name;
    }
    @Override
    public String getcolor(){
    return color;
}
    @Override
   public String getColor(){
  try {
            Scanner scanners = new Scanner(System.in);
            System.out.println("Enter the color of " + name);         
            color = scanners.nextLine();
           
            
        } catch (Exception e) {
            System.out.println("You disoveid the rules");
        }   

 return color;
}
   
 
 
  @Override
    public Integer getxp() {
        return xp;
    }

  @Override
    public void setxp(int xp) {
        this.xp = xp;
    }

  @Override
    public Integer getgold() {
        return gold;
    }

  @Override
    public void setgold(int xp) {
        this.xp = xp;
    }

  public superhero(int hp, int atk, int speed) {
        super(hp, atk, speed);
        // other initialization code for Dkong
   
 this.setName( this.getname());
   this.setColor( this.getcolor());
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
            
            System.out.println("\n"+myfig.getname()+ " is taking damage");
            myfig.takeDamage(myfig, oponent.getatk());
            turn += speedtemp;
           
             System.out.println("Your turn count is: " + (turn) + " rival turn count is " + vsturn);
        } else {
            System.out.println("\n"+oponent.getname +" is taking damage");
            oponent.takeDamage(oponent, playeratk);
            vsturn += oponent.getspeed();
            
             System.out.println("Your turn count is: " + (turn) + " rival turn count is " + vsturn);
        }
    }
   
    @Override
    public void takeDamage(Fighters target, int atk) {

        System.out.println(target.getname + " has " + target.gethp() + " life points");
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

}
