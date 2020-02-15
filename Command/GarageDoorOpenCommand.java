/**
 * 具体的命令对象，它封装了接受者，
 * 给请求者了一个唯一的API
 */
public class GarageDoorOpenCommand implements Command{
    public GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        garageDoor.up();;
        garageDoor.lightOn();
    }
    
}