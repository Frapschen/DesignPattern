public class TurkeyAdapter implements APFPDuck{
    Turkey Turkey;
    public TurkeyAdapter(Turkey Turkey){
        this.Turkey = Turkey;
    }
    public void quack(){
        Turkey.gobble();
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        for(int i=0;i<5;i++){
            Turkey.fly();
        }
    }
}