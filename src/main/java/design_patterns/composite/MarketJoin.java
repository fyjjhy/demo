package design_patterns.composite;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月12日 <br>
 * @see design_patterns.composite <br>
 * @since V1.0 <br>
 */
public class MarketJoin extends Market {

    public MarketJoin(String str) {
        this.name = str;
    }

    @Override
    public void add(Market market) {

    }

    @Override
    public void remove(Market market) {

    }

    @Override
    public void payByCard() {
        System.out.println(name + "消费，积分已累加入该会员卡");
    }
}
