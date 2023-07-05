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
public class Dkong extends Fighters implements Fight {
    
 String name = "Dkong";
String color = "grey";
int atk = 60;
int hp = 100;
int speed = 20;
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
    
      public Dkong(String name, String color, int atk, int hp, int speed, int xp) {
     this.setName(name);   
     this.setColor(color);
     this.setatk(atk);
     this.sethp(hp);
     this.setspeed(speed);
     this.setxp(xp);
    }
    
    
     public Dkong() {
     this.setName(name);   
     this.setColor(color);
     this.setatk(atk);
     this.sethp(hp);
     this.setspeed(speed);
     this.setxp(xp);
    }

     
  int hptemp = this.hp;
   int opohealth = 0;
    @Override
    public void takeDamage(int atk) {
        System.out.println(hptemp + "life points " );
  
     
     
      hptemp -= atk;
      System.out.println(hptemp + "life points " );
    if( hptemp <= 0 ){
        this.sethp(0);
    }   
    }

    @Override
    public boolean isAlive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


        
   

    @Override
    public void attack(Fighters opponent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        int rivturn = 0;
    int turn = 0;
    @Override
    public void turn(int speed, Fighters oponent, Fighters myfig, int atk, int hp) {
      

    
    if (rivturn >= turn) {
        System.out.println("Attack opponent");
        turn += this.speed;
        myfig.takeDamage(atk);
       
    } else {
        System.out.println("My attack" + hp);
        rivturn += speed;
          hp -= this.atk;
          
     
        
    }
    
}

    @Override
    public void turn(int speed, Fighters oponent, Fighters myfig, int atk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
