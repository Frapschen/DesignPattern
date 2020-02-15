/**
 * 具体的组件，被装饰者
 */
public class Espresso extends Beverage{
    public Espresso(){
        description = "Espresso";
    }
    public double cost(){
        return 1.99;
    }
}