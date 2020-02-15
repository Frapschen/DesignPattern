/**
 * 接受者
 */
public class GarageDoor{
    public String name;
    public GarageDoor(String name){
        this.name = name;
    }
    public void up(){
        System.out.println("上升");
    }
    public void down(){
        System.out.println("下降");
    }
    public void stop(){
        System.out.println("暂停");
    }
    public void lightOn(){
        System.out.println("开灯！");
    }
    public void lightOff(){
        System.out.println("关灯！");
    }
}