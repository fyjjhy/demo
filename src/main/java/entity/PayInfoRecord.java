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
 * @see PayInfoRecord <br>
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillSubject() {
        return billSubject;
    }

    public void setBillSubject(String billSubject) {
        this.billSubject = billSubject;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDetail() {
        return prodDetail;
    }

    public void setProdDetail(String prodDetail) {
        this.prodDetail = prodDetail;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayModel() {
        return payModel;
    }

    public void setPayModel(String payModel) {
        this.payModel = payModel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayCreateTime() {
        return payCreateTime;
    }

    public void setPayCreateTime(Date payCreateTime) {
        this.payCreateTime = payCreateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

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
