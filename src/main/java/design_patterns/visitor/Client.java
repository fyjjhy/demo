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
public class Client {

    public static void main(String[] args) {
        Horse blackHorse = new BlackHorse();
        Horse whiteHorse = new WhiteHorse();
        blackHorse.eat();
        whiteHorse.eat();
    }
}
