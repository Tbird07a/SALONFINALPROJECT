public class Makeup {

    public String product;
    public double price;
    public String effect_on_makeup;


    public Makeup() {
    }


    public Makeup(String product, int price, String effect_on_hair) {
        this.product = product;
        this.price = price;
        this.effect_on_makeup = effect_on_makeup;

    }


    public void printInfo() {
        System.out.println(product + "is a makeup product that costs $" + price + " and " + effect_on_makeup + " your face");
    }

    public void discount() {
        this.price = price * 0.80;
        System.out.println("A 20% discount has been applied to this makeup product");
    }
}