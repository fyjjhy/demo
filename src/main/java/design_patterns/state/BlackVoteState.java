package design_patterns.state;

/**
 * <Description> 具体状态类--黑名单<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月18日 <br>
 * @see design_patterns.state <br>
 * @since V1.0 <br>
 */
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 记录黑名单中，禁止登陆系统
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
