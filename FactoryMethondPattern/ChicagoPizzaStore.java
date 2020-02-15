public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        } else if(type.equals("pepperoin")){
            return new ChicagoStylePeperoniPizza();
        } else if(type.equals("veggie")){
            return new ChicagoStyleVeggie();
        } else{
            return null;
        }
    }
    
}