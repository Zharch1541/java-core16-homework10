package Task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriterToJsonFile {
    private List<User> users;

    public WriterToJsonFile(List<User> users) {
        this.users = users;
    }

    public void saveToFile(String fileName) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(users);

        try {
            FileWriter write =  new FileWriter(fileName);
            write.write(json);
            write.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

