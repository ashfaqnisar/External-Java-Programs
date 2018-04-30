import java.util.*;
public class ArrayManipulation {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        System.out.println(list);

        list.add("Ashfaq");
        list.add(0,"Mohammed");
        list.addLast("Nisar");

        System.out.println(list);

        list.remove(0);

        list.addFirst("Mohammed");

        String S1 = list.element();
        System.out.println(S1);

        String S2 = list.get(1);
        System.out.println(S2);

        String S3 = list.peekLast();
        System.out.println(S3);

        System.out.println(list.hashCode());

        System.out.println(Arrays.toString(list.toArray()));
    }
}
