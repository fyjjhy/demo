package lock;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年08月18日 <br>
 * @see lock <br>
 * @since V1.0 <br>
 */
public class LiveLockDemo01 {
    // 定义一个勺子，owner表示这个勺子的拥有者
    static class Spoon {
        // 勺子的拥有者
        Diner owner;

        public Spoon(Diner owner) {
            this.owner = owner;
        }

        // 获取拥有者
        public String getOwnerName() {
            return owner.getName();
        }

        // 设置拥有者
        public void setOwner(Diner diner) {
            this.owner = diner;
        }

        // 表示正在用餐
        public void use() {
            System.out.println(owner.getName() + "use this spoon and finish eat.");
        }
    }

    // 定义一个晚餐类
    static class Diner {
        // 是否饿了
        private boolean isHungry;

        // 定义当前用餐者的名字
        private String name;

        public Diner(boolean isHungry, String name) {
            this.isHungry = isHungry;
            this.name = name;
        }

        // 获取当前用餐者
        public String getName() {
            return name;
        }

        public boolean isHungry() {
            return isHungry;
        }

        // 可以理解为和某人吃饭
        public void eatWith(Diner spouse, Spoon sharedSpoon) {
            System.out.println("spouse: name = " + spouse.getName() + ", isHungry = " + spouse.isHungry() + "; sharedSpoon: owner = " + sharedSpoon.getOwnerName());
            System.out.println("name: " + name + ", isHungry: " + isHungry);
            try {
                synchronized (sharedSpoon) {
                    while (isHungry) {
                        // 当前用餐者和勺子拥有者不是同一个人，则进行等待
                        while (!sharedSpoon.getOwnerName().equals(name)) {
                            sharedSpoon.wait();
                            System.out.println("sharedSpoon belongs to " + sharedSpoon.getOwnerName());
                        }
                        // spouse此时饿了，把勺子给他，并通知他可以用餐
                        if (spouse.isHungry) {
                            System.out.println("I am " + name + ", and my " + spouse.getName() + " is hungry, I should give it to him(her).\n");
                            sharedSpoon.setOwner(spouse);
                            sharedSpoon.notifyAll();
                        }
                        else {
                            // 用餐
                            sharedSpoon.use();
                            sharedSpoon.setOwner(spouse);
                            isHungry = false;
                        }
                        Thread.sleep(500);
                    }
                }
            } catch (InterruptedException e) {
                System.out.println(name + "is interrupted");
            }
        }
    }

    public static void main(String[] args) {
        // 创建一个丈夫用餐类
        final Diner husband = new Diner(true, "husband");
        // 创建一个妻子用餐类
        final Diner wife = new Diner(true, "wife");
        // 创建一个勺子，初始状态并由妻子持有
        final Spoon sharedSpoon = new Spoon(wife);

        // 创建一个线程，由丈夫进行用餐
        Thread h = new Thread(){
            @Override
            public void run() {
                // 表示和妻子用餐，这个过程判断妻子是否饿了，如果是，则会把勺子分给妻子，并通知她
                husband.eatWith(wife, sharedSpoon);
            }
        };
        h.start();

        // 创建一个线程，由妻子进行用餐
        Thread w = new Thread() {
            @Override
            public void run() {
                // 表示和妻子用餐，这个过程判断丈夫是否饿了，如果是，则会把勺子分给丈夫，并通知他
                wife.eatWith(husband, sharedSpoon);
            }
        };
        w.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        h.interrupt();
        w.interrupt();

        try {
            // join()阻塞调用此方法的线程(calling thread)，直到线程t完成，此线程再继续；通常用于main主线程内，等待其他线程完成再结束main()主线程。
            h.join();
            w.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
