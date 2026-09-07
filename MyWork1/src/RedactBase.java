import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class RedactBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listFamily = new ArrayList<>();
        listFamily.add("Иванов");
        listFamily.add("Петров");
        listFamily.add("Сидоров");
        int index = scanner.nextInt();
        String newWork = scanner.next();
        String oldWork = listFamily.get(index);
        listFamily.set(index, newWork);
        System.out.println("Удалено: " + oldWork + ", База: " + listFamily);
    }
}
