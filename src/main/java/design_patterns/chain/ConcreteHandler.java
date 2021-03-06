package design_patterns.chain;

/**
 * <Description> 具体处理者角色<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月16日 <br>
 * @see design_patterns.chain <br>
 * @since V1.0 <br>
 */
public class ConcreteHandler extends Handler {
    /**
     * Description: 处理方法，调用此方法处理请求<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param 
     * @return <br>
     */
    @Override
    public void handleRequest() {
        // 判断是否有后继责任对象，如果有，就转发请求给后继的责任对象，如果没有，则处理请求
        if (getSuccessor() != null) {
            System.out.println("放过请求");
            getSuccessor().handleRequest();
        }
        else {
            System.out.println("处理请求");
        }
    }

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        //项目经理权限比较小，只能在500以内
        if (fee < 500) {
            //为了测试，简单点，只同意张三的请求
            if ("张三".equals(user)) {
                str = "成功：项目经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            }
            else {
                //其他人一律不同意
                str = "失败：项目经理不同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            }
        }
        else {
            //超过500，继续传递给级别更高的人处理
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return str;
    }
}
