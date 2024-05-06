import java.util.*;

public class Set {

    public static void main(String[] args) {
        int count[] = {21, 23, 42, 521,15,21, 152};
        HashSet<Integer> setHash = new HashSet<Integer>();
        TreeSet<Integer> setTree = new TreeSet<Integer>();


        for (int j : count) {
            setHash.add(j);
            setTree.add(j);
        }

        System.out.println(setHash); //set
        System.out.println(setTree); //already sorted



    }
}