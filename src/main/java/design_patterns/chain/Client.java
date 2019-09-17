package design_patterns.chain;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月17日 <br>
 * @see design_patterns.chain <br>
 * @since V1.0 <br>
 */
public class Client {

//    public static void main(String[] args) {
//        // 组装责任链
//        Handler handler1 = new ConcreteHandler();
//        Handler handler2 = new ConcreteHandler();
//        handler1.setSuccessor(handler2);
//        // 提交请求
//        handler1.handleRequest();
//    }

    public static void main(String[] args) {
        // 组装责任链
        Handler generalManager = new GeneralManager();
        Handler deptManager = new DeptManager();
        Handler projectManager = new ProjectManager();
        projectManager.setSuccessor(deptManager);
        deptManager.setSuccessor(generalManager);

        // 开始测试
        String test1 = projectManager.handleFeeRequest("张三", 300);
        System.out.println("test1 = " + test1);
        String test2 = projectManager.handleFeeRequest("李四", 300);
        System.out.println("test2 = " + test2);
        System.out.println("---------------------------------------");

        String test3 = projectManager.handleFeeRequest("张三", 700);
        System.out.println("test3 = " + test3);
        String test4 = projectManager.handleFeeRequest("李四", 700);
        System.out.println("test4 = " + test4);
        System.out.println("---------------------------------------");

        String test5 = projectManager.handleFeeRequest("张三", 1500);
        System.out.println("test5 = " + test5);
        String test6 = projectManager.handleFeeRequest("李四", 1500);
        System.out.println("test6 = " + test6);
    }
}
