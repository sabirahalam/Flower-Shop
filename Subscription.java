//SUBCLASS (Child Class) - PROCCESSESS SUBSCRIPTIONS
/*
Instance Variables: First and last names of the customer, town, street, postal code and subscription type
- Static Variables: Tax rate amount and flat fee for designed bouquet
Constructors: Default and overloaded (super) constructors
Methods:
- Appropiate get and set Methods for instance variables
- Method that check for the date of delivery of subscription
- Method that calculates total cost for subscription and displays price receipt
- Overrided abstract method 
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Subscription extends Inventory implements subCharges {
  
  //Create Scanner Object
  Scanner input = new Scanner (System.in);

  //Instance Variables
  String first, last, town, street, postal;
  int subscription;

  static double taxRate = 0.13;
  static double bouquetPrice = 31.99;

  //Constructors
  public Subscription (){
    
  }//Default Constructor

  public Subscription (int f,int bq, int cor, int b, int c, int w, int s, String fi, String l, String t, String st, String p, int sub){
    super(f, bq, cor, b, c, w, s);
    first = fi;
    last = l;
    town = t;
    street = st;
    postal = p;
    subscription = sub;
  }//Overloaded Constructor

  //Mutator Methods
  public void setFirst (){
    System.out.print("\n(NAME)\nEnter your first name: ");
    first = input.next();
  }

  public void setLast (){
    System.out.print("Enter your last name: ");
    last = input.next();
  }

  public void setTown (){
    System.out.print("\n(ADDRESS)\nEnter the town for flower delivery (within Durham Region): ");
    town = input.next();
  }
  
  public void setStreet (){
    System.out.print("Enter the street name ONLY for flower delivery: ");
    street = input.next();
  }

  public void setPostal (){
    System.out.print("Enter the postal code for flower delivery (6 characters/no spaces): ");
    postal = input.next();
  }

  public void setSubscription (){
    System.out.println("\n✿ FLOWER SUBSCRIPTIONS ✿\n1. Monthly Subscription\n2. Yearly Subscription");
    System.out.print("\nSelect a subscription (#): ");
    subscription = input.nextInt();
  }

  //Accessor Methods
  public String getFirst (){
    return first;
  }

  public String getLast (){
    return last;
  }

  public String getTown (){
    return town;
  }

  public String getStreet (){
    return street;
  }

  public String getPostal (){
    return postal;
  }

  public int getSubscription (){
    return subscription;
  }

  //Checks for date of delivery
  public String date (){

    //Create Scanner Object
    Scanner input = new Scanner (System.in);

    //Variables
    String fullDate = " ";
    int day, mD, dM;

    //Monthly
    if (subscription == 1){
      do{
      System.out.print("Enter the day of the month you would like to recieve your bouquet: ");
      day = input.nextInt();
      }while (day<0 || day>31);

      fullDate = ("On the " + day + " of each month");
    }

    //Yearly
    else if (subscription == 2){

      do{
      System.out.print("Enter the month of the year you would like to receive your bouquet (#1-12) : ");
      mD = input.nextInt();
      }while (mD<0 || mD>12);

      do{
      System.out.print("Enter the day of the year you would like to receive your bouquet: ");
      dM = input.nextInt();
      }while (dM<0 || dM>31);

      fullDate = (mD + "/" + dM + " (MM/DD) of each year");
    }
    return fullDate;
  }


  //Calculates total cost and displays receipt of subscription
  public void calcTotalSub (){

    //Create decimal format object
    DecimalFormat df = new DecimalFormat("##.##");

    //Variables
    double subtotal;
    double tax;
    double total;
    

    //Monthly
    if (subscription == 1){
      subtotal = (bouquetPrice + 2.99) * 12;
      tax = subtotal * taxRate;
      total = subtotal + tax;

      //Price Receipt
      System.out.println("Subtotal: $" + df.format(subtotal) + "\nTaxes: $" + df.format(tax) +"\nDelivery Fee: $2.99\nTotal: $" + df.format(total)+ "\n------------------------------------------\n\t   Thank You For Shopping With \n\t      Alam Florists Today!");
    }

    //Yearly
    else if (subscription == 2){
      subtotal = (bouquetPrice + 1.99);
      tax = subtotal * taxRate;
      total = subtotal + tax;

      //Price Receipt
      System.out.println("Subtotal: $" + df.format(subtotal) + "\nTaxes: $" + df.format(tax) +"\nDelivery Fee: $1.99\nTotal: $" + df.format(total)+ "\n------------------------------------------\n\t   Thank You For Shopping With \n\t      Alam Florists Today!"); 
    }
  }

  //Overrided Abstract Method
  public void classInfo(){
    System.out.println("\t  ___________________________________________________");
    System.out.println("\t |\t\t\t   !!! SUBSCRIPTION CHARGES !!!          |\t\n     |       Monthly Deliveries: "  + monthlyCharge +    "       |\n     |        Yearly Deliveries: " + yearlyCharge +      "       |\n\t  ___________________________________________________");
  }
}//End of Subscription Class
