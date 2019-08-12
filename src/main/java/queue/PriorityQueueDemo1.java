//package queue;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//import lombok.Setter;
//
//import java.util.PriorityQueue;
//
///**
// * <Description> PriorityQueue<br>
// * 【描述】
// * 入队并不是按顺序的，出队是按照顺序出队的
// * @author 付永杰<br>
// * @version 1.0<br>
// * @taskId <br>
// * @CreateDate 2019年04月05日 <br>
// * @see queue <br>
// * @since V1.0 <br>
// */
//public class PriorityQueueDemo1 {
//
//    public static void main(String[] args) {
//        final PriorityQueue<Student> queue = new PriorityQueue<>();
//        Student p1=new Student(95,"张三");
//        Student p2=new Student(89,"李四");
//        Student p3=new Student(89,"李四");
//        Student p4=new Student(67,"王五");
//        Student p5=new Student(92,"赵六");
//        queue.add(p1);
//        queue.add(p2);
//        queue.add(p3);//add 和offer效果一样。
//        queue.offer(p4);//add 方法实现，其实就是调用了offer
//        queue.offer(p5);
//
//        for (Student student: queue) {
//            System.out.println(student);
//        }
//
//        System.out.println("--------------------");
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }
//    }
//
//    @Getter
//    @Setter
//    @AllArgsConstructor
//    private static class Student implements Comparable<Student> {
//
//        private int score;
//
//        private String name;
//
//        @Override
//        public String toString() {
//            return "姓名：" + name + "，分数：" + score;
//        }
//
//        @Override
//        public int compareTo(Student o) {
//            Student student = (Student) o;
//            if (student.score > this.score) {
//                return 1;
//            }
//            else if (student.score == this.score) {
//                return 0;
//            }
//            return -1;
//        }
//
//        public int getScore() {
//            return score;
//        }
//
//        public void setScore(int score) {
//            this.score = score;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//    }
//}
