
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

public abstract class Fighters implements BossInterface{
    String name;
    String color;
    int atk;
    int hp;
    int speed;
    int xp;
    int gold;
    String getname;
 public Fighters(int hp, int atk, int speed){
     this.hp = hp;
     this.atk = atk;
     this.speed = speed;
}
 public void sethp(int hp){
     this.hp = hp;
 }
 public int gethp(){
     return hp;
 }
public void setatk(int atk) {
    this.atk = atk;
}

public int getatk() {
    return atk;
}

public void setspeed(int speed) {
    this.speed = speed;
}

public int getspeed() {
    return speed;
}

  //  public abstract void fight();  // more like interfaces    //  in example used animal noice ? 
  //  public abstract void lvlup();
    
    // methods here are like noice is 
public abstract void start(Fighters player, Fighters oponent);
    public abstract void takeDamage(Fighters target, int atk)  ;
public abstract void turn(int speed, Fighters oponent, Fighters myfig, int atk, int hp) ;

     // public abstract void rivtakeDamage(int atk,int hp, int speed)  ;

    String getName() {
       try {
            Scanner scanners = new Scanner(System.in);
            System.out.println("Enter the name of your Fighter");
            name = scanners.nextLine();

            ///// still have to know for what errors   
        } catch (Exception e) {
            System.out.println("You disoveid the rules");
        }

        return name;
    }
 String getname(){
    return name;
}
   public void setName(String name) { //it takes the value from somwhere else

        this.name = name;
    }
    String getColor() {
    
        return color;
    }
     String getcolor() {
    
        return color;
    }

    public void setColor(String color) { //it takes the value from somwhere else

        this.color = color;
    }
    boolean isAlive(){
    return true;}
    void battle(Fighters myfig, Fighters riv){
                        myfig.start(myfig, riv);
                        riv.start(riv, myfig);
                        while (myfig.isAlive() && riv.isAlive()) {

                            myfig.turn(riv.speed, riv, myfig, riv.atk, riv.hp);
                        }
                        if (myfig.gethp() < 0) {
                            System.out.println(riv.getname + " WINS");
                        } else {
                            System.out.println("YOU WIN");
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong" );
}
                        
                     
    } 

  
}