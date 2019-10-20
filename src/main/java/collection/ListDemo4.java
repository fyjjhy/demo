package collection;

import common.DateConstant;
import entity.DeliveryTimeConfig;
import entity.GoodsOrder;
import org.apache.commons.lang3.StringUtils;
import utils.DateUtil.DateUtil;
import utils.GlobalConstants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月23日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class ListDemo4 {

    public static void main(String[] args) {
        // 获取预约配送设置
        String orderSet = "1";
        // 获取可配送天数配置
        String deliveryDays = "7";
        // 不可配送日期设置
        String nonDeliveryDays = "09-26,09-27";
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(DateUtil.getCurrentDate());
        int year = calendar.get(Calendar.YEAR);
        calendar.add(Calendar.DAY_OF_YEAR, Integer.parseInt(orderSet));
        List<DeliveryTimeConfig> configs = new ArrayList<>();
        List<String> disabledList = new ArrayList<>();
        if (StringUtils.isNotEmpty(nonDeliveryDays)) {
            for (String date : nonDeliveryDays.split(GlobalConstants.SPLITOR)) {
                StringBuilder stringBuilder = new StringBuilder(year);
                stringBuilder.append(year).append(GlobalConstants.LINE).append(date);
                disabledList.add(stringBuilder.toString());
            }
        }
        System.out.println(disabledList);
        for (int i = 0, len = Integer.parseInt(deliveryDays); i < len; i++) {
            DeliveryTimeConfig deliveryTimeConfig = new DeliveryTimeConfig();
            calendar.add(Calendar.DAY_OF_YEAR, i);
            String deliveryTime = DateUtil.data2String(calendar.getTime(), DateConstant.DATE_FORMAT_10);
            deliveryTimeConfig.setDeliveryTime(deliveryTime);
            if (!disabledList.contains(deliveryTime)) {
                deliveryTimeConfig.setDisabled(false);
            }
            else {
                deliveryTimeConfig.setDisabled(true);
            }
            calendar.add(Calendar.DAY_OF_YEAR, -i);
            configs.add(deliveryTimeConfig);
        }
        System.out.println(configs);
    }
}
