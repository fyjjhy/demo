package design_patterns.watcher;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月16日 <br>
 * @see design_patterns.watcher <br>
 * @since V1.0 <br>
 */
public class WatcherPattern {

    public static void main(String[] args) {
        Transporter transporter = new Transporter();
        // 警察
        Police police = new Police();
        // 保镖
        Security security = new Security();
        // 强盗
        Thief thief = new Thief();

        transporter.addWatcher(police);
        transporter.addWatcher(security);
        transporter.addWatcher(thief);

        transporter.notifyWatchers();
    }
}
