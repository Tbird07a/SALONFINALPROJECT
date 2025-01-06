import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total = 0;
        boolean alive;
        boolean VIP = false;

        alive = true;

        System.out.println("Hello Welcome to the Salon!");

        Scanner name = new Scanner(System.in);
        System.out.print("Are you a VIP? y/n  "); //Sets player's VIP Status
        String VIP_response = name.nextLine();
        if (VIP_response.equals("y")) {
            VIP = true;
            System.out.println("You are VIP AND WILL GET MANY DISCOUNTS");
        }
        if (VIP_response.equals("n")) {

            System.out.println("You are NOT VIP AND WILL GET NO DISCOUNTS");
        }

        while (alive == true)  {


            System.out.println("You shall have your hair done now!");
            // Process for having hair done
            Scanner name1 = new Scanner(System.in);
            System.out.print("Which product would you like? TYPE C FOR CURLING SET. TYPE D FOR HAIR DYE. ");
            String product = name.nextLine();

            if (product.equals("C") && alive == true) { // If you buy a curling set
                CurlingSet CurlingSet = new CurlingSet("Curling Set", 500, "burns your hair");
                double price_product = CurlingSet.final_price();
                if (VIP == true) {
                    price_product = CurlingSet.discount();
                }

                total = total + price_product;
                CurlingSet.printInfo();

                System.out.println("We shall now use the product");
                CurlingSet.burning();
                System.out.println("YOU HAVE LOST. GOODBYE");
                alive = false;
            }


            if (product.equals("D") && alive == true) { // If you buy hair dye
                Hair dye = new Hair("Hair Dye", 100000, "dyes your hair");

                if (VIP) {
                    dye.discount();
                }
                double price_product = dye.final_price();
                total = total + price_product;

                System.out.println("We shall now use the product");
                dye.printInfo();

                Scanner name2 = new Scanner(System.in);
                System.out.print("Would you like to use this product to moisturize? y/n  ");
                String moist_response = name.nextLine();

                if ((moist_response.equals("y"))) { // You lose if you think you can use the product to moisturize
                    Hair.smoothing();
                    System.out.println("YOU HAVE LOST. GOODBYE");
                    alive = false;
                }

                if ((moist_response.equals("n"))) {

                    System.out.println("That makes sense. Your hair is now dyed. The product has now been added to your total.");

                }}
            if (alive == true) { // Process of getting makeup done
                System.out.println("We shall now work on your face");
                Scanner name3 = new Scanner(System.in);
                System.out.print("Which product would you like? TYPE M FOR Moisturizer. TYPE B FOR BLUSH. ");
                String product2 = name.nextLine();

              if (product2.equals("M")) { // If you buy moisturizer
                Moisturizer Moisturizer = new Moisturizer("Moisturizer", 500, "makes skin smooth");
                double price_product;
                if (VIP) {
                    Moisturizer.discount();
                }
                price_product = Moisturizer.final_price();
                total = total + price_product;
                Moisturizer.printInfo();
                System.out.println("We shall now use the product. It has been added to your total");
                Moisturizer.smoothing();

            }

             if (product2.equals("B")) { // if you buy blush
                Makeup blush = new Makeup("blush", 1000, "puts on blush");
                if (VIP) {
                    blush.discount();
                }
                double price_product = blush.final_price();
                total = total + price_product;
                blush.printInfo();
                System.out.println("We shall use the product. It has been added to your total.");

            }

             System.out.println("CONGRATS YOU MADE IT THROUGH YOUR VISIT. YOUR TOTAL IS: " + total + " BUT WE DECIDED TO PAY IT FOR YOU! GOODBYE!"); // how it ends
             alive = false;
            }
            }



        }}












