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
public class PayDemo {

    public static void main(String[] args) {
        MarketBranch marketBranch = new MarketBranch("总店");
        MarketBranch qhdBranch = new MarketBranch("秦皇岛分店");
        MarketJoin hgqJoin = new MarketJoin("秦皇岛分店-海港区加盟店");
        MarketJoin btlJoin = new MarketJoin("秦皇岛分店二白塔岭加盟店");
        qhdBranch.add(hgqJoin);
        qhdBranch.add(btlJoin);
        marketBranch.add(qhdBranch);
        marketBranch.payByCard();
    }
}
