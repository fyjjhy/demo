package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月11日 <br>
 * @see collection <br>
 * @since V1.0 <br>
 */
class MyList implements Iterable<MyList.Entry> {

    private List<Entry> entries = new ArrayList();

    @Override
    public Iterator<Entry> iterator() {
        return entries.iterator();
    }

    public static class Entry {
        private int id;
        private String name;

        public Entry(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public List<Entry> getEntries() {
        return entries;
    }
}
