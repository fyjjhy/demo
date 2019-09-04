package design_patterns;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月04日 <br>
 * @see design_patterns <br>
 * @since V1.0 <br>
 */
public class FactoryBMW320_2 implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public AirCondition createAirCondition() {
        return new AirConditionA();
    }
}
