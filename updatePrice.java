//SUBCLASS (Child Class) - COLLECTION (VIEW AND UPDATE COLLECTION)
/*
Instance Variables: updates prices of items
- Static Variables: Location for in-store purchases
Constructors: Default and overloaded (super) constructors
Methods:
- Appropiate get and set Methods for instance variables
- Method that displays updated items with new price
- Method that displays all flower arrangements
- Overrided abstract method 
*/
import java.util.Scanner;

public class updatePrice extends Inventory{

  Scanner input = new Scanner (System.in);

  //Instance variable
  double updatePrice;
  static String store = "\nLOCATION FOR IN-STORE PURCHASES:\n123 Flower Ave,\nL1T 0Y2\nAjax, ON";

  //Array
  String flowers [] = {"✿ BOUQUETS ✿", "✿ CORSAGES ✿", "✿ BOUTONNIERES ✿", "✿ FLORAL CENTERPIECES ✿", "✿ WREATHS ✿", "✿ SINGLE FLOWERS ✿"};


  //Constructors
  public updatePrice (){

  }//Default Constructor

  public updatePrice (int f,int bq, int cor, int b, int c, int w, int s, double u){
    super(f, bq, cor, b, c, w, s);
    updatePrice = u;
  }//Overloaded Constructor
  
  //Mutator Method
  public void setUpdatePrice(){
    if (flowerArrangement == 1){
      System.out.print("Enter new price for " + arrangementNames[flowerArrangement-1][bouquet-1]+ ": $");
      updatePrice = input.nextDouble();
      prices[flowerArrangement-1][bouquet-1] = updatePrice;
    }
    else if (flowerArrangement == 2){
      System.out.print("Enter new price for " + arrangementNames[flowerArrangement-1][corsage-1]+ ": $");
      updatePrice = input.nextDouble();
      prices[flowerArrangement-1][corsage-1] = updatePrice;
    }
     else if (flowerArrangement == 3){
      System.out.print("Enter new price for " + arrangementNames[flowerArrangement-1][boutonnieres-1]+ ": $");
      updatePrice = input.nextDouble();
      prices[flowerArrangement-1][boutonnieres-1] = updatePrice;
    }
     else if (flowerArrangement == 4){
      System.out.print("Enter new price for " + arrangementNames[flowerArrangement-1][centerpiece-1]+ ": $");
      updatePrice = input.nextDouble();
      prices[flowerArrangement-1][centerpiece-1] = updatePrice;
    }
     else if (flowerArrangement == 5){
      System.out.print("Enter new price for " + arrangementNames[flowerArrangement-1][wreaths-1]+ ": $");
      updatePrice = input.nextDouble();
      prices[flowerArrangement-1][wreaths-1] = updatePrice;
    }
     else if (flowerArrangement == 6){
      System.out.print("Enter new price for " + arrangementNames[flowerArrangement-1][singles-1]+ ": $");
      updatePrice = input.nextDouble();
      prices[flowerArrangement-1][singles-1] = updatePrice;
    }
  }


  //Accessor Method
  public double getUpdatePrice (){
    return updatePrice;
  }


  
  //Method that displays updated item with new price
  public void itemAdded (){
    if (flowerArrangement == 1){
      System.out.println(arrangementNames[flowerArrangement-1][bouquet-1].toUpperCase() + " HAS BEEN UPDATED TO $" + updatePrice + "!");
    }
    else if (flowerArrangement == 2){
      System.out.println(arrangementNames[flowerArrangement-1][corsage-1].toUpperCase() + " HAS BEEN UPDATED TO $" + updatePrice + "!");
    }
    else if (flowerArrangement == 3){
      System.out.println(arrangementNames[flowerArrangement-1][boutonnieres-1].toUpperCase() + " HAS BEEN UPDATED TO $" + updatePrice + "!");
    }
    else if (flowerArrangement == 4){
      System.out.println(arrangementNames[flowerArrangement-1][centerpiece-1].toUpperCase() + " HAS BEEN UPDATED TO $" + updatePrice + "!");
    }
    else if (flowerArrangement == 5){
      System.out.println(arrangementNames[flowerArrangement-1][wreaths-1].toUpperCase() + " HAS BEEN UPDATED TO $" + updatePrice + "!");
    }
    else if (flowerArrangement == 6){
      System.out.println(arrangementNames[flowerArrangement-1][singles-1].toUpperCase() + " HAS BEEN UPDATED TO $" + updatePrice + "!");
    }
  }

    
    //Displays All Flower Arrangements
    public void viewCollection (){
      for (int x=0; x<prices.length; x++){
        System.out.println("\n" + flowers[x]);
        for(int y=0; y<prices[x].length; y++){
          System.out.println(arrangementNames[x][y] + " - $" + prices[x][y]);
        }
        System.out.println();
      }
    }
    

    //Overrided Abstract Method
    public void classInfo (){
      System.out.println("\t  ___________________________________________________");
    System.out.println("\t |\t\t\t\t\t !!! DEALS !!!                   |\n\t |             1. 20% off $100 Purshases             |\n     |   2. Free Shipping in Ajax, Whitby and Pickering  |\n\t  ___________________________________________________");
    }
}//End of updatePrice Class
