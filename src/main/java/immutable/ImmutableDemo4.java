package immutable;

import java.util.Objects;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月10日 <br>
 * @see immutable <br>
 * @since V1.0 <br>
 */
public class ImmutableDemo4 {

    private final String name;

    private static ImmutableDemo4[] cache = new ImmutableDemo4[10];

    private static int pos = 0;

    public ImmutableDemo4(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableDemo4 that = (ImmutableDemo4) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    public static ImmutableDemo4 valueOf(String name) {
        // 遍历已缓存的对象
        for (int i = 0; i < pos; i++) {
            // 如果已有相同实例，直接返回该缓存的实例
            if (cache[i] != null && cache[i].getName().equals(name)) {
                return cache[i];
            }
        }
        // 如果缓冲池已满
        if (pos == 10) {
            // 把缓存的第一个对象覆盖
            cache[0] = new ImmutableDemo4(name);
            pos = 1;
            return cache[0];
        }
        else {
            // 把新创建的对象缓存起来，pos加1
            cache[pos++] = new ImmutableDemo4(name);
            return cache[pos - 1];
        }


    }

    public static void main(String[] args) {
        ImmutableDemo4 immutableDemo4 = ImmutableDemo4.valueOf("hello");
        ImmutableDemo4 immutableDemo41 = ImmutableDemo4.valueOf("hello");
        System.out.println(immutableDemo4 == immutableDemo41);
    }
}
