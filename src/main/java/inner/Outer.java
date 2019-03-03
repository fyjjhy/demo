package inner;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see inner <br>
 * @since V1.0 <br>
 */
public class Outer {

    private int time;

    private Inner inner;

    public Outer(int time) {
        this.time = time;
        inner = new Inner();
        inner.timeInc();
    }

    public void printTime() {
        System.out.println(time);
    }

    class Inner {
        public void timeInc() {
            time++;
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer(100);
        outer.printTime();
    }
}
