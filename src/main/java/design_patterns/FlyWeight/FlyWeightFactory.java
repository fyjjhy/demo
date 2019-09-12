package design_patterns.FlyWeight;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月11日 <br>
 * @see design_patterns.FlyWeight <br>
 * @since V1.0 <br>
 */
public class FlyWeightFactory {

    private Map<String, FlyWeight> flyweights = new HashMap<>();

    public FlyWeight getFlyWeight(String str) {
        FlyWeight flyWeight = flyweights.get(str);
        if (flyWeight == null) {
            flyWeight = new ConcreteFlyWeight(str);
            flyweights.put(str, flyWeight);
        }
        return flyWeight;
    }

    public int getFlyWeightSize() {
        return flyweights.size();
    }
}
