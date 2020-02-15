/**
 * 具体的接收者
 */
public class Stereo{
    public String name;
    public Stereo(String name){
        this.name = name;
    }
    public void on(){
        System.out.println(name + " Stereo  on!");
    }
    public void off(){
        System.out.println(name+" Stereo off!");
    }
    public void setCd(){
        System.out.println("Stereo setCd!");
    }
    public void setDvd(){
        System.out.println("Stereo setDvd!");
    }
    public void setRadio(){
        System.out.println("Stereo Radio!");
    }
    public void setVolume(int voc){
        System.out.println("Stereo set Vloume "+voc);
    }

}