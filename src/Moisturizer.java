public class Moisturizer extends Makeup{


    boolean smooth = false;


    public Moisturizer(String product, int price, String effect_on_face) {
        this.product = product;
        this.price = price;
        this.effect_on_makeup = " makes skin smooth ";

    }



    public void smoothing() {
        smooth = true;
        System.out.println ("Smooth: " + true + " WOW YOUR SKIN IS SO SMOOTH");
    }}

