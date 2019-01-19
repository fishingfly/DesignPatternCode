/**
 * @Auther: user
 * @Date: 2019/1/18 17:16
 * @Description:
 */
public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
