package design_patterns.state;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月18日 <br>
 * @see design_patterns.state <br>
 * @since V1.0 <br>
 */
public class VoteClient {

    public static void main(String[] args) {
        VoteManager voteManager = new VoteManager();
        for (int i = 0; i < 9; i++) {
            voteManager.vote("ul", "A");
        }
    }
}
