package serializable;

import java.io.*;

public class InputOutput {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
String line = reader.readLine();
if(line != null) {
    writer.write(line.toUpperCase());
    writer.flush();
}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
