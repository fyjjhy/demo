package java_final;

/**
 * <Description> <br>
 * 在运行TestFinal2时，TestStaticFinal类不需要被载入
 * 代码编译时，会将常量替换成具体的值
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月03日 <br>
 * @see java_final <br>
 * @since V1.0 <br>
 */
public class TestFinal2 {

    public static void main(String[] args) {
        System.out.println(TestStaticFinal.NUM); // 代码编译时，会替换为:System.out.println(100);
    }
}

class TestStaticFinal {
    public static final int NUM = 100;
}
