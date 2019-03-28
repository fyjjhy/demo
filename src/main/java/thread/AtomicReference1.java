package thread;

import java.util.concurrent.atomic.AtomicReference;

/**
 * <Description> 原子更新引用类型<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月28日 <br>
 * @see thread <br>
 * @since V1.0 <br>
 */
public class AtomicReference1 {

    private static AtomicReference<User> atomicReference = new AtomicReference<User>();

    public static void main(String[] args) {
        User user = new User("tom", 23);
        atomicReference.set(user);
        User updateUser = new User("jack", 34);
        atomicReference.compareAndSet(user, updateUser);
        System.out.println(atomicReference.get().getName());
        System.out.println(atomicReference.get().getAge());
    }

    static class User {

        private String name;

        private int age;

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
