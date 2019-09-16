package design_patterns.watcher;

/**
 * <Description> 抽象的被观察者<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月16日 <br>
 * @see design_patterns.watcher <br>
 * @since V1.0 <br>
 */
public interface Watched {
    // 添加
    void addWatcher(Watcher watcher);

    // 移除
    void removeWatcher(Watcher watcher);

    // 通知
    void notifyWatchers();
}
