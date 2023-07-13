/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fighters;


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

public abstract class Fighters {
 public   String name;
   public  String color;
   public  int atk;
   public  int hp;
  public  int speed;
  public   int xp;
  public   int gold;
   public  String getname;
 public Fighters(int hp, int atk, int speed){
     this.sethp(hp);
     this.setatk(atk);
     this.setspeed(speed);
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

   public String getName() {
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
public String getname(){
    return name;
}
   public void setName(String name) { //it takes the value from somwhere else

        this.name = name;
    }
   public String getColor() {
    
        return color;
    }
  public   String getcolor() {
    
        return color;
    }

    public void setColor(String color) { //it takes the value from somwhere else

        this.color = color;
    }
   public boolean isAlive(){
    return true;}
  public  void battle(Fighters myfig, Fighters riv){
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