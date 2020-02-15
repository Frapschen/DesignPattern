/**
 * 具体的接收者
 */
public class Light{
    public String namne;
    public Light(String name){
        this.namne = name;
    }
    public void on(){
        System.out.println(namne+" 开灯！");
    }
    public void off(){
        System.out.println(namne+" 关灯！");
    }
}