package design_patterns.facade;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月08日 <br>
 * @see design_patterns.facade <br>
 * @since V1.0 <br>
 */
public class FacadePattern {
    public static void main(String[] args) {
        SubSystemA_Light light = new SubSystemA_Light();
        SubSystemB_Television television = new SubSystemB_Television();
        SubSystemC_Aircondition aircondition = new SubSystemC_Aircondition();
        // 起床后开电器
        System.out.println("起床了");
        light.on();
        television.on();
        aircondition.on();
        System.out.println("可以看电视了");

        // 睡觉时关电器
        System.out.println("睡觉了");
        light.off();
        television.off();
        aircondition.off();
        System.out.println("可以睡觉了");
    }
}
