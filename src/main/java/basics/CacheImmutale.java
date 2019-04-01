package basics;

import org.apache.commons.lang.StringUtils;

import java.util.Objects;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月01日 <br>
 * @see basics <br>
 * @since https://www.cnblogs.com/yumiaoxia/p/9010721.html <br>
 */
public class CacheImmutale {

    private static int MAX_SIZE = 10;

    // 使用数组来缓存已有的实例
    private static CacheImmutale[] cacheImmutales = new CacheImmutale[MAX_SIZE];
    // 记录缓存实例在缓存中的位置，cache[pos-1]是最新的实例
    private static int pos = 0;
    private final String name;

    private CacheImmutale(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static CacheImmutale valueOf(String name) {
        // 遍历缓存的对象
        for (int i = 0; i < MAX_SIZE; i++) {
            // 如果有相同实例，则直接返回该缓存的实例
            if (cacheImmutales[i] != null && cacheImmutales[i].getName().equals(name)) {
                return cacheImmutales[i];
            }
        }

        // 如果缓存池已满
        if (pos == MAX_SIZE) {
            // 把缓存的一个对象覆盖，即把刚刚生成的对象放在缓存池的最开始位置
            cacheImmutales[0] = new CacheImmutale(name);
            pos = 1;
        }
        else {
            // 把新的对象缓存起来，pos+1
            cacheImmutales[pos++] = new CacheImmutale(name);
        }
        return cacheImmutales[pos  - 1];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CacheImmutale that = (CacheImmutale) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
