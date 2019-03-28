package thread;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * <Description> 原子更新整形属性的更新器<br>
 * 原子更新字段，需要两个步骤：
 * 1.因为原子更新字段类都是抽象类，每次使用时必须使用静态方法newUpdater()创建一个更新器，
 * 并且需要设置想要更新的类和属性
 * 2.更新类的字段(属性)必须使用public volatile修饰符
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月28日 <br>
 * @see thread <br>
 * @since http://www.cnblogs.com/senlinyang/p/7856339.html <br>
 */
public class AtomicIntegerFieldUpdater1 {

    // 创建原子更新器
    private static AtomicIntegerFieldUpdater<User> updater = AtomicIntegerFieldUpdater.newUpdater(User.class, "age");

    public static void main(String[] args) {
        User user = new User("kitty", 12);
        updater.getAndIncrement(user);
        System.out.println(updater.get(user));
    }

    static class User{

        private String name;
        public volatile int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
