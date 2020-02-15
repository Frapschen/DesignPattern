public class RemoteControlTest{
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        //硬件有关的类，接收者;
        Light livlight = new   Light("Living Room Light");
        Light kitcheLight = new Light("Kitchen Light");
        CeilingFan ceilingFan =new CeilingFan("Living Room CeilingFan");
        GarageDoor garageDoor =new GarageDoor("");
        Stereo stereo = new Stereo("Living Room Stereo");

        //命令对象，它封装了具体的接收者
        LightOnCommand lightOn = new LightOnCommand(livlight);
        LightOffCommand lightOff = new LightOffCommand(livlight);

        LightOnCommand kitlightOn = new LightOnCommand(kitcheLight);
        LightOffCommand kitlightOff = new LightOffCommand(kitcheLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageoDoorOn = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloserCommand GarageoDoorOff = new GarageDoorCloserCommand(garageDoor);

        StereoWithCDCommand stereoOn = new StereoWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        //将命令对象绑定到发送者
        remote.setCommand(0, lightOn, lightOff);
        remote.setCommand(1, kitlightOn, kitlightOff);
        remote.setCommand(2, ceilingFanOn, ceilingFanOff);
        remote.setCommand(3, garageoDoorOn, GarageoDoorOff);
        remote.setCommand(4, stereoOn, stereoOff);

        //输出绑定信息
        System.out.println(remote);

        /**
         * 调用请求者的方法，请求者不需要知道事情具体怎么做到，
         * 它只要调用这个方法，就可以完成任务，
         * 这样，请求者与接收者就解耦了
         */
        remote.onButtonWasPushed(0);
    }
}