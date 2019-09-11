package gc;

import java.util.Vector;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月03日 <br>
 * @see gc <br>
 * @since V1.0 <br>
 */
public class Test_GC {
    public static void main(String[] args) {
        Vector<Emp> vector = new Vector<>(10);
        for (int i = 0; i < 100; i++) {
            Emp emp = new Emp("星期" + i);
            vector.add(emp);
            emp = null;
        }

        System.out.println(vector.size());
        for (Emp o : vector) {
            System.out.println(o);
            System.out.println(o.getName());
        }
        
    }
}
