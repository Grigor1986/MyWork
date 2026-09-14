package serializable;

import java.io.File;
import java.util.Scanner;

public class Extract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String path = scanner.next();
            File file = new File(path);
            String fileName = file.getName();
            int lastIndexOf = fileName.lastIndexOf('.');
if (lastIndexOf > 0 && lastIndexOf < fileName.length() - 1) {
    String extension = fileName.substring(lastIndexOf + 1);
    System.out.println("Расширение: " + extension );
} else {
    System.out.println("Расширение: нет");
}
        }
    }
}
