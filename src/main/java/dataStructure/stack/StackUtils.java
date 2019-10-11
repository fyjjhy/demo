package dataStructure.stack;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年10月07日 <br>
 * @see dataStructure.stack <br>
 * @since V1.0 <br>
 */
public class StackUtils {

    public static SqStack<?> sqStack;

    // 弹栈出所有元素
    public static Object[] popAll(SqStack<?> stack) {
        sqStack = stack;
        if (sqStack.isNull()) {
            return null;
        }
        else {
            Object[] array = new Object[sqStack.getTop() + 1];
            int i = 0;
            while (!sqStack.isNull()) {
                array[i] = sqStack.pop();
                i++;
            }
            return array;
        }
    }

    // 使用栈进行进制转换
    public static String integerToNhex(Integer num, int hex) {
        // 对传入的进制进行判断
        if (hex <= 0 || hex > 36) {
            return "请输入有效的进制";
        } else if (num == 0) {
            return "0";
        } else if (num > 0) {
            SqStack<Integer> stack = new SqStack<>(16);
            int index = num;
            while (num != 0) {
                num = num / hex;
                // 取余压栈
                int remainder = index % hex;
                stack.push(remainder);
                index = num;
            }
            // 弹栈取出余数
            Object[] objs = popAll(stack);
            StringBuilder stringBuilder = new StringBuilder();
            for (Object obj : objs) {
                int in = (int) obj;
                // 取出的数字如果>=10需要用字母代替
                if (in >= 10) {
                    char c = (char) ('a' + in - 10);
                    stringBuilder.append(c);
                }
                else {
                    stringBuilder.append(in);
                }
            }
            return stringBuilder.toString();
        }
        else {
            num = -num;
            SqStack<Integer> stack = new SqStack<>(16);
            int index = num;
            while (num != 0) {
                num = num / index;
                // 取余压栈
                int remainder = index % hex;
                stack.push(remainder);
                index = num;
            }
            // 弹栈取出余数
            Object[] objs = popAll(stack);
            StringBuilder stringBuilder = new StringBuilder();
            // 添加负号
            stringBuilder.append("-");
            for (Object obj : objs) {
                int in = (int) obj;
                // 取出的数字如果>=10需要用字母代替
                if (in >= 10) {
                    char c = (char) ('a' + in - 10);
                    stringBuilder.append(c);
                }
                else {
                    stringBuilder.append(in);
                }
            }
            return stringBuilder.toString();
        }
    }
}
