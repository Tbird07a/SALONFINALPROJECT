public class Hair {

    public String product;
    public double price;
    public String effect_on_hair;
    public static boolean smooth;


    public Hair() {
    }


    public Hair(String product, int price, String effect_on_hair) {
        this.product = product;
        this.price = price;
        this.effect_on_hair = effect_on_hair;

    }

// one example of a polymorphic method
    public void printInfo() {
        System.out.println(product + " is a hair product that costs $" + price + " and " + effect_on_hair );
    }
// another polymorphic method
    public double discount() {
        this.price = price * 0.85;
        System.out.println("A 15% discount has been applied to this hair product");
        return price;

    }
    // another polymorphic method
    public static void smoothing() {

        System.out.println("Smooth: " + false + " YOU CANNOT SMOOTH YOUR FACE WITH THIS. GET OUT!");
    }

    public double final_price() {
        return price;
    }



}


