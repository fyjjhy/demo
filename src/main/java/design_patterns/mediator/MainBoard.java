package design_patterns.mediator;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月19日 <br>
 * @see design_patterns.mediator <br>
 * @since V1.0 <br>
 */
public class MainBoard implements Mediator {

    //需要知道要交互的同事类——光驱类
    private CDDriver driver;

    //需要知道要交互的同事类——CPU类
    private CPU cpu;

    //需要知道要交互的同事类——显卡类
    private VideoCard videoCard;

    //需要知道要交互的同事类——声卡类
    private SoundCard soundCard;

    public void setDriver(CDDriver driver) {
        this.driver = driver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    @Override
    public void changed(Colleague colleague) {
        if (colleague instanceof CDDriver) {
            // 表示光驱读数据了
            System.out.println("开始读取光驱数据");
            this.opeCDDriverReadData((CDDriver) colleague);
        } else if (colleague instanceof CPU) {
            this.opeCPU((CPU) colleague);
        }
    }

    // 处理光驱读取数据以后与其他对象的交互
    private void opeCDDriverReadData(CDDriver driver) {
        // 先获取光驱读取的数据
        String data = driver.getData();
        // 将数据传递给CPU进行处理
        cpu.executeData(data);
    }

    private void opeCPU(CPU cpu) {
        // 先获取CPU处理后的数据
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();
        // 把数据传递给显卡和声卡展示
        videoCard.showData(videoData);
        soundCard.soundData(soundData);
    }
}
