package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019/5/19
 * @see stream <br>
 * @since V1.0<br>
 */
public class MapMapToObj {

	public static void main(String[] args) {
		IntStream.of(4, 5, 6).mapToObj(e -> e * 10).forEach(System.out::println);
		Stream.of(4, 5, 6).mapToInt(e -> e * 10).forEach(System.out::println);
	}
}
