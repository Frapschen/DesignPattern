/**
 * 具体的命令对象，它封装了接受者，
 * 给请求者了一个唯一的API
 */
public class StereoWithCDCommand implements Command {
    Stereo stereo;

    public StereoWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
    
}