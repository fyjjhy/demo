package collection;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年07月30日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
public class SetDemo2 {

    public static void main(String[] args) {
        Set<String> ips = new HashSet<>();
        ips.add("127.0.0.1");
        ips.add("255.255.255.255");
        System.out.println(StringUtils.join(ips, ","));

        List<String> list = new ArrayList<>();
        list.add("127.0.0.1");
        System.out.println(StringUtils.join(list));
    }
}
