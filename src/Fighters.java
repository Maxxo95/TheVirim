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
    
  //  public abstract void fight();  // more like interfaces    //  in example used animal noice ? 
  //  public abstract void lvlup();
    
    // methods here are like noice is 
public abstract void start(int speed);
    public abstract void takeDamage(int atk,int hp, int speed)  ;
public abstract void turn(int speed, Fighters oponent, Fighters myfig, int atk, int hp) ;
}
