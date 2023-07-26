
package Fighters;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**            
 *
 * @author maxim
 */

public abstract class Fighters {   //Main abstract of fighetrs all the fighters will inherit from this or sublcasses
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
     this.setName(name);
     this.setColor(color);
}
 public void sethp(int hp){    // SETTERS AND GETTERS
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

public abstract void start(Fighters player, Fighters oponent);  // methods to perform the fights with the fighters info available 
    public abstract void takeDamage(Fighters target, int atk)  ;
public abstract void turn(int speed, Fighters oponent, Fighters myfig, int atk, int hp) ;


   public String getName() {  //GETTER FOR THE NAME OF USER INPUT

            Scanner scanners = new Scanner(System.in);
           System.out.println("Enter the name of your Fighter:");
        while (true) {
            if (scanners.hasNextLine()) {
                name = scanners.nextLine();

                if (name.equals("")) {
                    System.out.println("Fighter's name cannot be empty. Please try again.");
                } else if (isValidName(name)) {
                    // Name is valid (contains only A-Z, a-z characters)
                    break;
                } else {
                    System.out.println("Invalid name. Please enter only characters A-Z, a-z.");
                }
            }
        }
      return name;
    }
     public static boolean isValidName(String name) { //to chek only characters
        // Regular expression pattern to match only A-Z, a-z characters
        Pattern pattern = Pattern.compile("^[A-Za-z]+$");

        // Matcher to check if the name matches the pattern
        Matcher matcher = pattern.matcher(name);

        // Check if the name contains only A-Z, a-z characters
        return matcher.matches();
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
  public  void battle(Fighters myfig, Fighters riv){   // perform the main fight once is started 
                        myfig.start(myfig, riv);  //restart the stats for a new fight
                        riv.start(riv, myfig);  // rival stats restartes
                        while (myfig.isAlive() && riv.isAlive()) {  // is alive is a boolean if false means the player is death after the atack last turn

                            myfig.turn(riv.speed, riv, myfig, riv.atk, riv.hp); // if is alive  perform the  TURN method to perform the atack 
                        }
                        if (myfig.gethp() < 0) {
                            System.out.println(riv.getname + " WINS");  // if  my fighter has no  HP the rival has won
                        } else {
                            System.out.println("YOU WIN");
                            System.out.println("Boss Fight");
                            System.out.println("Pick your boss \n 1- Panther \n 2- CrazyBird \n 3- Dkong" );
}
                        
                     
    } 

 

  
}