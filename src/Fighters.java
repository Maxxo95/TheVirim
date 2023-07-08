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
    String name;
    String color;
    int atk;
    int hp;
    int speed;
    int xp;
    int gold;
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

}