/**
 * 这是抽象类创建者
 */
public abstract class PizzaStore{

    public Pizza orderPizzza(String type){
        Pizza pizza=null;
        //调用工厂方法
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    //抽象的工厂方法，具体创建Pizza的是子类
    abstract Pizza createPizza(String type);
}