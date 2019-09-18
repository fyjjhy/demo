package design_patterns.state;

/**
 * <Description> 抽象状态类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月18日 <br>
 * @see design_patterns.state <br>
 * @since V1.0 <br>
 */
public interface VoteState {

    /**
     * Description: 处理状态对应的行为<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param user 投票人
     * @param voteItem 投票项
     * @param voteManager 投票上下文，用来在实现状态对应的功能处理的时候，可以调用上下文的数据
     * @return <br>
     */
    public void vote(String user, String voteItem, VoteManager voteManager);
}
