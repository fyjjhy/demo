package design_patterns.iterator;

/**
 * <Description> 抽象迭代子角色类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月20日 <br>
 * @see design_patterns.iterator <br>
 * @since V1.0 <br>
 */
public interface Iterator_White {

    // 迭代方法：移动到第一个元素
    public void first();

    // 迭代方法：移动到下一个元素
    public void next();

    // 迭代方法：是否为最后一个元素
    public boolean isDone();

    // 迭代方法：返还当前元素
    public Object currentItem();
}
