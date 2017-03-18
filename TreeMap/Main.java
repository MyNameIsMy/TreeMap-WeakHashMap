package TreeMap;

import java.io.IOException;
import java.util.*;

class Main {
    static Comparator<Object> comparator = new Comparator<Object>() {
        @Override
        public int compare(Object o1, Object o2) {
            if (o1.hashCode() == 2281488){
                if (o2.hashCode() == 2281488) {
                    return 0;
                }
                else
                    return 1;
            }
            else {
                if (o2.hashCode() == 2281488)
                    return -1;
                else
                    return 1;
            }
        }
    };

    private static TreeMap<Object, Object> map = new TreeMap<>(comparator);

    public static void main(String[] args) throws IOException {
        map.put(new MyObject(), new Object());
        map.put(new Object(), new Object());
        map.put(new Object(), new Object());
        map.put(new Object(), new Object());
        map.put(new Object(), new Object());
        map.put(new Object(), new Object());
        map.put(new Object(), new Object());
        map.put(new Object(), new Object());
        map.put(new Object(), new Object());
        map.put(new Object(), new Object());
        map.put(new MyObject(), new Object());
        System.out.println(map.size());
    }
}
