package extendsAndSuper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年03月02日 <br>
 * @see extendsAndSuper <br>
 * @since V1.0 <br>
 */
public class ExtendsAndSuper {

    public static void main(String[] args) {
//        List<? extends Father> list = new ArrayList<>();
//        List<Son> sonList = new ArrayList<>();
//        sonList.add(new Son());
//        list = sonList;
//        Father father = list.get(0);
//        System.out.println(father);

        List<? super Father> list = new ArrayList<>();
        list.add(new Father());
        list.add(new Son());
        list.add(new LeiFeng());
//        list.add(new Human());// error
//        Father father = list.get(0); // error
        Object obj = list.get(0);
    }
}

class Human {

}

class Father extends Human {

}

class Son extends Father {

}

class LeiFeng extends Father {

}
