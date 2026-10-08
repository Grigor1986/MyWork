package streamAPI.methodReference;

import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.stream.Stream;

public class MethodReferenceExample {
    public MethodReferenceExample() {
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        FactoryBrick.createBrick();
        Class<FactoryBrick> factoryBrickClass = FactoryBrick.class;
        Method method = factoryBrickClass.getMethods()[0];
        method.invoke(FactoryBrick.class, (Object[])null);
        Stream var10000 = Stream.of(1, 2, 3);
        PrintStream var10001 = System.out;
        Objects.requireNonNull(var10001);
        var10000.forEach(var10001::println);
        System.out.println(method.getName());
    }
}
class FactoryBrick {
    public FactoryBrick() {
    }

    public static void createBrick() {
        System.out.println("кирпич создан");
    }
}
