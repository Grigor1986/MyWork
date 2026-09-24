package CollectionsFramework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static Integer maxElem(List<Integer> list) {
        int maxElem = 0;
        maxElem = Collections.max(list,null);
        return maxElem;
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(new Integer[]{847, 271, 663, 473, 376, 133, 693, 13, 382, 879});
        System.out.println(maxElem(integerList));
    }
}
