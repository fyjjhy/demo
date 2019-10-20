package entity;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月25日 <br>
 * @see entity <br>
 * @since V1.0 <br>
 */
public class GoodsOrder extends AbstractVo {
    private static final long serialVersionUID = -7833259275700669984L;

    private String goodsPrice;

    private String goodsNumber;

    private String goodsCode;

    private Integer discountPrice;

    public GoodsOrder(String goodsPrice, String goodsNumber, String goodsCode) {
        this.goodsPrice = goodsPrice;
        this.goodsNumber = goodsNumber;
        this.goodsCode = goodsCode;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public Integer getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Integer discountPrice) {
        this.discountPrice = discountPrice;
    }
}
