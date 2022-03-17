/*
Instance Variables: descriptions and bouquet names 
- Constructor: default/overloaded 
Methods:
- Get/Set Methods for each of the instance variables
*/

public class bouquetDescription {

  //Instance Variables
  String descriptions, designedBouquets;

  //Constructors
  public bouquetDescription(){

  }//Default Constructor

  public bouquetDescription(String d, String db){
    descriptions = d;
    designedBouquets = db;
  }//Overloaded Constructor

  //Mutator Methods
  public void setDescriptions(String d){
    descriptions = d;
  }

  public void setDesignedBouquets(String db){
    designedBouquets = db;
  }

  //Accessor Methods
  public String getDescriptions(){
    return descriptions;
  }

  public String getDesignedBouquets(){
    return designedBouquets;
  }
}//End of bouquetDescription class
