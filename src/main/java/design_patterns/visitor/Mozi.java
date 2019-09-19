package design_patterns.visitor;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月18日 <br>
 * @see design_patterns.visitor <br>
 * @since V1.0 <br>
 */
public class Mozi {

    public void ride(Horse horse) {
        System.out.println("骑马");
    }

    public void ride(WhiteHorse whiteHorse) {
        System.out.println("骑白马");
    }

    public void ride(BlackHorse blackHorse) {
        System.out.println("骑黑马");
    }

    public static void main(String[] args) {
        Horse whiteHorse = new WhiteHorse();
        WhiteHorse whiteHorse1 = new WhiteHorse();
        Horse blackHorse = new BlackHorse();
        BlackHorse blackHorse1 = new BlackHorse();
        Mozi mozi = new Mozi();
        mozi.ride(whiteHorse);
        mozi.ride(whiteHorse1);
        mozi.ride(blackHorse);
        mozi.ride(blackHorse1);
    }
}
