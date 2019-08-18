package finalClass;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月16日 <br>
 * @see finalClass <br>
 * @since V1.0 <br>
 */
public final class FinalClass1 {
    private final int[] myArray;

    public FinalClass1(int[] array) {
        this.myArray = array.clone();
    }

    public int[] getMyArray() {
        return myArray;
    }
}
