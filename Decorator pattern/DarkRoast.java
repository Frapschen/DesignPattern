/**
 * 具体的组件(被装饰者)
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Darkroast Coffess";
    }

    public double cost(){
        return .99;
    }
}