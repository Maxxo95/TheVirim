/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxim
 */
public abstract class Weapon  {   //WEAPON SUPER CLASS FOR SWORDS & SHIELDS && CAN BE ARMOR in the future (subclasses)

    int atk;
    int hp;
    
    String name;

    String getName() {

        return name;
    }

    public void setName(String name) { //it takes the value from somwhere else

        this.name = name;
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

 public Weapon(String name,int hp, int atk) {     
  this.setName(name);
  this.setatk(atk);
  this.sethp(hp);
  }  

   




}
