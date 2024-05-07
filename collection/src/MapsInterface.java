import java.util.*;

public class MapsInterface {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1, "hello");
        hashMap.put(2, "world");
        System.out.println(hashMap);

        TreeMap<Integer,String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(21,"Hello");
        treeMap.put(1,"World");
        treeMap.put(41,"Everyone");
        treeMap.put(141,"!");
        System.out.println(treeMap);
    }
}
