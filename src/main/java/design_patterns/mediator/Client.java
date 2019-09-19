package design_patterns.mediator;

/**
 * <Description> 客户端类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月19日 <br>
 * @see design_patterns.mediator <br>
 * @since V1.0 <br>
 */
public class Client {

    public static void main(String[] args) {
        // 创建调停者--主板
        MainBoard mainBoard = new MainBoard();
        // 创建同事类
        CDDriver driver = new CDDriver(mainBoard);
        CPU cpu = new CPU(mainBoard);
        VideoCard videoCard = new VideoCard(mainBoard);
        SoundCard soundCard = new SoundCard(mainBoard);
        // 让调停者知道所有同事
        mainBoard.setCpu(cpu);
        mainBoard.setDriver(driver);
        mainBoard.setVideoCard(videoCard);
        mainBoard.setSoundCard(soundCard);
        // 开始看电影，把光盘放入光驱，光驱开始读盘
        driver.readCD();

    }
}
