//SUBCLASS (Child Class) - PROCCESSESS ORDERS
/*
Instance Variables: First and last names of the customer, their phone number, if they will pick-up order at store, town, street, postal code, counters for order names and order prices.
- Static Variables: Discount percent and tax rate amount
Constructors: Default and overloaded (super) constructors
Methods:
- Appropiate get and set Methods for instance variables
- Method that displays added order items
- Method that calculates total cost for customer and displays price receipt
- Overrided abstract method 
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Order extends Inventory {

  //Create Scanner Object
  Scanner input = new Scanner (System.in);

  //Instance Variables
  String first, last, phone, pickUp, town, street, postal;
  double countOrderPrices = 0;
  String countOrder = " ";
  
  static double discount = 0.20;
  static double taxRate = 0.13;

  //Constructors
  public Order (){
    
  }//Default Constructor

  public Order (int f,int bq, int cor, int b, int c, int w, int s, String fi, String l, String p, String pu, String t, String st, String pos, double COP, String CO){
    super(f, bq, cor, b, c, w, s);
    first = fi;
    last = l;
    phone = p;
    pickUp = pu;
    town = t;
    street = st;
    postal = pos;
    countOrderPrices = COP;
    countOrder = CO;
  }//Overloaded Constructor

  //Mutator Methods
  public void setFlowerArrangement (){
    System.out.println("\n✿ FLOWERS ✿\n1. Bouquets\n2. Corsages\n3. Boutonnieres\n4. Floral Centerpieces\n5. Wreaths\n6. Single Flowers");
    System.out.print("\nSelect a flower arrangement to order from (#): ");
    flowerArrangement = input.nextInt();
  }
  public void setBouquet (int bq){
    bouquet = bq;
  }

  public void setCorsage (int cor){
    corsage = cor;
  }

  public void setBoutonnieres (int b){
    boutonnieres = b;
  }

  public void setCenterpiece (int c){
    centerpiece = c;
  }

  public void setWreaths (int w){
    wreaths = w;
  }

  public void setSingles (int s){
    singles = s;
  }

  public void setFirst (){
    System.out.print("\n(NAME)\nEnter your first name: ");
    first = input.next();
  }

  public void setLast (){
    System.out.print("Enter your last name: ");
    last = input.next();
  }

  public void setPhone (){
    System.out.print("\n(PHONE#)\nEnter your phone number (no dashes/spaces): ");
    phone = input.next();
  }

  public void setPickUp(){
    System.out.print("\n(PICK-UP)\nWill you be picking up your order? (Y/N): ");
    pickUp = input.next();
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

  public void setCountOrderPrices(){

    if (flowerArrangement == 1){
      countOrderPrices += prices[flowerArrangement-1][bouquet-1];
    }

    else if (flowerArrangement == 2){
      countOrderPrices += prices[flowerArrangement-1][corsage-1];
    }
     else if (flowerArrangement == 3){
      countOrderPrices += prices[flowerArrangement-1][boutonnieres-1];
    }
     else if (flowerArrangement == 4){
      countOrderPrices += prices[flowerArrangement-1][centerpiece-1];
    }
     else if (flowerArrangement == 5){
      countOrderPrices += prices[flowerArrangement-1][wreaths-1];;
    }
     else if (flowerArrangement == 6){
      countOrderPrices += prices[flowerArrangement-1][singles-1];
    }
  }

  public void setCountOrder (){
    if (flowerArrangement == 1){
      countOrder += ("\n" + arrangementNames[flowerArrangement-1][bouquet-1] + " - $" + prices[flowerArrangement-1][bouquet-1]);
    }
    else if (flowerArrangement == 2){
      countOrder += ("\n" + arrangementNames[flowerArrangement-1][corsage-1] + " - $" + prices[flowerArrangement-1][corsage-1]);
    }
     else if (flowerArrangement == 3){
      countOrder += ("\n" + arrangementNames[flowerArrangement-1][boutonnieres-1] + " - $" + prices[flowerArrangement-1][boutonnieres-1]);
    }
     else if (flowerArrangement == 4){
      countOrder += ("\n" + arrangementNames[flowerArrangement-1][centerpiece-1] + " - $" + prices[flowerArrangement-1][centerpiece-1]);
    }
     else if (flowerArrangement == 5){
      countOrder += ("\n" + arrangementNames[flowerArrangement-1][wreaths-1] + " - $" + prices[flowerArrangement-1][wreaths-1]);
    }
     else if (flowerArrangement == 6){
      countOrder += ("\n" + arrangementNames[flowerArrangement-1][singles-1] + " - $" + prices[flowerArrangement-1][singles-1]);
    }
  }

  
  //Accessor Methods  
  public String getFirst (){
    return first;
  }

  public String getLast (){
    return last;
  }

  public String getPhone (){
    return phone;
  }

  public String getPickUp(){
    return pickUp;
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

  public double getCountOrderPrices(){
    return countOrderPrices;
  }

  public String getCountOrder(){
    return countOrder;
  }


  //Method that displays added ordered item
  public void addOrder (){
    
    if (flowerArrangement == 1){
      System.out.print(arrangementNames[flowerArrangement-1][bouquet-1]+ " has been added to your order!");
    }

    else if (flowerArrangement == 2){
      System.out.print(arrangementNames[flowerArrangement-1][corsage-1]+ " has been added to your order!");
    }
     else if (flowerArrangement == 3){
      System.out.print(arrangementNames[flowerArrangement-1][boutonnieres-1]+ " has been added to your order!");
    }
     else if (flowerArrangement == 4){
      System.out.print(arrangementNames[flowerArrangement-1][centerpiece-1]+ " has been added to your order!");
    }
     else if (flowerArrangement == 5){
      System.out.print(arrangementNames[flowerArrangement-1][wreaths-1]+ " has been added to your order!");
    }
     else if (flowerArrangement == 6){
      System.out.print(arrangementNames[flowerArrangement-1][singles-1]+ " has been added to your order!");
    }
  }

  
  //Calculates total cost and displays receipt of order
  public void calcCost (){

    //Create decimal format object
    DecimalFormat df = new DecimalFormat("##.##");

    //Variables
    double subtotal;
    double tax;
    double total;
    double discounted;

    //When customer picks up from store (no delivery fee)
    if (pickUp.equalsIgnoreCase("Y")){
      //Apply discount
      if (countOrderPrices > 100){
        discounted = countOrderPrices * discount;
        subtotal = countOrderPrices - discounted;
        tax = subtotal * taxRate;
        total = subtotal + tax;

        System.out.println("*Eligible for 20% discount*\nSubtotal: $" + df.format(subtotal) + "\nTaxes: $" + df.format(tax) +"\nTotal: $" + df.format(total)+ "\n------------------------------------------\n\t   Thank You For Shopping With \n\t      Alam Florists Today!");
      }
      //No discount 
      else {
        tax = countOrderPrices * taxRate;
        total = countOrderPrices + tax;

        System.out.println("Subtotal: $" + df.format(countOrderPrices) + "\nTaxes: $" + df.format(tax) +"\nTotal: $" + df.format(total)+ "\n------------------------------------------\n\t   Thank You For Shopping With \n\t      Alam Florists Today!");
      }
    }

    //When customer gets same day delivery (no delivery fee in 3 towns)
    else if (pickUp.equalsIgnoreCase("N")){
      //No delivery fee 
      if (town.equalsIgnoreCase("Ajax") || town.equalsIgnoreCase("Pickering") || town.equalsIgnoreCase("Whitby")){
        //Apply discount
        if (countOrderPrices > 100){
          discounted = countOrderPrices * discount;
          subtotal = countOrderPrices - discounted;
          tax = subtotal * taxRate;
          total = subtotal + tax;

          System.out.println("*Eligible for 20% discount & FREE DELIVERY*\nSubtotal: $" + df.format(subtotal) + "\nTaxes: $" + df.format(tax) + "\nTotal: $" + df.format(total)+ "\n------------------------------------------\n\t   Thank You For Shopping With \n\t      Alam Florists Today!");
        }
        //No Dicount
        else{
          tax = countOrderPrices * taxRate;
          total = countOrderPrices + tax;

          System.out.println("*FREE DELIVERY*\nSubtotal: $" + df.format(countOrderPrices) + "\nTaxes: $" + df.format(tax) + "\nTotal: $" + df.format(total)+ "\n------------------------------------------\n\t   Thank You For Shopping With \n\t      Alam Florists Today!");
        }
      }

      //When customer gets same day delivery
      else {
        //Apply discount With Delivery Fee
        if (countOrderPrices > 100){
          discounted = (countOrderPrices + 3.99) * discount;
          subtotal = countOrderPrices - discounted;
          tax = subtotal * taxRate;
          total = subtotal + tax;

          System.out.println("*Eligible for 20% Discount*\nSubtotal: $" + df.format(subtotal) + "\nTaxes: $" + df.format(tax) + "\nDelivery Fee: $3.99\nTotal: $" + df.format(total)+ "\n------------------------------------------\n\t   Thank You For Shopping With \n\t      Alam Florists Today!");
        }
        //No Dicount with Delivery Fee
        else{
          tax = (countOrderPrices + 3.99) * taxRate;
          total = countOrderPrices + tax;

          System.out.println("\nSubtotal: $" + df.format(countOrderPrices) + "\nTaxes: $" + df.format(tax) + "\nDelivery Fee: $3.99\nTotal: $" + df.format(total)+ "\n------------------------------------------\n\t   Thank You For Shopping With \n\t      Alam Florists Today!");
        }
      }
    }
  }

  //Overrided Abstract Method
  public void classInfo(){
    System.out.println("\t  ___________________________________________________");
    System.out.println("\t |\t\t\t   !!! DELIVERY PROCESS !!!             |\n\t |     Same day deliveries available within Durham  |       |         Region at a flat fee of $3.99!           | \n     |       PICK-UP WITHIN DURHAM ALSO AVAILABLE       |\n\t  ___________________________________________________");
  }
}//End of Order Class
