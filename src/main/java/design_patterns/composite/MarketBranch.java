package design_patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> 分店 下面可以有加盟店<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月12日 <br>
 * @see design_patterns.composite <br>
 * @since V1.0 <br>
 */
public class MarketBranch extends Market {

    // 加盟店列表
    List<Market> list = new ArrayList<>();

    public MarketBranch(String str) {
        this.name = str;
    }

    @Override
    public void add(Market market) {
        list.add(market);
    }

    @Override
    public void remove(Market market) {
        list.remove(market);
    }

    @Override
    public void payByCard() {
        System.out.println(name + "消费，积分已累加入该会员卡");
        for (Market market : list) {
            market.payByCard();
        }
    }
}
