package design_patterns.mediator;

/**
 * <Description> 同事类--CPU<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月19日 <br>
 * @see design_patterns.mediator <br>
 * @since V1.0 <br>
 */
public class CPU extends Colleague {

    // 分解出来的视频数据
    private String videoData = "";

    // 分解出来的声音数据
    private String soundData = "";

    public CPU(Mediator mediator) {
        super(mediator);
    }

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    public void executeData(String data) {
        // 把数据分解开，前面是视频数据，后面是音频数据
        String[] array = data.split(",");
        this.videoData = array[0];
        this.soundData = array[1];
        // 通知主板，CPU完成工作
        getMediator().changed(this);
    }
}
