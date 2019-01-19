/**
 * @Auther: user
 * @Date: 2019/1/18 17:14
 * @Description:
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
