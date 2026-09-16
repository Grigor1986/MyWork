package serializable;

import java.io.*;
import java.util.Scanner;

public class Token implements Serializable {
    private String id;
    transient String secret;

    public Token(String id, String secret) {
        this.id = id;
        this.secret = secret;
    }

    @Override
    public String toString() {
        return  id + ", Secret: " + secret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext())
            return;
        String id = scanner.next();
        String secret = scanner.nextLine();
        Token token = new Token(id, secret);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(token);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte [] serializedData = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(serializedData);
        try (ObjectInputStream ois = new ObjectInputStream(bais)) {
            Token restored = (Token) ois.readObject();
            System.out.println("ID: " + restored);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
