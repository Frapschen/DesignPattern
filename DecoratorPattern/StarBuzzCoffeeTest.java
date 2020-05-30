public class StarBuzzCoffeeTest {
    public static void main(String[] args) {
        //新建一个咖啡
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+ "$" + beverage.cost());


        //新建一个咖啡
        Beverage beverage2 = new DarkRoast();

        //使用装饰者类去装饰咖啡
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        //获取装饰的结果，
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());


        Beverage beverage3 = new HouseBlend();

        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription()+ " $ "+ beverage3.cost());



    }
}