//INTERFACE
/*
- Interface implemented in subscription class
Abstract Variables: to display monthly charge and yearly charge to override abstract Methods:
overried abstract methods to set the delivery date and calculate total cost of subscription
*/
public interface subCharges{

  //Abstarct Variables
  static final String monthlyCharge = "Flat fee of $2.99";
  static final String yearlyCharge = "Flat fee of $1.99";

  //Abstract Methods
  public abstract String date();
  public abstract void calcTotalSub();
}//End of subCharges interface 
