package design_patterns.iterator;

/**
 * <Description> 抽象聚集角色类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月20日 <br>
 * @see design_patterns.iterator <br>
 * @since V1.0 <br>
 */
public abstract class Aggregate_Black {

    // 工厂方法，创建相应迭代子对象接口
    abstract Iterator_Black createIterator();
}
