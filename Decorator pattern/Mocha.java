/**
 * 装饰者，他有一个被装饰者超类的实例变量
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    //关键点，在执行被装置者的行为前，做点什么
    public double cost(){
        return .20 + beverage.cost();
    }
}