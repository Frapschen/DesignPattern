/**
 * 具体的命令对象，它封装了接受者，
 * 给请求者了一个唯一的API
 */
public class GarageDoorCloserCommand implements Command{
    GarageDoor garageDoor;
    public GarageDoorCloserCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    public  void execute(){
        garageDoor.down();
    }
}