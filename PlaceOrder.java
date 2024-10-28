
import java.util.Scanner;

public class PlaceOrder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BasePizza base = new BasePizza();
      
        System.out.println("*******Welcome To Chidex Pizza's Place******");
        System.out.println("Select Your Pizza Option: "+
                            "\n a. Base Pizza" +
                            "\n b. Premium Pizza");

    String pizzaOption = scan.nextLine();

   
           switch (pizzaOption) {
               case "base":
               //select vegan or non vegan
               System.out.println("Select Base Pizza Type: " +
                                    "\n a. Vegan" +
                                    "\nb. Non-Vegan");
                String basePizzaOption = scan.nextLine();
                
                //vegan option
                if(basePizzaOption.equalsIgnoreCase("vegan")){

                    System.out.println("Select Topping: ");
                    //add cheese
                    base.addCheese();

                    //add pepperoni
                    base.addPepperoni();

                    //add black olives
                    base.addBlackOlives();

                    //add sausage
                    base.addSusage();

                    //add takeout
                    base.AddTakeout();

                    base.getTotalBaseVeganBill();
                

                }

                   break;




               default:
                   System.out.println("Incorrect Order...");
           } 
    
     
    }
    
}
