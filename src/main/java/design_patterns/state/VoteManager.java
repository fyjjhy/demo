package design_patterns.state;

import java.util.HashMap;
import java.util.Map;

/**
 * <Description> 环境类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月18日 <br>
 * @see design_patterns.state <br>
 * @since V1.0 <br>
 */
public class VoteManager {

    // 持有状态处理对象
    private VoteState voteState = null;

    // 记录用户投票的结果，Map<String, String>对应Map<用户名称, 投票的票项>
    private Map<String, String> mapVote = new HashMap<>();

    // 记录用户投票次数, Map<String, Integer>对应Map<用户名称, 投票的次数>
    private Map<String, Integer> mapVoteCount = new HashMap<>();

    public Map<String, String> getMapVote() {
        return mapVote;
    }

    public void vote(String user, String voteItem) {
        // 1.为用户增加投票次数
        // 从记录中取出该用户已有的投票次数
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }
        oldVoteCount += 1;
        mapVoteCount.put(user, oldVoteCount);

        // 2.判断该用户的投票类型，就相当于判断对应的状态
        // 到底是正常投票、重复投票、恶意投票还是黑名单的状态
        if (oldVoteCount == 1) {
            voteState = new NormalVoteState();
        } else if (oldVoteCount > 1 && oldVoteCount < 5) {
            voteState = new RepeatVoteState();
        } else if (oldVoteCount >= 5 && oldVoteCount < 8) {
            voteState = new SpiteVoteState();
        } else if (oldVoteCount >= 8) {
            voteState = new BlackVoteState();
        }
        // 然后转调状态对象来进行相应的操作
        voteState.vote(user, voteItem, this);
    }

}
