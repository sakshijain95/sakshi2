package Assignment4;

import java.util.Comparator;
import java.util.TreeMap;

public class Forth {


    TreeMap<Integer,String> map = new TreeMap<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer t0, Integer t1) {
            return t1-t0;

        }
    });

}
