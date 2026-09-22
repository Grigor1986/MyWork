package collections;

import java.util.*;

public class CollectionLists {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();

        listA.add("element 0");
        listA.add("element 1");
        listA.add("element 2");

        String element0 = listA.get(0);
        String element1 = listA.get(1);
        String element3 = listA.get(2);

        Iterator iterator = listA.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Object object : listA) {
            String element = (String) object;
            System.out.println(element);
        }

        for(int i = 0; i< listA.size(); i++){
        System.out.println(listA.get(i));
        }

        ArrayList<Integer> listB = new ArrayList<>();
        listB.addAll(Arrays.asList(200, 300 ,400));
        Collections.sort(listB, (o1, o2) -> o2.compareTo(o1));
        System.out.println(listB);
        Collections.sort(listB);
        System.out.println(listB);

        listB.removeIf(i -> i < 300);
        listB.stream().filter(i -> i <= 200);
        System.out.println(listB);
    }
}
