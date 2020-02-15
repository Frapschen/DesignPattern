public class PizzaTestDrive{
    /**
     * 测试类
     * @param args
     */
    public static void main(String[] args) {
        //创建两个地方的披萨店
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        /**
         * 点纽约风格的cheese披萨，这里的orderPizza会调用createpizza方法，
         * 这个方法由NYStylePizzaStore类具体实现，这个就是工厂方法，它将类的实例
         * 放到了子类中了。
         */
        Pizza pizza = nyStore.orderPizzza("Cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizzza("cheese");
        System.out.println("Joel orderd a "+ pizza.getName() + "\n");
    }
}