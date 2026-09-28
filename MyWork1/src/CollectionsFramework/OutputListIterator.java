package CollectionsFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class OutputListIterator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        Collections.addAll(list, reader.readLine().split(" "));
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.startsWith("J")) {
                iterator.set(element.substring(1));
            } else {
                iterator.remove();
            }
        }
ListIterator<String> reverseIterator = list.listIterator(list.size());
        while (reverseIterator.hasPrevious()) {
            System.out.println(reverseIterator.previous());
        }
    }
}
