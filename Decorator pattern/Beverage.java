//装饰者于被装饰者共同的超类
public abstract class Beverage {
   public  String description = "Unknown Berverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}