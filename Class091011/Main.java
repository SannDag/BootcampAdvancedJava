//Apply one behavioral pattern seen during session 9 to one of the previous projects
//and explain why you chose that particular pattern.

//-I chose to apply the Factory Method to encapsulate the creation of objects in a new class called UserFactory

//Apply refactoring to any of the projects that have been covered in the course,
//remember to make use of the techniques seen in class including design patterns.

package Class091011;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserFactory factory = new UserFactory();
        List<User> users = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            users.add(factory.createUser("User " + (i+1), 18 + i*2));
        }

        for (User user : users){
            System.out.println("The User is: " + user.getName());
        }

    }
}