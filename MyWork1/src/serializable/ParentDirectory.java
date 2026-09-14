package serializable;

import java.io.File;
import java.util.Scanner;

public class ParentDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
                String path = scanner.next();
                File file = new File(path);
                String fileParent = file.getParent();
            System.out.println("Родитель: " + fileParent);
        }
    }
}
