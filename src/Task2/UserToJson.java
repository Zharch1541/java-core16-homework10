package Task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserToJson {

    public static void main(String[] args) throws IOException {
        File file = new File("src/Task2/file.txt");
        InputStream inputStream = new FileInputStream(file);
        Scanner scanner = new Scanner(inputStream);

        List<User> users = new ArrayList<>();

        // read from file and add to list
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] array = line.split(" ");
            String name = array[0];

            try {
                int age = Integer.parseInt(array[1]);
                User user = new User(name, age);
                users.add(user);
            } catch (NumberFormatException ignored) {
            }
        }

        scanner.close();
        inputStream.close();

        // write to file
        WriterToJsonFile writer = new WriterToJsonFile(users);
        writer.saveToFile("user.json");
    }
}
