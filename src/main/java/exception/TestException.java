package exception;

/**
 * <Description> 测试异常关系链<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月21日 <br>
 * @see exception <br>
 * @since V1.0 <br>
 */
public class TestException {
    public void highLevelAccess() throws HighLevelException {
        try {
            middleLevelAccess();
        } catch (Exception e) {
            throw new HighLevelException(e);
        }
    }

    public void middleLevelAccess() throws MiddleLevelException {
        try {
            lowLevelAccess();
        } catch (Exception e) {
            throw new MiddleLevelException(e);
        }
    }

    public void lowLevelAccess() throws LowLevelException {
        throw new LowLevelException();
    }

    public static void main(String[] args) {
        /*
         * lowLevelAccess()将异常对象抛给middleLevelAccess()，而
         * middleLevelAccess()又将异常对象抛给highLevelAccess(),
         *也就是底层的异常对象一层层传递给高层。最终在在高层可以获得底层的异常对象。
         */
        try {
            new TestException().highLevelAccess();
        } catch (HighLevelException e) {
            e.printStackTrace();
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e);
        }

    }
}
