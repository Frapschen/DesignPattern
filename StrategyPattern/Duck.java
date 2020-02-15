public abstract class Duck{
    /**
     * 面向接口编程，在Duck类中，只关心能做什么，不关心怎么去做，
     * 所以这里定义的是接口，真正去做的实现了这些接口的类，通过这样的组合，
     * 让他们可以互相替换，实现了在不改变原有的代码情况下，一个具体行为可
     * 以有不同的实现
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck(){};
    public abstract void display();
    
    //调用接口的方法
    public void performFly(){
        flyBehavior.fly();
    };
    public void performQuack(){
        quackBehavior.quack();
    };
    
    //动态的修改行为
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuqackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    //一般方法
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

}