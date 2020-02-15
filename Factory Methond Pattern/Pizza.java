import java.util.ArrayList;
/**
 * 工厂产品的抽象类
 */
public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    ArrayList toppings = new ArrayList();

    
    public void prepare(){
        System.out.println("Perparing "+ name);
        System.out.println("Tossing dogh...");
        System.out.println("Adding sauce...");
        for(int i =0 ;i < toppings.size(); i++){
            System.out.println("    "+ toppings.get(i));
        }
    };
    public void bake(){
        System.out.println("Bake for 25 miuntes at 350");
    };
    public void cut(){
        System.out.println("Cuting the pizza into diagonal slices");
    };
    public void box(){
        System.out.println("Place pizza in officiial PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public ArrayList getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList toppings) {
        this.toppings = toppings;
    };
}