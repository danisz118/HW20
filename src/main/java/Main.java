

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Den", 22);
        User user2 = new User("Andrey", 23);
        User user3 = new User("Daria", 23);
        FileStorage storage = new FileStorage("File.Storage");
        storage.addUser(user1);
        storage.addUser(user2);
        storage.addUser(user3);
        System.out.println(storage.getAllUsers());
    }
}
