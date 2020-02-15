/**
 * 具体的产品
 */
public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicafo Style Deep Dish cheese pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzaredlla Cheese");
    }

    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}