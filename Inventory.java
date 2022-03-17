//SUPERCLASS (Parent Class) - HOLDS INVENTORY
/*
Instance Variables: flower arrangment styles, bouquets, corsages, boutonnieres, centerpieces, wreaths and single flowers
Constructors: Default and overloaded constructors
Methods:
- Appropiate get and set Methods for instance variables
- Declared abstract method 
*/

import java.util.Scanner;

public abstract class Inventory {

  //Create Scanner Object
  Scanner input = new Scanner (System.in);

  //Instance Variables
  int flowerArrangement, bouquet, corsage, boutonnieres, centerpiece, wreaths, singles;

  //Arrays 
  String arrangementNames [][] = {
                      //Bouquets
                      {"Blooming Love Bouquet", "Lovely Lavender Bouquet", "Warm Sunset Bouquet", "Costal Breeze Bouquet"},
                      //Corsages
                      {"White Rose Corsage", "Rose and Daisy Corsage", "Phalaenopsis Orchid Corsage", "White Gerbera Corsage"},
                      //Boutonnieres
                      {"White Rose Boutonniere", "Rose and Daisy Boutonniere", "Phalaenopsis Boutonniere", "Pink Cymbidium Boutonniere"},
                      //Floral Centerpieces
                      {"Holiday Classics Centerpiece", "Wedding Glow Centerpiece","Autumnal Hued Centerpiece", "Spring Bloom Centerpiece"},
                      //Wreaths
                      {"Hydrangea Berry Wreath", "Boxwood Wreath", "Rose Spring Wreath", "Green Succulent Wreath"},
                      //Single Flowers
                      {"White Rose", "Pink Peonie", "Red Tulip", "Blue Hydrangea"}
                      };

  double prices [][] = {
                      //Bouquet Prices
                      {65.99, 42.99, 49.99, 54.99},
                      //Corsage Prices
                      {25.00, 27.00, 30.00, 22.00},
                      //Buttonnieres Prices
                      {15.00, 17.00, 20.00, 25.00},
                      //Floral Centerpiece Prices
                      {69.99, 75.99, 83.99, 71.99},
                      //Wreath Prices
                      {46.98, 51.49, 97.99, 63.09},
                      //Single Flower Prices
                      {2.99, 4.99, 3.99, 6.99,}
                      };

  
                      
  //Constructors
  public Inventory (){

  }//Default Constructor

  public Inventory (int f,int bq, int cor, int b, int c, int w, int s){
    flowerArrangement = f;
    bouquet = bq;
    corsage = cor;
    boutonnieres = b;
    centerpiece = c;
    wreaths = w;
    singles = s;
  }//Overloaded Constructor

  //Mutator Methods
  public void setFlowerArrangement (){
    System.out.println("\n✿ FLOWERS ✿\n1. Bouquets\n2. Corsages\n3. Boutonnieres\n4. Floral Centerpieces\n5. Wreaths\n6. Single Flowers");
    System.out.print("\nSelect a flower arrangement to update prices for? (#): ");
    flowerArrangement = input.nextInt();
  }
  public void setBouquet (){
    System.out.print("\n-BOUQUETS-\n1. Blooming Love Bouquet - $" + prices[0][0] + "\n2. Lovely Lavender Bouquet - $" + prices[0][1] + "\n3. Warm Sunset Bouquet - $" + prices[0][2] + "\n4. Costal Breeze Bouquet - $" + prices[0][3] + "\n\nWhich flower bouquet would you like to update prices for? (#): ");
    bouquet = input.nextInt();
  }

  public void setCorsage (){
    System.out.print("\n-CORSAGES-\n1. White Rose Corsage - $" + prices[1][0] + "\n2. Rose and Daisy Corsage - $" + prices[1][1] + "\n3. Phalaenopsis Orchid Corsage - $" + prices[1][2] + "\n4. White Gerbera Corsage - $" + prices[1][3] + "\n\nWhich corsage flower would you like to update prices for? (#): ");
    corsage = input.nextInt();
  }

  public void setBoutonnieres (){
    System.out.print("\n-BOUTONNIERES-\n1. White Rose Boutonniere - $" + prices[2][0] + "\n2. Rose and Daisy Boutonniere - $" + prices[2][1] + "\n3. Phalaenopsis Boutonniere - $" + prices[2][2] + "\n4. Pink Cymbidium Boutonniere - $" + prices[2][3] + "\n\nWhich boutonniere flower would you like to update prices for? (#): ");
    boutonnieres = input.nextInt();
  }

  public void setCenterpiece (){
    System.out.print("\n-FLORAL CENTERPIECES-\n1. Holiday Classics Centerpiece - $" + prices[3][0] + "\n2. Wedding Glow Centerpiece - $" + prices[3][1] + "\n3. Autumnal Hued Centerpiece - $" + prices[3][2] + "\n4. Spring Bloom Centerpiece - $" + prices[3][3] + "\n\nWhich floral centerpiece would you like to update prices for? (#): ");
    centerpiece = input.nextInt();
  }

  public void setWreaths (){
    System.out.print("\n-WREATHS-\n1. Hydrangea Berry Wreath - $" + prices[4][0] + "\n2. Boxwood Wreath - $" + prices[4][1] + "\n3. Rose Spring Wreath - $" + prices[4][2] + "\n4. Green Succulent Wreath - $" + prices[4][3] + "\n\nWhich flower wreath would you like to update prices for? (#): ");
    wreaths = input.nextInt();
  }

  public void setSingles (){
    System.out.print("\n-SINGLE FLOWERS-\n1. White Rose - $" + prices[5][0] + "\n2. Pink Peonie - $" + prices[5][1] + "\n3. Red Tulip - $" + prices[5][2] + "\n4. Blue Hydrangea - $" + prices[5][3] + "\n\nWhich single flower would you like to update prices for? (#): ");
    singles = input.nextInt();
  }

  

  //Accessor Methods
  public int getFlowerArrangement(){
    return flowerArrangement;
  }

  public int getBouquet (){
    return bouquet;
  }

  public int getCorsage (){
    return corsage;
  }

  public int getBoutonnieres (){
    return boutonnieres;
  }

  public int getCenterpiece (){
    return centerpiece;
  }

  public int getWreaths (){
    return wreaths;
  }

  public int getSingles (){
    return singles;
  }

  
  //Abstract Method
  public abstract void classInfo();
}//End of Inventory class

