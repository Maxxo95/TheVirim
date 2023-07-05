
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
public class Elephant extends Fighters {
 String name = "Elephant";
String color = "White";
int atk = 50;
int hp = 100;
int speed = 12;
int xp = 0; 
int gold = 0; 

String getName(){
  try {
            Scanner scanners = new Scanner(System.in);
            System.out.println("Enter the name of your Elephant");         
            name = scanners.nextLine();
           
                                                           ///// still have to know for what errors   
        } catch (Exception e) {
            System.out.println("You disoveid the rules");
        }   

 return name;
}
   public void setName(String name) { //it takes the value from somwhere else
       
        this.name = name;
    }  
   
   
   String getColor(){
  try {
            Scanner scanners = new Scanner(System.in);
            System.out.println("Enter the color of " + name);         
            color = scanners.nextLine();
           
            
        } catch (Exception e) {
            System.out.println("You disoveid the rules");
        }   

 return color;
}
   public void setColor(String color) { //it takes the value from somwhere else
       
        this.color = color;
    }  
   
    public Integer getatk(){
     return atk;   
    }
    public void setatk(int atk){
        this.atk= atk;
    }
     public Integer gethp(){
     return hp;   
    }
    public void sethp(int hp){
        this.hp= hp;
    }
     public Integer getspeed(){
     return speed;   
    }
    public void setspeed(int speed){
        this.speed= speed;
    }
       public Integer getxp(){
     return xp;   
    }
    public void setxp(int xp){
        this.xp= xp;
    }
      public Integer getgold(){
     return gold;   
    }
    public void setgold(int xp){
        this.xp= xp;
    }
    
    
    
    
     public Elephant() {
     this.setName(name);   
     this.setColor(color);
     this.setatk(atk);
     this.sethp(hp);
     this.setspeed(speed);
     this.setxp(xp);
    }

    @Override
    public void takeDamage(int atk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void turn(int speed, Fighters oponent, Fighters myfig, int atk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}