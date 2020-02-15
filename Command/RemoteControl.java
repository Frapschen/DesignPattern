/**
 * 请求者
 * 它不需要知道事情具体时怎么做到
 * 它只需要知道调用命令对象暴露的方法就行
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-------------Remote Control-------------\n");
        for(int i=0;i<onCommands.length;i++){
            stringBuffer.append("[solt "+i+"]"+onCommands[i].getClass().getName()+"    "
            +offCommands[i].getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }
    
}