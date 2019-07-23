package buffer;

import java.nio.IntBuffer;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年07月21日 <br>
 * @see buffer <br>
 * @since V1.0 <br>
 */
public class BufferDemo1 {

    public static void main(String[] args) {
        /** 第一步：获取IntBuffer，通过IntBuffer.allocate操作 */
        // 准备出10个大小的缓冲区
        IntBuffer buffer = IntBuffer.allocate(10);
        /** 第二步：未操作前输出属性值 */
        System.out.println("position=" + buffer.position() + ", limit=" + buffer.limit() + ", capacity=" + buffer.capacity());
        /** 第三步：进行设置数据 */
        buffer.put(6);
        buffer.put(16);
        /** 第四步：操作后输出属性值 */
        System.out.println("position=" + buffer.position() + ", limit=" + buffer.limit() + ", capacity=" + buffer.capacity());
        /** 第五步：将Buffer从写模式切换到读模式position=0，limit=原position */
        buffer.flip();
        /** 第六步：操作后输出属性值 */
        System.out.println("position=" + buffer.position() + ", limit=" + buffer.limit() + ", capacity=" + buffer.capacity());
    }
}
