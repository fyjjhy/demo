package entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * <Description> 缴费记录<br>
 * 
 * @author 工具生成<br>
 * @version 1.0<br>
 * @CreateDate 2018年07月27日 <br>
 * @since V1.0<br>
 * @see com.hbasesoft.vcc.sgp.crm.server.bean.PayInfoRecord <br>
 */
@Getter
@Setter
public class PayInfoRecord extends AbstractVo implements Comparable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1615221804784904371L;

    /** ID */
    private String id;

    /** acct_id */
    private String acctId;

    /** pay_code */
    private String payCode;

    /** charge_type */
    private String chargeType;

    /** bill_type */
    private String billType;

    /** bill_subject */
    private String billSubject;

    /** total_fee */
    private Integer totalFee;

    /** prod_name */
    private String prodName;

    /** prod_detail */
    private String prodDetail;

    /** pay_type */
    private String payType;

    /** pay_model */
    private String payModel;

    /** create_time */
    private Date createTime;

    /** pay_create_time */
    private Date payCreateTime;

    /** update_by */
    private String updateBy;

    /** create_by */
    private String createBy;

    /** remark */
    private String remark;

    /** order_code */
    private String orderCode;

    /** SP_ID */
    private String spId;

    private Integer key;

    @Override
    public int compareTo(Object o) {
        if(o instanceof PayInfoRecord){
            PayInfoRecord infoRecord = (PayInfoRecord) o;
            if (infoRecord.getPayCreateTime().after(this.payCreateTime)) {
                return 1;
            }
            else {
                return -1;
            }
        }
        else {
            throw new ClassCastException("不能转换为 PayInfoRecord 类型的对象...");
        }
    }
}
