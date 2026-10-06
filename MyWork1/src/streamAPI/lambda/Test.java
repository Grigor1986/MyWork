package streamAPI.lambda;

public class Test {
    private String message = "outer";

    public void run() {
        Runnable r = new Runnable() {
            private String message = "anonymous";
            @Override
            public void run() {
                System.out.println(this.message);
            }
        };
        r.run();
    }
//Выведет анонимус, тк внешнее поле затрется
    public static void main(String[] args) {
        new Test().run();
    }
}
