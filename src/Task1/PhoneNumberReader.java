package Task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneNumberReader {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\38063\\IdeaProjects\\Homework10\\src\\Task1\\phone.txt");

        InputStream fileInputStream = new FileInputStream(file);

        Scanner scanner = new Scanner(fileInputStream);

        List<String> validNumbers = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String number = scanner.nextLine();
            if (PhoneNumberValidator.isValidNumber(number)) {
                validNumbers.add(number);
            }
        }

            scanner.close();
            fileInputStream.close();

            for (String num: validNumbers) {
                System.out.println(num);
            }
        }
    }



