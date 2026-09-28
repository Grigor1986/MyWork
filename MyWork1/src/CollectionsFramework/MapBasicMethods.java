package CollectionsFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MapBasicMethods {

    public static Map<String, String> mapShare(Map<String, String> map) {
if(map.containsKey("a")) {
    map.put("b", map.get("a"));
        }
map.remove("c");
        return map;
    }

    public static void main(String[] args) throws IOException {
            mapShare(Arrays.stream(new BufferedReader(new InputStreamReader(System.in)).readLine()
                    .split(",")).map(s->s.split(":"))
                    .collect(Collectors.toMap(p -> p[0], p -> p[1])))
                    .forEach((s, s2) -> System.out.println(s+" : "+s2));
        }


}

