package entity;

import lombok.Getter;
import lombok.Setter;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/4/9
 * @see entity <br>
 * @since V1.0<br>
 */
@Getter
@Setter
public class Consumer2 extends AbstractVo implements Runnable {

	private static final long serialVersionUID = -2982131123476252793L;

	// 每次消费的产品数量
	private int num;

	// 所在放置的仓库
	private Storage storage;

	// 构造函数，设置仓库
	public Consumer2(Storage storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		storage.consume(num);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}
}
