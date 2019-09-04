package design_patterns;

/**
 * <Description> 创建工厂接口<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月04日 <br>
 * @see design_patterns <br>
 * @since V1.0 <br>
 */
public interface AbstractFactory {
    // 制造发动机
    public Engine createEngine();

    // 制造空调
    public AirCondition createAirCondition();
}
