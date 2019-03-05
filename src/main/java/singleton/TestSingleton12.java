package singleton;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月05日 <br>
 * @see singleton <br>
 * @since V1.0 <br>
 */
public class TestSingleton12 {

    private enum MyEnumSingleton {
        singletonFactory;

        private MySingleton mySingleton;

        MyEnumSingleton() {
            mySingleton = new MySingleton();
        }

//        public MySingleton getInstance() {
//            return mySingleton;
//        }

        public static MySingleton getInstance() {
            return MyEnumSingleton.singletonFactory.getInstance();
        }
    }
}
