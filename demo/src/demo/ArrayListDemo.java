package demo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("test");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        arrayList.remove(0);
        System.out.println(arrayList);
    }
}
