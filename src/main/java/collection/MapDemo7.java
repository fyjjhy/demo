package collection;

import entity.GoodsOrder;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月25日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class MapDemo7 {

    public static void main(String[] args) {
        List<GoodsOrder> goodsOrders = new ArrayList<>();
        goodsOrders.add(new GoodsOrder("10000", "2", "1"));
        goodsOrders.add(new GoodsOrder("20000", "1", "2"));
        goodsOrders.add(new GoodsOrder("30000", "1", "3"));
        Map<String, Integer> map = new HashMap<>();
        // map.put("total", 0);
        // int totalPrice = 0;
        for (GoodsOrder goodsOrder : goodsOrders) {
//                if (goodsOrder.getPayFee() > maxPayFee) {
//                    maxMap.clear();
//                    maxPayFee = goodsOrder.getPayFee();
//                    maxMap.put(goodsOrder.getGoodsCode(), orderDetail.getDiscountPrice());
//                }
            int goodsTotal = new BigDecimal(goodsOrder.getGoodsPrice()).multiply(new BigDecimal(goodsOrder.getGoodsNumber())).intValue();
            int goodsServiceOrderTotal = 0;
            int totalPrice = goodsTotal + goodsServiceOrderTotal;
            map.put(goodsOrder.getGoodsCode(), totalPrice);
            // map.put("total", map.get("total") + map.get(goodsOrder.getGoodsCode()));
        }
        int discountPrice = 1000;
        int size = map.size();
        int price = 0;
        int i = 0;
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            i++;
            if (size - i == 0) {
                map.put(m.getKey(), discountPrice - price);
            }
            else {
                System.out.println(m.getKey() + ":" + m.getValue());
                int per = new BigDecimal(discountPrice).multiply(new BigDecimal(m.getValue())).divide(new BigDecimal(70000), 0, RoundingMode.HALF_UP).intValue();
                System.out.println("per:" + per);
                price += per;
                map.put(m.getKey(), per);
            }
        }

//        for (GoodsOrder goodsOrder : goodsOrders) {
//            if (map.get(goodsOrder.getGoodsCode()) != null) {
//                goodsOrder.setDiscountPrice(map.get(goodsOrder.getGoodsCode()));
//                map.remove(goodsOrder.getGoodsCode());
//            }
//        }
        System.out.println(map);
    }
}
