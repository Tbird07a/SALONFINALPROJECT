public class CurlingSet extends Hair{


    boolean burnt = false;


    public CurlingSet(String product, int price, String effect_on_hair) {
        this.product = product;
        this.price = price;
        this.effect_on_hair = "curls your hair";

    }

// if you buy it you burn your hair

    public void burning()  {
        burnt = true;
        System.out.println("Burnt hair: " + burnt + " OH MY GOD YOUR HAIR IS ON FIRE");
    }}




