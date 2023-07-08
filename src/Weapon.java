/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxim
 */
public class Weapon implements weaponInterface {

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

    public void addweapon(Weapon targetweapon, Fighters target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}
