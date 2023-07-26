
package Money;


/**
 *
 * @author maxim
 */
public abstract class Money {
    
    double value;  // value will always be connected with silver  10 silver = 1 gold   
    double changev;
    double newcoinv;
    
    public Money (){
    this.setvalue(value); 
}
   void setvalue(double value){
       this.value = value;
   
   }
     double getvalue() {

        return value;
    }
   void convert(Money change, Money newcoin, double amount){
    changev = change.getvalue();  // lets say i want to change silver with value 1
    newcoinv = newcoin.getvalue();  // to gold value 10 
 // if my coin (silver ) smaller than gold it is  1 - 10
    double  tempval = (changev * amount);
    tempval = tempval / newcoinv;
    change.setvalue(tempval);       // (silver value * amount to change) / gold value      1 * 100 coins / 10 should give 10 gold coins
  
    
   }    
   } 

