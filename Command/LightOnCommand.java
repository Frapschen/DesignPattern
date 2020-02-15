/**
 * 具体的命令对象，它封装了接受者，
 * 给请求者了一个唯一的API
 */
public class LightOnCommand implements Command{
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.on();
    }
}