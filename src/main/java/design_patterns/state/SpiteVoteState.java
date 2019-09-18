package design_patterns.state;

import org.apache.commons.lang3.StringUtils;

/**
 * <Description> 具体状态类--恶意刷票<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月18日 <br>
 * @see design_patterns.state <br>
 * @since V1.0 <br>
 */
public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        // 恶意投票，取消用户的投票资格，并取消投票记录
        String str = voteManager.getMapVote().get(user);
        if (StringUtils.isNotEmpty(str)) {
            voteManager.getMapVote().remove(user);
        }System.out.println("你有恶意刷屏行为，取消投票资格");
    }
}
