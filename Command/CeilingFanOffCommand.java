/**
 * 具体的命令对象，它封装了接受者，
 * 给请求者了一个唯一的API
 */
public class CeilingFanOffCommand implements Command{
    public CeilingFan ceilingFan;
    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }
    public void execute(){
        ceilingFan.off();
    }
}