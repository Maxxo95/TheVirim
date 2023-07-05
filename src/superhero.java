
public class superhero extends Human implements Fight {

    int atk;
    int hp;
    int speed;

    public superhero(String name, String color) {
        super(name, color);
        this.atk = 40;
        this.hp = 80;
        this.speed = 30;
    }

    // Other methods and variables for the Superhero class...
   
int hptemp = this.hp;
    @Override
    public void attack(Fighters opponent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
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
    public void turn(int speed, Fighters oponent, Fighters myfig, int atk, int hp) {
      
    int rivturn = 0;
    int turn = 0;
    
    if (rivturn >= turn) {
        System.out.println("Attack opponent");
        rivturn += speed;
        oponent.takeDamage(this.atk);
        System.out.println(this.hp);
    } else {
        System.out.println("My attack");
        turn += this.speed;
        
    }}}
    

   