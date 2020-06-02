public class Whip extends CondimentDecorator{
    public Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
    public double cost() {
        return .20 + beverage.cost();
    }
}