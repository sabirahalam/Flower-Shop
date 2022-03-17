//SUBCLASS (Child Class) - PROCCESSESS DONATIONS
/*
Instance Variables: Name of the donor, their phone number, donation name and condition of donation
- Static Variables: dropOff displays address for drop-off donation items
Constructors: Default and overloaded (super) constructors
Methods:
- Appropiate get and set Methods for instance variables
- Overrided abstract method 
*/

import java.util.Scanner;

public class Donations extends Inventory{

  //Create Scanner Object
  Scanner input = new Scanner (System.in);

  //Instance Variables
  String donorName, phone, donation;
  int condition;
  static String dropOff = "\nADDRESS TO DROP-OFF DONATIONS:\n123 Flower Ave,\nL1T 0Y2\nAjax, ON";
 

  //Constructors
  public Donations (){
    
  }//Default Constructor

  public Donations (int f,int bq, int cor, int b, int c, int w, int s, String dn, String p, String d, int con){
    super(f, bq, cor, b, c, w, s);
    donorName = dn;
    phone = p;
    donation = d;
    condition = con;
  }//Overloaded Constructor

  //Mutator Methods
  public void setDonorName (){
    System.out.print("\nSTEP#1) Enter name of flower donor: ");
    donorName = input.next();
  }

  public void setPhone (){
    System.out.print("\nSTEP#2) Enter donor's phone number (no dashes/spaces): ");
    phone = input.next();
  }

  public void setDonation (){
    System.out.print("\nSTEP#3) Enter the name of the flower item you are donating: ");
    donation = input.next();
  }

  public void setCondition (){
    System.out.print("\nSTEP#4) CONDITION:\n1. Very Good\n2. Good\n3. Poor\n4. Very Poor\n\nWhat is the condition of your flower? (#): ");
    condition = input.nextInt();
    if (condition == 3 || condition == 4){
      System.out.println ("Thank you " + donorName + " for your donation :)");
      
    }
    else {
      System.out.println("Sorry " + donorName + ", we cannot accept your donation at this time :(");
    }
  }


  //Accessor Methods
  public String getDonorName(){
    return donorName;
  }

  public String getPhone(){
    return phone;
  }

  public String getDonation(){
    return donation;
  }

  public int getCondition(){
    return condition;
  }

  //Overrided Abstract Method
  public void classInfo(){
    System.out.println("\t  ___________________________________________________");
    System.out.println("\t |\t\t\t   !!! DONATION PROCESS !!!              |\n\t |        Alam Florists improves sustainibility      |\n     |      by re-growing your donated items in POOR     | \n     |       CONDITION with our unique fertilizer!       |\n\t  ___________________________________________________");
    }
}//End of Donations Class
