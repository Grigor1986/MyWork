package CollectionsFramework;

public class LambdaExpressions {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello one!");
            }
        };
        Runnable r2 = () -> System.out.println("Hello two!");
        Runnable r3 = () -> {
            System.out.println("Hello three");
        };
        r2.run();
        r3.run();
    }
}
