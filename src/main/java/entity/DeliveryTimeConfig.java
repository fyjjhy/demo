package entity;

import lombok.Getter;
import lombok.Setter;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月23日 <br>
 * @see com.hbasesoft.vcc.sgp.erp.order.api.bean <br>
 * @since V1.0 <br>
 */
@Getter
@Setter
public class DeliveryTimeConfig extends AbstractVo {

    private static final long serialVersionUID = 622098273303440685L;

    // 预约配送设置
    private Integer orderSet;

    // 可配送天数配置
    private Integer deliveryDays;

    // 不可配送日期设置
    private String nonDeliveryDays;

    private String deliveryTime;

    private boolean disabled;

    public Integer getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Integer orderSet) {
        this.orderSet = orderSet;
    }

    public Integer getDeliveryDays() {
        return deliveryDays;
    }

    public void setDeliveryDays(Integer deliveryDays) {
        this.deliveryDays = deliveryDays;
    }

    public String getNonDeliveryDays() {
        return nonDeliveryDays;
    }

    public void setNonDeliveryDays(String nonDeliveryDays) {
        this.nonDeliveryDays = nonDeliveryDays;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }
}
