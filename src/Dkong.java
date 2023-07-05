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
public class Dkong extends Fighters {
    
 String name = "Dkong";
String color = "grey";
int atk = 40;
int hp = 40;
int speed = 10;
int xp = 0; 
int gold = 0; 

String getName(){
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
    
    
    
    
     public Dkong() {
     this.setName(name);   
     this.setColor(color);
     this.setatk(atk);
     this.sethp(hp);
     this.setspeed(speed);
     this.setxp(xp);
    }
}
