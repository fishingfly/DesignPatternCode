/**
 * @Auther: user
 * @Date: 2019/1/18 17:29
 * 命令模式可以用于日志和队列中。
 * @Description:
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        remoteControl.setCommand(0,new LightOnCommand(light), new LightOffCommand(light));
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
    }
}
