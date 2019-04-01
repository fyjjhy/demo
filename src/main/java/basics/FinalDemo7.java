package basics;

/**
 * <Description> 缓存实例的不可变类<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月01日 <br>
 * @see basics <br>
 * @since V1.0 <br>
 */
public class FinalDemo7 {

    public static void main(String[] args) {
        CacheImmutale cacheImmutale1 = CacheImmutale.valueOf("hello");
        CacheImmutale cacheImmutale2 = CacheImmutale.valueOf("hello");
        System.out.println(cacheImmutale1 == cacheImmutale2);
    }
}
