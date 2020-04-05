

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Den",22);
        User user2 = new User ("Andrey ",26);
        User user3 = new User("Daria", 25);
        FileStorage storage = new FileStorage("Test");
        storage.addUser(user1);
        storage.addUser(user2);
        storage.addUser(user3);
        storage.removeUser(1);
        System.out.println(storage.getAllUsers());
    }
}
