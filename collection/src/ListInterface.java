import  java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Everyone");
        System.out.println(list);;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);
        System.out.println(arrayList);

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.addFirst("First");
        linkedList.addLast("Somewhere");
        System.out.println(linkedList);

        
    }



}
