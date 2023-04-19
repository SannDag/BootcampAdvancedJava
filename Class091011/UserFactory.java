package Class091011;

public class UserFactory {
    public User createUser(String name, int age){
        return new User(name, age);
    }
}
