package serializable;

import java.io.File;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String parent = scanner.next();
            String child = scanner.next();
            File file = new File(parent);
            File targetFile = new File(file, child);
            System.out.println("Путь: " + targetFile.getParent() + "/" + targetFile.getName());
        }
    }
}
