import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileStorage implements Storage {
    private String file;
    private int id;
    private Map<Integer,String> usersStorage = new HashMap<>();
    Gson gson = new Gson();
    public FileStorage(String file){
        this.file=file;
        usersTOJson();
    }

    private void usersTOJson() {
        saveToFile(gson.toJson(usersStorage));
    }

    private void saveToFile(String toJson) {
        try {
            FileWriter writer = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void removeAll() {

    }

    @Override
    public void removeUser(int id) {

    }

    @Override
    public void removeUserByName(String name) {

    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
