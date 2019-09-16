package design_patterns.watcher;

/**
 * <Description> 具体的观察者-警察<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月16日 <br>
 * @see design_patterns.watcher <br>
 * @since V1.0 <br>
 */
public class Police implements Watcher {
    @Override
    public void update() {
        System.out.println("运输车有行动，警察护航");
    }
}
