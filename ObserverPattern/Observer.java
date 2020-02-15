/**
 * 这是观察者，当主题发生改变时这个update方法会被调用
 */
public interface Observer{
    public void update(float temp, float humidity, float pressuer);
}