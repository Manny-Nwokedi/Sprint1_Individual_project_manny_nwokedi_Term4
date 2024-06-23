
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        users.add(new User("Dann Florick"));
        users.add(new User("Richard Belzer"));
        users.add(new User("Mariska Smith"));
        users.add(new User("Lewis Poe"));

        // Adding tasks to users
        users.get(0).addTask("Develop software application");
        users.get(0).addTask("Participate in agile development process");
        users.get(1).addTask("Apply user-centered design principles");
        users.get(1).addTask("Code software applications");
        users.get(2).addTask("Test software applications");
        users.get(2).addTask("Debug software applications");
        users.get(3).addTask("Contribute to software development");

        // Marking some tasks as completed
        users.get(0).markTaskAsCompleted("Develop software application");
        users.get(1).markTaskAsCompleted("Code software applications");

        // Printing tasks for each user
        for (User user : users) {
            user.printTasks();
            System.out.println();
        }
    }
}