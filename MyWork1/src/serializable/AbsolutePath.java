package serializable;

import java.io.File;
import java.util.Scanner;

public class AbsolutePath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
           String path = scanner.next();
            File directory = new File(path);
                System.out.println("Абсолютный: " + directory.isAbsolute());
        }
    }
}
