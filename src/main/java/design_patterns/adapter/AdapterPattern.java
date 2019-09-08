package design_patterns.adapter;

/**
 * <Description> 定义具体目标类，并通过Adapter类调用所需要的方法从而实现目标(不需要通过原有插头)--类的适配器模式<br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年09月07日 <br>
 * @see design_patterns.adapter <br>
 * @since V1.0 <br>
 */
//通过Adapter类从而调用所需要的方法
public class AdapterPattern {

    public static void main(String[] args) {
        Target adapter220v = new Adapter220v();
        AdapterPattern adapterPattern = new AdapterPattern();
        ImportedMachine importedMachine = adapterPattern.new ImportedMachine();
        //用户拿着进口机器插上适配器（调用convert_110v()方法）
        //再将适配器插上原有插头（Convert_110v()方法内部调用Output_220v()方法输出220V）
        //适配器只是个外壳，对外提供110V，但本质还是220V进行供电
        adapter220v.convert_110v();
        importedMachine.work();

    }

    //进口机器类
    class ImportedMachine{

        public void work() {
            System.out.println("进口机器正常运行");
        }
    }
}
