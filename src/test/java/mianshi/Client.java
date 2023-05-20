package mianshi;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<SortA> list = new ArrayList<>();
        list.add(new SortA(9));
        list.add(new SortA(7));
        list.add(new SortA(5));
        list.add(new SortA(99));

        list.sort((o1, o2) -> o2.sortValue - o1.sortValue);
        System.out.println(list);
    }
}
