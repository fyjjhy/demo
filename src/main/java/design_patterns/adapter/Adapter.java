//package design_patterns.adapter;
//
///**
// * <Description> <br>
// *
// * @author 付永杰<br>
// * @version 1.0<br>
// * @taskId <br>
// * @CreateDate 2019年09月07日 <br>
// * @see design_patterns.adapter <br>
// * @since V1.0 <br>
// */
//public class Adapter extends Adaptee implements Target {
//    // 目标接口要求调用request()，但源类Adaptee没有request()
//    // 因此适配器需要补充这个方法名
//    // 但实际上request()只是调用源类Adaptee的specificRequest()
//    // 所以适配器只是将specificRequest()作了一层封装，封装成Target可以调用的request()而已
//    @Override
//    public void request() {
//        this.specificRequest();
//    }
//}
