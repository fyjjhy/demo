package java_final;

import lombok.Getter;
import lombok.Setter;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see java_final <br>
 * @since V1.0 <br>
 */
@Getter
@Setter
public class TestFinal1 {

    private final int age;

    public TestFinal1(int age) {
        this.age = age;
    }

//    public void testFinal() {
//        age = 99;
//    }
public static void main(String[] args) {
    TestFinal1 testFinal1 = new TestFinal1(20);
    System.out.println(testFinal1.getAge());
}
}
