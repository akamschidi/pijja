
import java.util.Scanner;

public class BasePizza implements Pizza{

    Scanner scan = new Scanner(System.in);

    //int currentBill = 0;
    int total = 0;
    int vegan = 400;
    int nonVegan = 500;
    int cheese = 50; 
    int pepperoni = 70;
    int blackOlives = 50;
    int sausage = 100;
    int takeout = 20;
    boolean isCheese = false;
    boolean isPepperoni = false;
    boolean isBlackOlives = false;
    boolean isSusage = false;
    boolean isTakeOut = true; 

  @Override
    public void addCheese(){

          //add cheese
          isCheese = true;
        System.out.println("Add Cheese: Yes or No");
          String addCheeseBase = scan.nextLine();
          if (addCheeseBase.equalsIgnoreCase("yes")){
            System.out.println("You Added Cheese To Your Order");
           // addCheese();
             total= cheese + vegan;
           // System.out.println(total);

          }
          else{
              System.out.println("No Cheese Topping. Select Other Options. ");
          } 
        

    }

    @Override
    public void addCheeseNonVegan(){

    }

    @Override
    public void addPepperoni(){

          //add pepperoni 
          isPepperoni = true;
          System.out.println("Add Pepperoni: Yes or No");
          String addPepperoniBase = scan.nextLine();
          if(addPepperoniBase.equalsIgnoreCase("yes")){
            System.out.println("You Added Pepperoni To Your Order");
            //int total= cheese + vegan;
             //System.out.println(total);
          }
          else{
              System.out.println("No Pepperoni Topping. Select Other Options. ");
          }

        


    }

    @Override
    public void addPpepperoniNonVegan(){

    }

@Override
    public void addBlackOlives(){
isBlackOlives = true;
        System.out.println("Add Black Olives: Yes or No");
                    String addBlackOlivesBase = scan.nextLine();
                    if(addBlackOlivesBase.equalsIgnoreCase("yes")){
                        System.out.println("You Added Black Olives To Your Order");
                    //int total= cheese + vegan;
                     //System.out.println(total);
                    }
                    else{
                        System.out.println("No Black Olives. Select Other Options. ");
                    }

    }

    @Override
    public void addBlackOlivesNonVegan(){

    }

    @Override
    public void addSusage(){
        isSusage = true;
        System.out.println("Add Sausage: Yes or No");
        String addSausageBase = scan.nextLine();
        if(addSausageBase.equalsIgnoreCase("yes")){
            System.out.println("You Added Pepperoni To Your Order");
            //int total= cheese + vegan;
             //System.out.println(total)
        }
        else{
            System.out.println("No Sausage Added. Select Other Options. ");
        }

       

    }

    @Override
    public void addSusageNon(){

    }


    @Override
    public void AddTakeout(){
        isTakeOut = true;
        System.out.println("Order As Takeout: Yes or No");
        String addTakeOutBase = scan.nextLine();
        if(addTakeOutBase.equalsIgnoreCase("yes")){
            System.out.println("Take Out Order: Wait For Total");
           // int total= cheese + vegan;
             //System.out.println(total)
        }
        else{
            System.out.println("No Take Out... Check For Total ");
        }

    }

    @Override
    public void AddTakeoutNon(){

    }

    public void getTotalBaseVeganBill(){

        if(isCheese){
           
            total = total + cheese;
        }
        if(isPepperoni){
            total += pepperoni;
        }

        if(isBlackOlives){
            total += blackOlives;
        }
        if(isSusage){
            total += sausage;
        }
        if(isTakeOut){
            total += takeout;
        }

        else{
            total = total + vegan;
        }

        System.out.println("Your Total Bill Is: " + total);
    }
}