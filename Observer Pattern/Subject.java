/**
 * 这个是主题接口，它可以推送信息到观察者
 */
public interface Subject{
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}