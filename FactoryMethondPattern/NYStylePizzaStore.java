/**
 * 继承创建者，它实现具体的工厂方法，制造产品：纽约风格的披萨
 */
public class NYStylePizzaStore extends PizzaStore{
    
    public Pizza createPizza(String type){
        
        if(type.equals("Cheese")){
            return new NYStyleCheesePizza();
        } else if(type.equals("pepperoin")){
            return new NYStylePeperoniPizza();
        } else if(type.equals("veggie")){
            return new NYStyleVeggie();
        } else {
            return null;
        }

    }
}