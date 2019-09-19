package design_patterns.mediator;

/**
 * <Description> 同事类--光驱<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月19日 <br>
 * @see design_patterns.mediator <br>
 * @since V1.0 <br>
 */
public class CDDriver extends Colleague {

    // 光驱读取出来的数据
    private String data = "";

    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    public String getData() {
        return data;
    }

    // 读取光盘
    public void readCD() {
        // 逗号前是视频数据，逗号后是声音数据
        this.data = "One Piece,海贼王我当定了";
        // 通知主板，自己的状态发生了变化
        getMediator().changed(this);
    }
}
