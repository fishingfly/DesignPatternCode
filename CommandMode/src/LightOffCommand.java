/**
 * @Auther: user
 * @Date: 2019/1/18 17:27
 * @Description:
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
