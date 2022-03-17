/*
Name: Sabirah Alam
Date: June 10, 2021
Purpose: To create a flower program that uses concepts of object oriented programming in class. This flower program allows the user to switch between modes of cutomer and store owner, giving the owner administrative authorities. The Customer has the ability to shop and view items and subscriptions, while also having the ability to donate and re-generate companies profit sustainably!
*/

import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
  public static void main(String[] args) {

    //Create Scanner Object
    Scanner input = new Scanner (System.in);
    //Create decimal format object
    DecimalFormat df = new DecimalFormat("##.##");

    //Creat subclass objects
    updatePrice u1 = new updatePrice ();
    Donations d1 = new Donations ();
    Subscription s1 = new Subscription();
    Order o1 = new Order();

    //Array of Objects
    //Declaring and initializing array of object with values
    bouquetDescription b[] = new bouquetDescription[3];

    b[0] = new bouquetDescription ("Bouquet designed with vibrant red \nroses and pearl white Lilies, accented\nwith baby breaths and greenery.", "Red Perfection Bouquet");
    b[1] = new bouquetDescription ("Bouquet designed with vibrant red\nroses and blush pink dahlias, accented\nwith baby breaths and greenery.", "Raspberry Perfection Bouquet");
    b[2] = new bouquetDescription ("Bouquet designed with pearl white\nlilies and blush pink\ndahlias, accented with baby breaths and greenery.", "Pink Perfection Bouquet");

    //Variables
    int mode, owner, customer, ownerMenu, customMenu, selectFlow1, selectFlow2;
    String updateArrangement, viewArrangement, mainMenu, ownerMenu1, customMenu1, addDonation, addItem,ownerPass;
    String donationCount = " ";
    String subBouquetCount = " ";


  
  do{//Main Menu
    System.out.println("\n======== WELCOME TO ALAM FLORISTS ========");
    System.out.println("  ✿ Durham Region's Local Flower Shop ✿");

    do{
      System.out.println("\nMAIN MENU:\n1. Store Owner - pass: OWNER2021\n2. Customer - pass: ");
      System.out.print("Select a mode (#): ");
      mode = input.nextInt();
    }while(mode != 1 && mode !=2 && mode !=3);




    //Store Owner Mode
    if (mode == 1){
      System.out.println("\n--STORE OWNER MODE SELECTED--");

      do{//Ensure user enters correct owner password
        System.out.print("Enter the store owner password (or press 0 to quit): ");
        ownerPass = input.next();

        //Correct Password
        if (ownerPass.equals("OWNER2021")){

          System.out.print("\n**********************ACCESS GRANTED******************** ");

          do{//Store owner menu
            System.out.println("\n\n-STORE OWNER MENU-\n1. Update Prices\n2. View Donated Flowers\n3. Quit");

            do{
              System.out.print("\nEnter a number to make a menu selection (1,2, or 3): ");
              ownerMenu = input.nextInt();
            }while(ownerMenu != 1 && ownerMenu != 2 && ownerMenu != 3);



              //Update flower prices
              if (ownerMenu == 1){

                do{
                  System.out.println("\n-- WELCOME TO UPDATING PRICES --");

                  do{
                    u1.setFlowerArrangement();
                  }while(u1.getFlowerArrangement() !=1 && u1.getFlowerArrangement() !=2 && u1.getFlowerArrangement() !=3 && u1.getFlowerArrangement() !=4 && u1.getFlowerArrangement() !=5 && u1.getFlowerArrangement() !=6);
                  
                  if (u1.getFlowerArrangement() == 1){

                    do{
                      u1.setBouquet();
                    }while (u1.getBouquet() !=1 && u1.getBouquet() !=2 && u1.getBouquet() !=3 && u1.getBouquet() !=4 );

                    u1.setUpdatePrice();
                    u1.itemAdded();
                  }

                  else if (u1.getFlowerArrangement() == 2){

                    do{
                      u1.setCorsage();
                    }while (u1.getCorsage() !=1 && u1.getCorsage() !=2 && u1.getCorsage() !=3 && u1.getCorsage() !=4 );

                    u1.setUpdatePrice();
                    u1.itemAdded();
                  }

                  else if (u1.getFlowerArrangement() == 3){

                    do{
                      u1.setBoutonnieres();
                    }while (u1.getBoutonnieres() !=1 && u1.getBoutonnieres() !=2 && u1.getBoutonnieres() !=3 && u1.getBoutonnieres() !=4 );

                    u1.setUpdatePrice();
                    u1.itemAdded();
                  }

                  else if (u1.getFlowerArrangement() == 4){

                    do{
                      u1.setCenterpiece();
                    }while(u1.getCenterpiece() !=1 && u1.getCenterpiece() !=2 && u1.getCenterpiece() !=3 && u1.getCenterpiece() !=4 );

                    u1.setUpdatePrice();
                    u1.itemAdded();
                  }

                  else if (u1.getFlowerArrangement() == 5){

                    do{
                      u1.setWreaths();
                    }while(u1.getWreaths() !=1 && u1.getWreaths() !=2 && u1.getWreaths() !=3 && u1.getWreaths() !=4 );

                    u1.setUpdatePrice();
                    u1.itemAdded();
                  }

                  else if (u1.getFlowerArrangement() == 6){

                    do{
                      u1.setSingles();
                    }while(u1.getSingles() !=1 && u1.getSingles() !=2 && u1.getSingles() !=3 && u1.getSingles() !=4 );

                    u1.setUpdatePrice();
                    u1.itemAdded();
                  }


                  do{//Error check user input for yes/no
                    System.out.print("\nWould you like to update another flower arrangement? (Y/N): ");
                    updateArrangement = input.next();
                  }while(!updateArrangement.equalsIgnoreCase("Y") && !updateArrangement.equalsIgnoreCase("N"));

                }while (updateArrangement.equalsIgnoreCase("Y"));
              }//End of Update Prices
          
          

              //View all donated items
              else if (ownerMenu == 2){
                System.out.println("\n-- WELCOME TO VIEWING DONATED ITEMS --");
                System.out.println("\n✿ DONATED FLOWERS ✿\n" + donationCount);
              }//End of setting donated flower prices




              //Exit store owner menu
              else if (ownerMenu == 3){
                System.out.println("\n--EXITING STORE OWNER MENU--");
                break;
              }//End of quit

            do{//Error check for yes/no
              System.out.print("\nWould you like to return to the store owner menu? (Y/N): ");
              ownerMenu1 = input.next();
            }while (!ownerMenu1.equalsIgnoreCase("Y") && !ownerMenu1.equalsIgnoreCase("N"));

          }while (ownerMenu1.equalsIgnoreCase("Y"));

        }//If Correct Password

        //When user enters 0
        else if (ownerPass.equals("0")){
          break;
        }

        else{
          System.out.println("\n------------ACCESS DENIED------------");
        }
      }while(!ownerPass.equals("OWNER2021"));
    }//End of Store Owner Mode




    //Customer Mode
    else if (mode == 2){

      System.out.println("\n--CUSTOMER MODE SELECTED--");

      do{//Customer Menu
        System.out.println("\n\n-CUSTOMER MENU-\n1. Donate Flowers\n2. View Flower Arrangements\n3. Make a Floral Subscription\n4. Place a New Order\n5. Quit ");

        do{
          System.out.print("\nEnter a number to make a menu selection (1,2,3,4 or 5): ");
          customMenu = input.nextInt();
        }while(customMenu !=1 && customMenu !=2 && customMenu !=3 && customMenu !=4 && customMenu !=5);

        //Donate Flowers
        if (customMenu == 1){
          System.out.println("\n-- WELCOME TO DONATE FLOWERS --");

          //Display Store Location
          System.out.println(Donations.dropOff);

          //Overrided Abstract Method
          d1.classInfo();

          //Ask user personal information and product details
          do{
            d1.setDonorName();

            do{
              d1.setPhone();
            }while(d1.getPhone().length()<10);

            d1.setDonation();

            do{
              d1.setCondition();
            }while (d1.getCondition() !=1 && d1.getCondition() !=2 && d1.getCondition() !=3 && d1.getCondition() !=4 );

            if (d1.getCondition() == 3 || d1.getCondition() == 4){
              donationCount += ("\n-> " + d1.getDonation().toUpperCase() + " - Donor: " + d1.getDonorName().substring(0,1).toUpperCase() + d1.getDonorName().substring(1).toLowerCase() + " -- Phone#: " + d1.getPhone().substring(0,1).toUpperCase() + d1.getPhone().substring(1).toLowerCase());
            }

            do{//Error check for yes/no
              System.out.print("\nWould you like to donate another flower item? (Y/N): ");
              addDonation = input.next();
            }while (!addDonation.equalsIgnoreCase("Y") && !addDonation.equalsIgnoreCase("N"));
          }while(addDonation.equalsIgnoreCase("Y"));
        }//End of flower donations





        //View ALL flower arrangements
        else if (customMenu == 2){
          System.out.println("\n-- WELCOME TO VIEW FLOWER ARRANGEMENTS --");

          //Display store location
          System.out.println(updatePrice.store);

          //Overrided Abstract Method
          u1.classInfo();

          u1.viewCollection();
        }//End of view flower arrangements




        //Make a floral subscription
        else if (customMenu == 3){
          System.out.println("\n-- WELCOME TO MAKE A FLORAL SUBSCRIPTION --");

          //Overrided Abstract Method
          s1.classInfo();

          //Ask user for type of subscription
          do{
            s1.setSubscription();
          }while(s1.getSubscription() !=1 && s1.getSubscription() !=2);

          //Ask user to design a bouquet with two flowers
          System.out.println("\n--- DESIGN A BOUQUET ---\n*Choose up to 2 flowers*\n\n1. Red Rose\n2. White Lily\n3. Pink Dahlia");
          
          do{//Select flower 1
            System.out.print("\nSelect flower #1: ");
            selectFlow1 = input.nextInt();
          }while(selectFlow1 !=1 && selectFlow1 !=2 && selectFlow1 !=3);

          do{//Select flower 2 (differs from flower 1)
            System.out.print("\nSelect flower #2 (Different from flower #1): ");
            selectFlow2 = input.nextInt();
          }while((selectFlow1 == selectFlow2) || (selectFlow2 !=1 && selectFlow2 !=2 && selectFlow2 !=3));

          //Red Perfection Bouquet and description
          if ((selectFlow1 == 1 && selectFlow2 == 2) || (selectFlow1 == 2 && selectFlow2 == 1)){
            System.out.println("\n✿ YOU HAVE SELECTED THE " + b[0].getDesignedBouquets().toUpperCase() + "! ✿\n\nDESCRIPTION: \n" + b[0].getDescriptions());
            subBouquetCount += ("\n" + b[0].getDesignedBouquets());
          }

          //Raspberry Perfection Bouquet and description
          else if ((selectFlow1 == 1 && selectFlow2 == 3) || (selectFlow1 == 3 && selectFlow2 == 1) ){
            System.out.println("\n✿ YOU HAVE SELECTED THE " + b[1].getDesignedBouquets().toUpperCase() + "! ✿\n\nDESCRIPTION: \n" + b[1].getDescriptions());
            subBouquetCount += ("\n" + b[1].getDesignedBouquets());
          }

          //Pink Perfection Bouquet and description 
          else if ((selectFlow1 == 2 && selectFlow2 == 3) || (selectFlow1 == 3 && selectFlow2 == 2)){
            System.out.println("\n✿ YOU HAVE SELECTED THE " + b[2].getDesignedBouquets().toUpperCase() + "! ✿\n\nDESCRIPTION: \n" + b[2].getDescriptions());
            subBouquetCount += ("\n" + b[2].getDesignedBouquets());
          }

          //Ask user for their personal information
          System.out.println("\nPlease fill out the following information to complete your subscription purchase: ");

          s1.setFirst();
          s1.setLast();

          do{
            s1.setTown();
          }while (!s1.getTown().equalsIgnoreCase ("Ajax") && !s1.getTown().equalsIgnoreCase ("Brock") && !s1.getTown().equalsIgnoreCase ("Clarington") && !s1.getTown().equalsIgnoreCase ("Oshawa") && !s1.getTown().equalsIgnoreCase ("Pickering") && !s1.getTown().equalsIgnoreCase ("Scugog") && !s1.getTown().equalsIgnoreCase ("Uxbridge") && !s1.getTown().equalsIgnoreCase ("Whitby") && !s1.getTown().equalsIgnoreCase ("Bowmanville") && !s1.getTown().equalsIgnoreCase ("Port Perry"));
          
          s1.setStreet();

          do{
            s1.setPostal();
          }while(s1.getPostal().length()<6);

          System.out.println("\n(DELIVERY DATE)");
          
            
          //Display Customers Information
          System.out.println("\n\n--ALAM FLORISTS BILL OF SALE--\n------------------------------------------\nCUSTOMER'S INFORMATION\nName: " + s1.getFirst().substring(0,1).toUpperCase () + s1.getFirst().substring(1).toLowerCase() + " " + s1.getLast().substring(0,1).toUpperCase () + s1.getLast().substring(1).toLowerCase() + "\nAddress: " + s1.getStreet().substring(0,1).toUpperCase () + s1.getStreet().substring(1).toLowerCase() + " " + s1.getTown().substring(0,1).toUpperCase () + s1.getTown().substring(1).toLowerCase()+ ", ON " + s1.getPostal().toUpperCase() + "\nDelivery Date: " + s1.date() + "\n------------------------------------------");

          //Display subscription
          System.out.println("Subscription Ordered:" + subBouquetCount + "\n*****************************");

          //Display Price Component of Receipt
          s1.calcTotalSub();
        }//End of make a floral subscription




        //Place a new order
        else if (customMenu == 4){

          do{
            System.out.println("\n-- WELCOME TO PLACE A NEW ORDER --");

            //Overrided Abstract Method
            o1.classInfo();
            
            //Ask user for flower arrangement type
            do{
              o1.setFlowerArrangement();
            }while(o1.getFlowerArrangement() !=1 && o1.getFlowerArrangement() !=2 && o1.getFlowerArrangement() !=3 && o1.getFlowerArrangement() !=4 && o1.getFlowerArrangement() !=5 && o1.getFlowerArrangement() !=6);
            
            //Ask user for which item they would like to order
            if (o1.getFlowerArrangement() == 1){

              do{
                System.out.print("\n-BOUQUETS-\n1. Blooming Love Bouquet - $" + u1.prices[0][0] + "\n2. Lovely Lavender Bouquet - $" + u1.prices[0][1] + "\n3. Warm Sunset Bouquet - $" + u1.prices[0][2] + "\n4. Costal Breeze Bouquet - $" + u1.prices[0][3] + "\n\nWhich flower bouquet would you like to order? (#): ");
                o1.setBouquet(input.nextInt());
              }while(o1.getBouquet() !=1 && o1.getBouquet() !=2 && o1.getBouquet() !=3 && o1.getBouquet() !=4);
              
              o1.addOrder();
              o1.setCountOrderPrices();
              o1.setCountOrder();
            }

            else if (o1.getFlowerArrangement() == 2){

              do{
                System.out.print("\n-CORSAGES-\n1. White Rose Corsage - $" + u1.prices[1][0] + "\n2. Rose and Daisy Corsage - $" + u1.prices[1][1] + "\n3. Phalaenopsis Orchid Corsage - $" + u1.prices[1][2] + "\n4. White Gerbera Corsage - $" + u1.prices[1][3] + "\n\nWhich corsage flower would you like to order? (#): ");
                o1.setCorsage(input.nextInt());
              }while(o1.getCorsage() !=1 && o1.getCorsage() !=2 && o1.getCorsage() !=3 && o1.getCorsage() !=4);

              o1.addOrder();
              o1.setCountOrderPrices();
              o1.setCountOrder();
            }

            else if (o1.getFlowerArrangement() == 3){

              do{
                System.out.print("\n-BOUTONNIERES-\n1. White Rose Boutonniere - $" + u1.prices[2][0] + "\n2. Rose and Daisy Boutonniere - $" + u1.prices[2][1] + "\n3. Phalaenopsis Boutonniere - $" + u1.prices[2][2] + "\n4. Pink Cymbidium Boutonniere - $" + u1.prices[2][3] + "\n\nWhich boutonniere flower would you like to order? (#): ");
                o1.setBoutonnieres(input.nextInt());
              }while(o1.getBoutonnieres() !=1 && o1.getBoutonnieres() !=2 && o1.getBoutonnieres() !=3 && o1.getBoutonnieres() !=4);

              o1.addOrder();
              o1.setCountOrderPrices();
              o1.setCountOrder();
            }

            else if (o1.getFlowerArrangement() == 4){

              do{
                System.out.print("\n-FLORAL CENTERPIECES-\n1. Holiday Classics Centerpiece - $" + u1.prices[3][0] + "\n2. Wedding Glow Centerpiece - $" + u1.prices[3][1] + "\n3. Autumnal Hued Centerpiece - $" + u1.prices[3][2] + "\n4. Spring Bloom Centerpiece - $" + u1.prices[3][3] + "\n\nWhich floral centerpiece would you like to order? (#): ");
                o1.setCenterpiece(input.nextInt());
              }while (o1.getCenterpiece() !=1 && o1.getCenterpiece() !=2 && o1.getCenterpiece() !=3 && o1.getCenterpiece() !=4);

              o1.addOrder();
              o1.setCountOrderPrices();
              o1.setCountOrder();
            }
            else if (o1.getFlowerArrangement() == 5){

              do{
                System.out.print("\n-WREATHS-\n1. Hydrangea Berry Wreath - $" + u1.prices[4][0] + "\n2. Boxwood Wreath - $" + u1.prices[4][1] + "\n3. Rose Spring Wreath - $" + u1.prices[4][2] + "\n4. Green Succulent Wreath - $" + u1.prices[4][3] + "\n\nWhich flower wreath would you like to order? (#): ");
                o1.setWreaths(input.nextInt());
              }while (o1.getWreaths() !=1 && o1.getWreaths() !=2 && o1.getWreaths() !=3 && o1.getWreaths() !=4);

              o1.addOrder();
              o1.setCountOrderPrices();
              o1.setCountOrder();
            }

            else if (o1.getFlowerArrangement() == 6){

              do{
                System.out.print("\n-SINGLE FLOWERS-\n1. White Rose - $" + u1.prices[5][0] + "\n2. Pink Peonie - $" + u1.prices[5][1] + "\n3. Red Tulip - $" + u1.prices[5][2] + "\n4. Blue Hydrangea - $" + u1.prices[5][3] + "\n\nWhich single flower would you like to order? (#): ");
                o1.setSingles(input.nextInt());
              }while (o1.getSingles() !=1 && o1.getSingles() !=2 && o1.getSingles() !=3 && o1.getSingles() !=4);

              o1.addOrder();
              o1.setCountOrderPrices();
              o1.setCountOrder();
            }

            do{//Error check for yes/no
              System.out.print("\nWould you like to add another order? (Y/N): ");
              addItem = input.next();
            }while (!addItem.equalsIgnoreCase("Y") && !addItem.equalsIgnoreCase("N"));
          }while (addItem.equalsIgnoreCase("Y"));


          //Ask user for personal information
          if (addItem.equalsIgnoreCase("N")){
            System.out.println("\nPlease enter the following information to complete your order: ");

            o1.setFirst();
            o1.setLast();

            do{
              o1.setPhone();
            }while (o1.getPhone().length()<10);

            o1.setPickUp();

            //If customer is not picking up their order, ask for address
            if (o1.getPickUp().equalsIgnoreCase("N")){

              do{
                o1.setTown();
              }while (!o1.getTown().equalsIgnoreCase ("Ajax") && !o1.getTown().equalsIgnoreCase ("Brock") && !o1.getTown().equalsIgnoreCase ("Clarington") && !o1.getTown().equalsIgnoreCase ("Oshawa") && !o1.getTown().equalsIgnoreCase ("Pickering") && !o1.getTown().equalsIgnoreCase ("Scugog") && !o1.getTown().equalsIgnoreCase ("Uxbridge") && !o1.getTown().equalsIgnoreCase ("Whitby") && !o1.getTown().equalsIgnoreCase ("Bowmanville") && !o1.getTown().equalsIgnoreCase ("Port Perry"));


              o1.setStreet();
              o1.setPostal();

              //Display Customers Information
              System.out.println("\n\n--ALAM FLORISTS BILL OF SALE--\n------------------------------------------\nCUSTOMER'S INFORMATION\nName: " + o1.getFirst().substring(0,1).toUpperCase () + o1.getFirst().substring(1).toLowerCase() + " " + o1.getLast().substring(0,1).toUpperCase () + o1.getLast().substring(1).toLowerCase() + "\nPhone#: "+ o1.getPhone() + "\nAddress: " + o1.getStreet().substring(0,1).toUpperCase () + o1.getStreet().substring(1).toLowerCase() + " " + o1.getTown().substring(0,1).toUpperCase () + o1.getTown().substring(1).toLowerCase()+ ", ON " + o1.getPostal().toUpperCase() + "\nDelivery Date: Same day delivery\n------------------------------------------");

              //Display ALL orders
              System.out.println("Orders:" + o1.getCountOrder() + "\n**************************************");

              //Display Price Component of Receipt
              o1.calcCost();
              }

            //If customer is picking up their order 
            else if (o1.getPickUp().equalsIgnoreCase("Y")){
              System.out.println("\nGreat! Our Address is: \n123 Flower Ave,\nL1T 0Y2\nAjax, ON");

              //Display Customers Information
              System.out.println("\n\n--ALAM FLORISTS BILL OF SALE--\n------------------------------------------\nCUSTOMER'S INFORMATION\nName: " + o1.getFirst().substring(0,1).toUpperCase () + o1.getFirst().substring(1).toLowerCase() + " " + o1.getLast().substring(0,1).toUpperCase () + o1.getLast().substring(1).toLowerCase() + "\nPhone#: "+ o1.getPhone() + "\nDelivery Date: NONE (pick-up @ store)\n------------------------------------------");

              //Display ALL orders
              System.out.println("Orders:" + o1.getCountOrder() + "\n**************************************");

              //Display Price Component of Receipt
              o1.calcCost();
            }
          }
        }//End of place a new order



        //Quit customer menu
        else if (customMenu == 5){
          System.out.println("\n--EXITING CUSTOMER MENU--");
          break;
        }//End of quit

        do{//Error check for yes/no
          System.out.print("\nWould you like to return to the customer menu? (Y/N): ");
          customMenu1 = input.next();
        }while (!customMenu1.equalsIgnoreCase("Y") &&  !customMenu1.equalsIgnoreCase("N"));
      }while (customMenu1.equalsIgnoreCase("Y"));
    }//End of Customer Mode

      do{//Error check for yes/no
        System.out.print("\nWould you like to return to main menu? (Y/N): ");
        mainMenu = input.next();
      }while(!mainMenu.equalsIgnoreCase("Y") && !mainMenu.equalsIgnoreCase("N"));
  }while (mainMenu.equalsIgnoreCase("Y"));

  System.out.println("\n== PROGRAM OVER ==");

  }//End Main Method
}//End Class
