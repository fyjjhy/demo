package design_patterns.mediator;

/**
 * <Description> 同事类--显卡<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月19日 <br>
 * @see design_patterns.mediator <br>
 * @since V1.0 <br>
 */
public class VideoCard extends Colleague {
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    public void showData(String data) {
        System.out.println("您正在观看的是：" + data);
    }
}
